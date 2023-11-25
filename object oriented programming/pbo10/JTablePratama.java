import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;

public class JTablePratama {
    public static void main(String[] args) {
        // Data untuk tabel
        Object[][] data = {
            {"John", 25, "USA"},
            {"Emily", 28, "UK"},
            {"Daniel", 32, "Canada"},
            {"Sophia", 23, "Australia"}
        };

        // Nama kolom
        Object[] columnNames = {"Nama", "Usia", "Negara"};

        // Membuat objek DefaultTableModel dengan data dan kolom
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Membuat objek JTable dengan model
        JTable table = new JTable(model);

        // Membuat objek JScrollPane dan menambahkan JTable ke dalamnya
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        // Membuat objek JFrame
        JFrame frame = new JFrame("Contoh JTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menambahkan JScrollPane ke dalam JFrame
        frame.add(scrollPane);

        // Mengatur ukuran frame
        frame.pack();

        // Menampilkan frame
        frame.setVisible(true);
    }
}
