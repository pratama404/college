import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPanePratama {
    public static void main(String[] args) {
        // Membuat objek JFrame
        JFrame frame = new JFrame("Contoh JOptionPane");

        // Membuat tombol "Informasi"
        JButton infoButton = new JButton("Informasi");
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Menampilkan dialog informasi
                JOptionPane.showMessageDialog(null, "Ini adalah pesan informasi.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Membuat tombol "Input"
        JButton inputButton = new JButton("Input");
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengumpulkan input teks
                String name = JOptionPane.showInputDialog(null, "Masukkan nama Anda:", "Input", JOptionPane.QUESTION_MESSAGE);
                if (name != null) {
                    System.out.println("Nama yang dimasukkan: " + name);
                }
            }
        });

        // Membuat tombol "Konfirmasi"
        JButton confirmButton = new JButton("Konfirmasi");
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengumpulkan pilihan dari pengguna
                String[] options = { "Ya", "Tidak", "Batal" };
                int choice = JOptionPane.showOptionDialog(null, "Apakah Anda ingin melanjutkan?", "Konfirmasi",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                System.out.println("Pilihan yang dipilih: " + options[choice]);
            }
        });

        // Mengatur operasi default saat tombol close di klik
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menambahkan tombol-tombol ke frame
        frame.add(infoButton);
        frame.add(inputButton);
        frame.add(confirmButton);

        // Mengatur layout frame
        frame.setLayout(null);
        infoButton.setBounds(10, 10, 150, 30);
        inputButton.setBounds(10, 50, 150, 30);
        confirmButton.setBounds(10, 90, 150, 30);

        // Mengatur ukuran frame
        frame.setSize(200, 180);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
