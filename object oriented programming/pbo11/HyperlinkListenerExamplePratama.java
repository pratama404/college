import java.awt.FlowLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

public class HyperlinkListenerExamplePratama extends JFrame {
    private JEditorPane editorPane;

    public HyperlinkListenerExamplePratama() {
        setTitle("HyperlinkListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setEditable(false);
        editorPane.setText("<html><body><a href=\"https://www.example.com\">Visit Example</a></body></html>");
        editorPane.addHyperlinkListener(new MyHyperlinkListener());

        JScrollPane scrollPane = new JScrollPane(editorPane);
        scrollPane.setPreferredSize(new java.awt.Dimension(300, 200));

        add(scrollPane);

        pack();
        setVisible(true);
    }

    private class MyHyperlinkListener implements HyperlinkListener {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent event) {
            if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                try {
                    // Menggunakan Desktop untuk membuka tautan dalam browser default
                    Desktop.getDesktop().browse(new URI(event.getURL().toString()));
                } catch (IOException | URISyntaxException e) {
                    JOptionPane.showMessageDialog(null, "Gagal membuka tautan");
                }
            }
        }
    }

    public static void main(String[] args) {
        new HyperlinkListenerExamplePratama();
    }
}
