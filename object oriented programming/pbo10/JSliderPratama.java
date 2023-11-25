import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Hashtable;

public class JSliderPratama {
    public static void main(String[] args) {
        // Membuat instance dari JFrame
        JFrame frame = new JFrame("Contoh JSlider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat instance dari JSlider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Menambahkan ChangeListener untuk menangani perubahan nilai slider
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider) e.getSource();
                int value = source.getValue();
                System.out.println("Nilai slider: " + value);
            }
        });

        // Menambahkan JSlider ke JPanel
        JPanel panel = new JPanel();
        panel.add(slider);

        // Mengatur operasi default saat tombol close di klik
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan JFrame
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
