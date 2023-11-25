import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class WindowAdapterExample extends JFrame {
private JLabel label;
public WindowAdapterExample() {
setTitle("WindowAdapter Example");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
label = new JLabel("Hello, World!");
add(label);
// Menggunakan WindowAdapter untuk menangani peristiwa jendela
addWindowListener(new MyWindowAdapter());
pack();
setVisible(true);
}
private class MyWindowAdapter extends WindowAdapter {
@Override
public void windowOpened(WindowEvent event) {
System.out.println("Jendela dibuka");
}
@Override
public void windowClosing(WindowEvent event) {
System.out.println("Jendela ditutup");
}
}
public static void main(String[] args) {
new WindowAdapterExample();
}
}