import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogPratama {
    public static void main(String[] args) {
        // Membuat objek JFrame
        JFrame frame = new JFrame("Contoh JDialog");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek JPanel
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // Membuat objek JButton
        JButton showDialogButton = new JButton("Tampilkan Dialog");
        panel.add(showDialogButton);

        // Menambahkan ActionListener ke JButton
        showDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Membuat objek JDialog
                JDialog dialog = new JDialog(frame, "Dialog", Dialog.ModalityType.APPLICATION_MODAL);

                // Membuat objek JPanel untuk konten dialog
                JPanel dialogContent = new JPanel();
                dialogContent.setLayout(new BorderLayout());

                // Membuat objek JLabel dengan pesan yang lebih menarik
                JLabel label = new JLabel("Selamat datang Pratama!");
                label.setFont(new Font("Arial", Font.BOLD, 18));
                label.setHorizontalAlignment(JLabel.CENTER);

                // Membuat objek JButton untuk menutup dialog
                JButton closeButton = new JButton("Tutup");
                closeButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose();
                    }
                });

                // Menambahkan komponen ke konten dialog
                dialogContent.add(label, BorderLayout.CENTER);
                dialogContent.add(closeButton, BorderLayout.SOUTH);

                // Mengatur konten dialog
                dialog.setContentPane(dialogContent);

                // Mengatur ukuran dialog
                dialog.setSize(300, 150);
                dialog.setLocationRelativeTo(frame); // Menampilkan dialog di tengah jendela utama

                // Menampilkan dialog
                dialog.setVisible(true);
            }
        });

        // Mengatur ukuran frame
        frame.setSize(400, 200);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
