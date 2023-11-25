import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

class My implements WindowFocusListener {

   public void windowGainedFocus(WindowEvent e) {
     System.out.println("Window is now in focus: Welcome!");
   }

   public void windowLostFocus(WindowEvent e) {
      System.out.println("Window lost focus: Come back soon!");
   }
}

public class focuslisten {

   public static void main(String[] args) {
      JFrame window = new JFrame("java2s.com");
      window.setBounds(30, 30, 300, 300);
      window.addWindowFocusListener(new My());
      window.setVisible(true);
   }
}
