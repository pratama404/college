import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FocusListenerPratama extends JFrame {
    private JTextField textField;

    public FocusListenerPratama() {
        setTitle("FocusListener Pratama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        textField.addFocusListener(new MyFocusListener());

        add(textField);

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

    public static void main(String[] args) {
        new FocusListenerPratama();
    }
}
