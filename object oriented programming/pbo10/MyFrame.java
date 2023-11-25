import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    public MyFrame() {
        // Set judul jendela
        setTitle("Contoh JFrame");

        // Set ukuran jendela (lebar x tinggi)
        setSize(400, 300);

        // Menutup jendela ketika tombol "X" ditutup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel
        JPanel panel = new JPanel();

        // Menambahkan panel ke dalam jendela
        add(panel);

        // Menampilkan jendela
        setVisible(true);
    }

    public static void main(String[] args) {
        // Membuat objek MyFrame
        MyFrame frame = new MyFrame();
    }
}
