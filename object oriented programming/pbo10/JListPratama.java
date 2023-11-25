import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListPratama {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Membuat objek JFrame
        JFrame frame = new JFrame("Contoh JList, JTextField, JTextArea, JCheckBox, JRadioButton, dan JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat objek JPanel dengan tata letak FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Membuat array dengan data item
        String[] dataItems = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

        // Membuat instance objek JList dengan data item
        JList<String> list = new JList<>(dataItems);

        // Mengatur mode pemilihan item menjadi multiple
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Menambahkan ListSelectionListener untuk menangani perubahan pemilihan item
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                // Mendapatkan indeks item yang dipilih
                int[] selectedIndices = list.getSelectedIndices();

                System.out.println("Item terpilih: ");
                for (int index : selectedIndices) {
                    System.out.println(dataItems[index]);
                }
            }
        });

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

        // Menambahkan JScrollPane dari JList ke dalam panel
        JScrollPane scrollPane = new JScrollPane(list);
        panel.add(scrollPane);

        // Mengatur ukuran frame
        frame.setSize(600, 400);

        // Menampilkan frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
