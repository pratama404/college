import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaPratama {
    public static void main(String[] args) {
        // Membuat objek JFrame
        JFrame frame = new JFrame("Contoh JTextField dan JTextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek JPanel dengan tata letak FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Membuat objek JLabel dan JTextField
        JLabel label = new JLabel("Nama: ");
        JTextField textField = new JTextField(20);

        // Membuat tombol "Tambah" dan JTextArea
        JButton addButton = new JButton("Tambah");
        JTextArea textArea = new JTextArea(5, 20);

        // Menambahkan label, text field, tombol, dan JTextArea ke dalam panel
        panel.add(label);
        panel.add(textField);
        panel.add(addButton);
        panel.add(textArea);

        // Menambahkan panel ke dalam frame
        frame.add(panel);

        // Menambahkan ActionListener untuk tombol "Tambah"
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                textArea.append(inputText + "\n");
                textField.setText(""); // Mengosongkan JTextField setelah ditambahkan
            }
        });

        // Mengatur ukuran frame
        frame.setSize(300, 200);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
