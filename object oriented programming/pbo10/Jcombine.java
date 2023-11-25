import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class Jcombine {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combined Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat instance dari JDesktopPane
        JDesktopPane desktopPane = new JDesktopPane();

        // Membuat jendela internal pertama
        JInternalFrame internalFrame1 = new JInternalFrame("Jendela Internal 1", true, true, true, true);
        internalFrame1.setBounds(50, 50, 200, 150);
        internalFrame1.setVisible(true);
        JLabel label1 = new JLabel("Ini adalah Jendela Internal 1");
        internalFrame1.add(label1);
        desktopPane.add(internalFrame1);

        // Membuat jendela internal kedua
        JInternalFrame internalFrame2 = new JInternalFrame("Jendela Internal 2", true, true, true, true);
        internalFrame2.setBounds(100, 100, 200, 150);
        internalFrame2.setVisible(true);
        JLabel label2 = new JLabel("Ini adalah Jendela Internal 2");
        internalFrame2.add(label2);
        desktopPane.add(internalFrame2);

        // Membuat objek JEditorPane dan menampilkannya dalam jendela internal ketiga
        JInternalFrame internalFrame3 = new JInternalFrame("JEditorPane Example", true, true, true, true);
        internalFrame3.setBounds(150, 150, 400, 300);
        internalFrame3.setVisible(true);

        JEditorPane editorPane = new JEditorPane();
        try {
            editorPane.setPage(new URL("http://www.example.com"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JScrollPane scrollPane = new JScrollPane(editorPane);
        internalFrame3.add(scrollPane);
        desktopPane.add(internalFrame3);

        // Menambahkan JDesktopPane ke dalam JFrame
        frame.add(desktopPane);

        // Mengatur operasi default saat tombol close di klik
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan JFrame
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
