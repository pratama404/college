import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionlisten {
    public static void main(String[] args) {
        // Membuat instance dari JFrame
        JFrame frame = new JFrame("Contoh Event Handling");

        // Membuat tombol
        JButton button = new JButton("Klik Saya");
        button.setBounds(100, 100, 200, 50);

        // Mendaftarkan ActionListener ke tombol
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Tindakan yang akan dijalankan saat tombol diklik
                JOptionPane.showMessageDialog(null, "Tombol diklik!");
            }
        });

        // Menambahkan tombol ke dalam JFrame
        frame.add(button);

        // Mengatur operasi default saat tombol close di klik
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan JFrame
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
