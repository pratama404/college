import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MouseMotionListenerPratama extends JFrame {
    public MouseMotionListenerPratama() {
        setTitle("Contoh Jendela");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyMouseMotionListener listener = new MyMouseMotionListener();
        addMouseMotionListener(listener);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMotionListenerPratama();
    }
}

class MyMouseMotionListener implements MouseMotionListener {
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        JOptionPane.showMessageDialog(null, "Mouse ditarik di koordinat: " + x + ", " + y);
    }

    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        JOptionPane.showMessageDialog(null, "Mouse bergerak di koordinat: " + x + ", " + y);
    }
}
