import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ComponenFocusListener implements FocusListener {
    public void focusGained(FocusEvent e) {
        JTextField textField = (JTextField) e.getComponent();
        textField.setText("Komponen mendapat fokus");
    }

    public void focusLost(FocusEvent e) {
        JTextField textField = (JTextField) e.getComponent();
        textField.setText("Komponen kehilangan fokus");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh FocusListener");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        ComponenFocusListener focusListener = new ComponenFocusListener();
        textField.addFocusListener(focusListener);

        frame.add(textField);
        frame.setVisible(true);
    }
}
