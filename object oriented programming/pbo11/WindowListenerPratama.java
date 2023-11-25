import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WindowListenerPratama extends JFrame {
    private JTextField textField;
    private JScrollBar verticalScrollBar;
    private JTextArea textArea;

    public WindowListenerPratama() {
        setTitle("Window Listener Pratama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        textField.addFocusListener(new MyFocusListener());
        textField.addComponentListener(new MyComponentListener());

        verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 100);
        verticalScrollBar.addAdjustmentListener(new MyAdjustmentListener());

        textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBar(verticalScrollBar);

        add(textField);
        add(scrollPane);

        addWindowStateListener(new MyWindowStateListener()); // Pendaftaran WindowStateListener

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
            System.out.println("Jendela diikonkan");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("Jendela dikembalikan dari ikon");
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

    private class MyComponentListener implements ComponentListener {
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

    private class MyAdjustmentListener implements AdjustmentListener {
        @Override
        public void adjustmentValueChanged(AdjustmentEvent event) {
            int value = event.getValue();
            System.out.println("Penyesuaian berubah. Nilai: " + value);
        }
    }

    private class MyWindowStateListener implements WindowStateListener {
        @Override
        public void windowStateChanged(WindowEvent e) {
            // Kode untuk menangani perubahan status jendela
            int newState = e.getNewState();
            if (newState == JFrame.ICONIFIED) {
                JOptionPane.showMessageDialog(null, "Jendela diikonkan!");
            } else if (newState == JFrame.NORMAL) {
                JOptionPane.showMessageDialog(null, "Jendela dikembalikan dari ikon!");
            } else if (newState == JFrame.MAXIMIZED_BOTH) {
                JOptionPane.showMessageDialog(null, "Jendela dimaksimalkan!");
            }
        }
    }

    public static void main(String[] args) {
        new WindowListenerPratama();
    }
}
