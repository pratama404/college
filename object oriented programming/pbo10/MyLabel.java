import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;

public class MyLabel extends JFrame {
    public MyLabel() {
        // Set judul jendela
        setTitle("Contoh JPanel");

        // Set ukuran jendela (lebar x tinggi)
        setSize(400, 300);

        // Menutup jendela ketika tombol "X" ditutup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel
        JPanel panel = new JPanel();

        // Mengatur layout panel menjadi BorderLayout
        panel.setLayout(new BorderLayout());

        // Mengatur warna latar belakang panel
        panel.setBackground(Color.GREEN);

        // Membuat label dengan teks "Ini panel"
        JLabel labelPanel = new JLabel("Ini panel");

        // Membuat label dengan teks "Ini adalah JLabel"
        JLabel labelJLabel = new JLabel("Ini adalah JLabel");

        // Membuat label dengan teks "Ini adalah label"
        JLabel labelIniLabel = new JLabel("Ini adalah label");

        // Menambahkan label-panel ke dalam panel bagian atas
        panel.add(labelPanel, BorderLayout.NORTH);

        // Menambahkan label-JLabel ke dalam panel tengah
        panel.add(labelJLabel, BorderLayout.CENTER);

        // Menambahkan label-IniLabel ke dalam panel bagian bawah
        panel.add(labelIniLabel, BorderLayout.SOUTH);

        // Menambahkan panel ke dalam jendela
        add(panel);

        // Menampilkan jendela
        setVisible(true);
    }

    public static void main(String[] args) {
        // Membuat objek MyLabel
        MyLabel frame = new MyLabel();
    }
}
