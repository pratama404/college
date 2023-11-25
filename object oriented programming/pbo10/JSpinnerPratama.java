import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class JSpinnerPratama {
    public static void main(String[] args) {
        // Membuat instance objek JFrame
        JFrame frame = new JFrame("Contoh JSpinner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mengatur layout frame menjadi GridLayout
        frame.setLayout(new GridLayout(3, 2));

        // Membuat instance objek JLabel
        JLabel numberLabel = new JLabel("Pilih angka:");
        numberLabel.setForeground(Color.BLUE);

        // Membuat instance objek JSpinner untuk angka
        SpinnerNumberModel numberModel = new SpinnerNumberModel(0, 0, 100, 1);
        JSpinner numberSpinner = new JSpinner(numberModel);

        // Membuat instance objek JLabel
        JLabel dateLabel = new JLabel("Pilih tanggal:");
        dateLabel.setForeground(Color.GREEN);

        // Membuat instance objek JSpinner untuk tanggal
        SpinnerDateModel dateModel = new SpinnerDateModel(new Date(), null, null, java.util.Calendar.DAY_OF_MONTH);
        JSpinner dateSpinner = new JSpinner(dateModel);

        // Membuat instance objek JLabel
        JLabel listLabel = new JLabel("Pilih item:");
        listLabel.setForeground(Color.RED);

        // Membuat instance objek JSpinner untuk daftar item
        String[] items = { "yoyo", "spinner", "beyblede" };
        SpinnerListModel listModel = new SpinnerListModel(items);
        JSpinner listSpinner = new JSpinner(listModel);

        // Menambahkan JLabel dan JSpinner ke dalam frame
        frame.add(numberLabel);
        frame.add(numberSpinner);
        frame.add(dateLabel);
        frame.add(dateSpinner);
        frame.add(listLabel);
        frame.add(listSpinner);

        // Menentukan ukuran frame
        frame.setSize(400, 200);

        // Menentukan operasi default saat tombol close ditekan
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menentukan posisi frame di tengah layar
        frame.setLocationRelativeTo(null);

        // Membuat frame menjadi visible
        frame.setVisible(true);
    }
}
