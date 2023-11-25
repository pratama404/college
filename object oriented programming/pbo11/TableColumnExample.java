import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableColumnExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh TableColumnModelListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kolom 1");
        model.addColumn("Kolom 2");

        JTable table = new JTable(model);

        MyTableColumnModelListener columnModelListener = new MyTableColumnModelListener();
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.addColumnModelListener(columnModelListener);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}

class MyTableColumnModelListener implements TableColumnModelListener {
    public void columnAdded(TableColumnModelEvent e) {
        TableColumnModel columnModel = (TableColumnModel) e.getSource();
        TableColumn column = columnModel.getColumn(e.getToIndex());
        System.out.println("Kolom ditambahkan: " + column.getHeaderValue());
    }

    public void columnRemoved(TableColumnModelEvent e) {
        TableColumnModel columnModel = (TableColumnModel) e.getSource();
        TableColumn column = columnModel.getColumn(e.getFromIndex());
        System.out.println("Kolom dihapus: " + column.getHeaderValue());
    }

    public void columnMoved(TableColumnModelEvent e) {
        System.out.println("Kolom dipindahkan");
    }

    public void columnMarginChanged(javax.swing.event.ChangeEvent e) {
        System.out.println("Margin kolom berubah");
    }

    public void columnSelectionChanged(ListSelectionEvent e) {
        System.out.println("Seleksi kolom berubah");
    }
}
