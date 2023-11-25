import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Dimension;

public class JScroll {
    public static void main(String[] args) {
        // Membuat instance dari JFrame
        JFrame frame = new JFrame("Contoh JTabbedPane dan JScrollPane");

        // Membuat instance dari JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Membuat panel untuk tab pertama
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Konten Tab 1"));

        // Membuat panel untuk tab kedua
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Konten Tab 2"));

        // Membuat panel untuk tab ketiga
        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Konten Tab 3"));

        // Menambahkan panel ke dalam JTabbedPane dengan judul tab
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);

        // Membuat instance objek JTextArea
        JTextArea textArea = new JTextArea(10, 20);
        textArea.setLineWrap(true); // Mengatur wrap teks ke baris berikutnya
        textArea.setWrapStyleWord(true); // Mengatur wrap hanya pada batas kata

        // Membuat instance objek JScrollPane dengan JTextArea sebagai komponen viewport
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        // Menambahkan JTabbedPane dan JScrollPane ke dalam JFrame
        frame.add(tabbedPane);
        frame.add(scrollPane);

        // Menentukan operasi default saat tombol close ditekan
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menentukan posisi frame di tengah layar
        frame.setLocationRelativeTo(null);

        // Mengatur layout frame menjadi null agar komponen dapat ditempatkan secara bebas
        frame.setLayout(null);

        // Menentukan ukuran dan posisi JTabbedPane
        tabbedPane.setBounds(10, 10, 300, 150);

        // Menentukan ukuran dan posisi JScrollPane
        scrollPane.setBounds(10, 170, 300, 200);

        // Membuat frame menjadi visible
        frame.setSize(350, 420);
        frame.setVisible(true);
    }
}
