import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxPratama {
    public static void main(String[] args) {
        // Membuat objek JFrame
        JFrame frame = new JFrame("Contoh JTextField, JTextArea, JCheckBox, JRadioButton, dan JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek JPanel dengan tata letak FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Membuat objek JLabel, JTextField, tombol "Tambah"
        JLabel label = new JLabel("Nama: ");
        JTextField textField = new JTextField(20);
        JButton addButton = new JButton("Tambah");

        // Membuat JTextArea untuk menampilkan nama-nama yang ditambahkan
        JTextArea textArea = new JTextArea(10, 20);

        // Membuat JCheckBox untuk pilihan tambahan
        JCheckBox checkBox = new JCheckBox("Tambahkan ke daftar");
        checkBox.setSelected(true); // Secara default, tambahkan ke daftar

        // Membuat JRadioButton dalam kelompok
        JRadioButton radioButton1 = new JRadioButton("Pilihan 1");
        JRadioButton radioButton2 = new JRadioButton("Pilihan 2");
        JRadioButton radioButton3 = new JRadioButton("Pilihan 3");

        // Mengelompokkan JRadioButton
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        radioButtonGroup.add(radioButton3);

        // Membuat JComboBox dengan daftar pilihan
        String[] comboBoxOptions = { "Pilihan A", "Pilihan B", "Pilihan C" };
        JComboBox<String> comboBox = new JComboBox<>(comboBoxOptions);

        // Menambahkan komponen-komponen ke dalam panel
        panel.add(label);
        panel.add(textField);
        panel.add(addButton);
        panel.add(checkBox);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(comboBox);
        panel.add(textArea);

        // Menambahkan ActionListener untuk tombol "Tambah"
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                String additionalInfo = "";
                if (checkBox.isSelected()) {
                    additionalInfo = " (Ditambahkan ke daftar)";
                }
                String selectedRadioButtonText = "";
                if (radioButton1.isSelected()) {
                    selectedRadioButtonText = radioButton1.getText();
                } else if (radioButton2.isSelected()) {
                    selectedRadioButtonText = radioButton2.getText();
                } else if (radioButton3.isSelected()) {
                    selectedRadioButtonText = radioButton3.getText();
                }
                String comboBoxSelection = comboBox.getSelectedItem().toString();
                textArea.append(inputText + " - " + selectedRadioButtonText + additionalInfo + " - Pilihan ComboBox: " + comboBoxSelection + "\n");
                textField.setText(""); // Mengosongkan JTextField setelah ditambahkan
            }
        });

        // Mengatur ukuran frame
        frame.setSize(400, 400);

        // Menampilkan frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
