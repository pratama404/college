import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jtoolbar {
    public static void main(String[] args) {
        // Membuat instance dari JFrame
        JFrame frame = new JFrame("Contoh Gabungan Semua");

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

        // Membuat instance objek JPanel
        JPanel panel = new JPanel();

        // Membuat instance objek JPopupMenu
        JPopupMenu popupMenu = new JPopupMenu();

        // Membuat instance objek JMenuItem untuk opsi-opsi menu
        JMenuItem menuItem1 = new JMenuItem("Opsi 1");
        JMenuItem menuItem2 = new JMenuItem("Opsi 2");

        // Menambahkan JMenuItem ke dalam JPopupMenu
        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);

        // Menambahkan MouseListener ke dalam JPanel
        panel.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    // Menampilkan JPopupMenu saat klik kanan
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        // Menambahkan aksi ActionListener untuk masing-masing JMenuItem
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Anda memilih Opsi 1");
            }
        });

        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Anda memilih Opsi 2");
            }
        });

        // Membuat instance objek JToolBar
        JToolBar toolBar = new JToolBar();

        // Membuat objek JButton
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        // Menambahkan ActionListener ke JButton
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tombol New diklik");
            }
        });

        // Menambahkan tombol ke JToolBar
        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);

        // Membuat objek JLabel dengan ikon
        JLabel cutLabel = new JLabel();
        cutLabel.setIcon(new javax.swing.ImageIcon("cut.png"));

        // Menambahkan label ke JToolBar
        toolBar.add(cutLabel);

        // Mengatur JToolBar ke JFrame
        frame.add(toolBar, BorderLayout.NORTH);

        // Menambahkan JTabbedPane, JScrollPane, dan JPanel ke dalam JFrame
        frame.add(tabbedPane);
        frame.add(scrollPane);
        frame.add(panel);

        // Menentukan operasi default saat tombol close ditekan
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Membuat objek JMenu
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Membuat objek JMenuItem
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");

        // Menambahkan ActionListener ke JMenuItem
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Menambahkan JMenuItem ke JMenu
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        // Menambahkan JMenu ke JMenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Mengatur JMenuBar ke JFrame
        frame.setJMenuBar(menuBar);

        // Mengatur layout frame menjadi null agar komponen dapat ditempatkan secara bebas
        frame.setLayout(null);

        // Menentukan ukuran dan posisi JTabbedPane
        tabbedPane.setBounds(10, 10, 300, 150);

        // Menentukan ukuran dan posisi JScrollPane
        scrollPane.setBounds(10, 170, 300, 200);

        // Menentukan ukuran dan posisi JPanel
        panel.setBounds(320, 10, 100, 100);

        // Menentukan ukuran dan posisi JToolBar
        toolBar.setBounds(10, 380, 400, 30);

        // Mengatur ukuran frame
        frame.setSize(450, 450);

        // Menentukan posisi frame di tengah layar
        frame.setLocationRelativeTo(null);

        // Membuat frame menjadi visible
        frame.setVisible(true);
    }
}
