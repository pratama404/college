import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuItemPratama {
    public static void main(String[] args) {
        // Membuat objek JFrame
        JFrame frame = new JFrame("Menu Restoran");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Membuat menu "Makanan Utama"
        JMenu makananUtamaMenu = new JMenu("Makanan Utama");
        JMenuItem nasiGorengItem = new JMenuItem("Nasi Goreng");
        JMenuItem mieGorengItem = new JMenuItem("Mie Goreng");
        JMenuItem ayamBakarItem = new JMenuItem("Ayam Bakar");

        makananUtamaMenu.add(nasiGorengItem);
        makananUtamaMenu.add(mieGorengItem);
        makananUtamaMenu.add(ayamBakarItem);

        // Membuat menu "Minuman"
        JMenu minumanMenu = new JMenu("Minuman");
        JMenuItem tehItem = new JMenuItem("Teh");
        JMenuItem kopiItem = new JMenuItem("Kopi");
        JMenuItem airMineralItem = new JMenuItem("Air Mineral");

        minumanMenu.add(tehItem);
        minumanMenu.add(kopiItem);
        minumanMenu.add(airMineralItem);

        // Membuat menu "Hidangan Penutup"
        JMenu hidanganPenutupMenu = new JMenu("Hidangan Penutup");
        JMenuItem esKrimItem = new JMenuItem("Es Krim");
        JMenuItem kueCoklatItem = new JMenuItem("Kue Coklat");
        JMenuItem pudingItem = new JMenuItem("Puding");

        hidanganPenutupMenu.add(esKrimItem);
        hidanganPenutupMenu.add(kueCoklatItem);
        hidanganPenutupMenu.add(pudingItem);

        // Menambahkan ActionListener untuk item "Exit"
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Aplikasi ditutup");
                System.exit(0);
            }
        });

        // Menambahkan menu "Makanan Utama" ke JMenuBar
        menuBar.add(makananUtamaMenu);

        // Menambahkan menu "Minuman" ke JMenuBar
        menuBar.add(minumanMenu);

        // Menambahkan menu "Hidangan Penutup" ke JMenuBar
        menuBar.add(hidanganPenutupMenu);

        // Menambahkan item "Exit" ke JMenuBar
        menuBar.add(exitItem);

        // Mengatur JMenuBar ke JFrame
        frame.setJMenuBar(menuBar);

        // Mengatur ukuran frame
        frame.setSize(400, 300);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
