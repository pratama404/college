import java.awt.ComponentOrientation;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComponentOrientationListenerPratama {
    public static void main(String[] args) {
        // Membuat objek frame
        JFrame frame = new JFrame("Contoh GUI dengan Component Orientation Listener");

        // Mengatur layout frame
        frame.setLayout(new java.awt.FlowLayout());

        // Membuat objek button
        JButton button = new JButton("Klik Saya!");
        // Membuat objek listener dan mendaftarkannya pada button
        button.addComponentListener(new MyComponentListener());

        // Menambahkan button ke dalam frame
        frame.add(button);

        // Mengatur ukuran frame
        frame.setSize(300, 200);
        // Mengatur operasi default pada tombol close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Menampilkan frame
        frame.setVisible(true);
    }
}

// Implementasi ComponentListener untuk menangani peristiwa pada button
class MyComponentListener implements ComponentListener {
    @Override
    public void componentResized(ComponentEvent e) {
        System.out.println("Button diubah ukurannya");
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        System.out.println("Button dipindahkan");
    }

    @Override
    public void componentShown(ComponentEvent e) {
        System.out.println("Button ditampilkan");
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        System.out.println("Button disembunyikan");
    }
}
