import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class JTabbelPane {
    public static void main(String[] args) {
        // Membuat instance dari JFrame
        JFrame frame = new JFrame("Contoh JTabbedPane");

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

        // Menambahkan JTabbedPane ke dalam JFrame
        frame.add(tabbedPane);

        // Mengatur operasi default saat tombol close di klik
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan JFrame
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
