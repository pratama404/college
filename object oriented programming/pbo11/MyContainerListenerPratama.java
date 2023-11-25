import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyContainerListenerPratama implements ContainerListener {
    public static void main(String[] args) {
        // Membuat objek frame
        JFrame frame = new JFrame("Contoh ContainerListener");

        // Mengatur ukuran frame
        frame.setSize(300, 200);

        // Mengatur operasi default pada tombol close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek panel
        JPanel panel = new JPanel();

        // Membuat objek listener dan mendaftarkannya pada panel
        MyContainerListenerPratama containerListener = new MyContainerListenerPratama();
        panel.addContainerListener(containerListener);

        // Membuat objek button
        JButton button = new JButton("Tambah Komponen");

        // Menambahkan button ke dalam panel
        panel.add(button);

        // Menambahkan panel ke dalam frame
        frame.add(panel);

        // Menampilkan frame
        frame.setVisible(true);
    }

    @Override
    public void componentAdded(ContainerEvent e) {
        System.out.println("Komponen ditambahkan ke dalam kontainer");
    }

    @Override
    public void componentRemoved(ContainerEvent e) {
        System.out.println("Komponen dihapus dari kontainer");
    }
}
