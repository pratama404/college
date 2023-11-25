import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldPratama {
    public static void main(String[] args) {
        // Membuat objek JFrame
        JFrame frame = new JFrame("Contoh JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek JPanel dengan tata letak FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Membuat objek JLabel dan JTextField
        JLabel label = new JLabel("Nama: ");
        JTextField textField = new JTextField(20);

        // Membuat tombol "Tambah"
        JButton addButton = new JButton("Tambah");

        // Menambahkan label, text field, dan tombol ke dalam panel
        panel.add(label);
        panel.add(textField);
        panel.add(addButton);

        // Menambahkan panel ke dalam frame
        frame.add(panel);

        // Membuat label untuk menampilkan output
        JLabel outputLabel = new JLabel("Output: ");

        // Menambahkan label output ke dalam panel
        panel.add(outputLabel);

        // Menambahkan ActionListener untuk tombol "Tambah"
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                outputLabel.setText("Output: " + inputText);
            }
        });

        // Mengatur ukuran frame
        frame.setSize(300, 150);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
