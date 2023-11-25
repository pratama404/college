import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxExamplePratama {
    public static void main(String[] args) {
        // Membuat objek JFrame
        JFrame frame = new JFrame("Contoh JTextField, JTextArea, dan JCheckBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek JPanel dengan tata letak FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Membuat objek JLabel, JTextField, dan tombol "Tambah"
        JLabel label = new JLabel("Nama: ");
        JTextField textField = new JTextField(20);
        JButton addButton = new JButton("Tambah");

        // Membuat JTextArea untuk menampilkan nama-nama yang ditambahkan
        JTextArea textArea = new JTextArea(10, 20);

        // Membuat JCheckBox untuk pilihan tambahan
        JCheckBox checkBox = new JCheckBox("Tambahkan ke daftar");
        checkBox.setSelected(true); // Secara default, tambahkan ke daftar

        // Menambahkan komponen-komponen ke dalam panel
        panel.add(label);
        panel.add(textField);
        panel.add(addButton);
        panel.add(checkBox);
        panel.add(textArea);

        // Menambahkan ActionListener untuk tombol "Tambah"
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                if (checkBox.isSelected()) {
                    textArea.append(inputText + " (Ditambahkan ke daftar)\n");
                } else {
                    textArea.append(inputText + "\n");
                }
                textField.setText(""); // Mengosongkan JTextField setelah ditambahkan
            }
        });

        // Mengatur ukuran frame
        frame.setSize(400, 300);

        // Menampilkan frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
