import java.awt.FlowLayout;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.text.AttributedCharacterIterator;

public class InputMethodListenerExample extends JFrame {
    private JTextField textField;

    public InputMethodListenerExample() {
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
            AttributedCharacterIterator text = event.getText();
            StringBuilder committedText = new StringBuilder();
            char c = text.first();
            while (c != AttributedCharacterIterator.DONE) {
                committedText.append(c);
                c = text.next();
            }
            System.out.println("Teks yang dimasukkan: " + committedText.toString());
        }

        @Override
        public void caretPositionChanged(InputMethodEvent event) {
            // Metode ini jarang digunakan untuk komponen teks biasa
        }
    }

    public static void main(String[] args) {
        new InputMethodListenerExample();
    }
}
