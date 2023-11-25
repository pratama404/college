import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class MyPanel extends JFrame {
    public MyPanel() {
        // Set judul jendela
        setTitle("Contoh JPanel");

        // Set ukuran jendela (lebar x tinggi)
        setSize(400, 300);

        // Menutup jendela ketika tombol "X" ditutup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel
        JPanel panel = new JPanel();

        // Mengatur warna latar belakang panel
        panel.setBackground(Color.YELLOW);

        // Membuat label dengan teks "Ini panel"
        JLabel label = new JLabel("Ini panel");

        // Menambahkan label ke dalam panel
        panel.add(label);

        // Menambahkan panel ke dalam jendela
        add(panel);

        // Menampilkan jendela
        setVisible(true);
    }

    public static void main(String[] args) {
        // Membuat objek MyPanel
        MyPanel frame = new MyPanel();
    }
}
