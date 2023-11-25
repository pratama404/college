import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Jcombineeditor {
public static void main(String[] args) {
// Membuat instance dari JFrame
JFrame frame = new JFrame("Contoh JDesktopPane dan JInternalFrame");
// Membuat instance dari JDesktopPane
JDesktopPane desktopPane = new JDesktopPane();
// Membuat jendela internal pertama
JInternalFrame internalFrame1 = new JInternalFrame("Jendela Internal 1", true, true, true,
true);
internalFrame1.setBounds(50, 50, 200, 150);
internalFrame1.setVisible(true);
JLabel label1 = new JLabel("Ini adalah Jendela Internal 1");
internalFrame1.add(label1);
desktopPane.add(internalFrame1);
// Membuat jendela internal kedua
JInternalFrame internalFrame2 = new JInternalFrame("Jendela Internal 2", true, true, true,
true);
internalFrame2.setBounds(100, 100, 200, 150);
internalFrame2.setVisible(true);
JLabel label2 = new JLabel("Ini adalah Jendela Internal 2");
internalFrame2.add(label2);
desktopPane.add(internalFrame2);
// Menambahkan JDesktopPane ke dalam JFrame
frame.add(desktopPane);
// Mengatur operasi default saat tombol close di klik
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Menampilkan JFrame
frame.setSize(400, 300);
frame.setVisible(true);
}
}