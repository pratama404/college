import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class componenListenerPratama extends JFrame {
    private JTextField textField;

    public componenListenerPratama() {
        setTitle("WindowsListener Pratama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        textField.addFocusListener(new MyFocusListener());

        // Menambahkan ComponentListener
        textField.addComponentListener(new ComponentListenerPratama());

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

    private class ComponentListenerPratama implements ComponentListener {
        @Override
        public void componentResized(ComponentEvent e) {
            int width = e.getComponent().getWidth();
            int height = e.getComponent().getHeight();
            System.out.println("Komponen diubah ukurannya menjadi " + width + " x " + height);
        }

        @Override
        public void componentMoved(ComponentEvent e) {
            int x = e.getComponent().getX();
            int y = e.getComponent().getY();
            System.out.println("Komponen dipindahkan ke posisi (" + x + ", " + y + ")");
        }

        @Override
        public void componentShown(ComponentEvent e) {
            System.out.println("Komponen ditampilkan");
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            System.out.println("Komponen disembunyikan");
        }
    }

    public static void main(String[] args) {
        new WindowsListenerPratama();
    }
}
