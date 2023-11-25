import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton {
    public static void main(String[] args) {
        // Membuat instance objek JFrame
        JFrame frame = new JFrame("Contoh JButton");

        // Membuat instance objek JButton
        JButton button = new JButton("Klik Saya");

        // Menambahkan ActionListener untuk menangani aksi saat tombol ditekan
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tombol ditekan!");
            }
        });

        // Menambahkan JButton ke dalam frame
        frame.getContentPane().add(button);

        // Menentukan ukuran frame
        frame.setSize(300, 200);

        // Menentukan operasi default saat tombol close ditekan
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menentukan posisi frame di tengah layar
        frame.setLocationRelativeTo(null);

        // Membuat frame menjadi visible
        frame.setVisible(true);
    }
}
