import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ComposerPratama {
    public static void main(String[] args) {
        // Membuat instance dari JFrame
        JFrame frame = new JFrame("Contoh Editor Teks");

        // Membuat instance dari JTextArea
        JTextArea textArea = new JTextArea(20, 40);

        // Membuat instance dari JScrollPane untuk JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Membuat tombol "Simpan"
        JButton saveButton = new JButton("Simpan");

        // Membuat instance dari JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Menambahkan ActionListener untuk tombol "Simpan"
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = fileChooser.showSaveDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    // Mendapatkan file yang dipilih untuk penyimpanan
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        // Membuat FileWriter untuk menulis teks ke file
                        FileWriter writer = new FileWriter(selectedFile);
                        // Menulis isi dari JTextArea ke file
                        writer.write(textArea.getText());
                        writer.close();
                        System.out.println("File disimpan: " + selectedFile.getAbsolutePath());
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } else {
                    System.out.println("Tidak ada file yang dipilih untuk disimpan.");
                }
            }
        });

        // Mengatur operasi default saat tombol close di klik
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menambahkan komponen-komponen ke frame
        frame.add(scrollPane);
        frame.add(saveButton);

        // Mengatur ukuran dan layout frame
        frame.setLayout(null);
        scrollPane.setBounds(10, 10, 380, 250);
        saveButton.setBounds(150, 270, 100, 30);

        // Menampilkan frame
        frame.setSize(400, 350);
        frame.setVisible(true);
    }
}
