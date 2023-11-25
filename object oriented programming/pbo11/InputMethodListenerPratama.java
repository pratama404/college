import java.awt.FlowLayout;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class InputMethodListenerPratama extends JFrame {
    private JTextField textField;

    public InputMethodListenerPratama() {
        setTitle("InputMethodListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        textField.addInputMethodListener(new MyInputMethodListener());

        add(textField);

        pack();
        setVisible(true);
    }

    private class MyInputMethodListener implements InputMethodListener {
        @Override
        public void inputMethodTextChanged(InputMethodEvent event) {
            String committedText = event.getText();
            System.out.println("Teks yang dimasukkan: " + committedText);
        }

        @Override
        public void caretPositionChanged(InputMethodEvent event) {
            // Metode ini jarang digunakan untuk komponen teks biasa
        }
    }

    public static void main(String[] args) {
        new InputMethodListenerPratama();
    }
}
