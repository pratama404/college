import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Listselection {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Jendela");

        // Membuat komponen daftar
        JList<String> list = new JList<>(new String[]{"Item 1", "Item 2", "Item 3"});

        // Membuat objek ListSelectionListener yang telah diimplementasikan
        MyListSelectionListener listener = new MyListSelectionListener();

        // Pendaftaran ListSelectionListener pada komponen daftar
        list.addListSelectionListener(listener);

        frame.add(list);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyListSelectionListener implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent e) {
        // Kode untuk menangani perubahan pemilihan pada komponen daftar
        if (!e.getValueIsAdjusting()) { // Memastikan hanya menangani perubahan pemilihan yang stabil
            JList<?> list = (JList<?>) e.getSource();
            int[] selectedIndices = list.getSelectedIndices();

            for (int index : selectedIndices) {
                Object selectedItem = list.getModel().getElementAt(index);
                System.out.println("Item terpilih: " + selectedItem);
            }
        }
    }
}
