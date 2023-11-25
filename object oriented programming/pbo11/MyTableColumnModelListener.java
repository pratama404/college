import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class MyTableColumnModelListener implements TableColumnModelListener {
    @Override
    public void columnAdded(TableColumnModelEvent e) {
        TableColumnModel columnModel = (TableColumnModel) e.getSource();
        TableColumn column = columnModel.getColumn(e.getToIndex());
        System.out.println("Kolom ditambahkan: " + column.getHeaderValue());
    }

    @Override
    public void columnRemoved(TableColumnModelEvent e) {
        TableColumnModel columnModel = (TableColumnModel) e.getSource();
        TableColumn column = columnModel.getColumn(e.getFromIndex());
        System.out.println("Kolom dihapus: " + column.getHeaderValue());
    }

    @Override
    public void columnMoved(TableColumnModelEvent e) {
        // Implement this method if needed
    }

    @Override
    public void columnMarginChanged(javax.swing.event.ChangeEvent e) {
        // Implement this method if needed
    }

    @Override
    public void columnSelectionChanged(javax.swing.event.ListSelectionEvent e) {
        // Implement this method if needed
    }
}
