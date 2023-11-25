import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class WindowsListenerPratama extends JFrame {
    private JTextField textField;

    public WindowsListenerPratama() {
        setTitle("WindowsListener Pratama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        textField.addFocusListener(new MyFocusListener());

        add(textField);

        // Menambahkan WindowListener
        addWindowListener(new MyWindowListener());

        pack();
        setVisible(true);
    }

    private class MyFocusListener implements FocusListener {
        @Override
        public void focusGained(FocusEvent event) {
            System.out.println("Komponen mendapatkan fokus");
        }

        @Override
        public void focusLost(FocusEvent event) {
            System.out.println("Komponen kehilangan fokus");
        }
    }

    private class MyWindowListener implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            JOptionPane.showMessageDialog(null, "Jendela dibuka!");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            // Kode untuk menangani peristiwa pengguna mencoba menutup jendela
        }

        @Override
        public void windowClosed(WindowEvent e) {
            // Kode untuk menangani peristiwa jendela ditutup
        }

        @Override
        public void windowIconified(WindowEvent e) {
            // Kode untuk menangani peristiwa jendela diikonkan
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            // Kode untuk menangani peristiwa jendela dikembalikan dari ikon
        }

        @Override
        public void windowActivated(WindowEvent e) {
            // Kode untuk menangani peristiwa jendela diaktifkan
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            // Kode untuk menangani peristiwa jendela dinonaktifkan
        }
    }

    public static void main(String[] args) {
        new WindowsListenerPratama();
    }
}
