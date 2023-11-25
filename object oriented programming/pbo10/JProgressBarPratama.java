import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarPratama {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combined JProgressBar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JProgressBar Standar
        JProgressBar standardProgressBar = new JProgressBar(0, 100);
        standardProgressBar.setValue(50);
        frame.add(standardProgressBar);

        // JProgressBar dengan Warna Kustom
        JProgressBar colorProgressBar = new JProgressBar(0, 100);
        colorProgressBar.setValue(60);
        colorProgressBar.setForeground(Color.GREEN);
        colorProgressBar.setBackground(Color.LIGHT_GRAY);
        frame.add(colorProgressBar);

        // JProgressBar Bergaris (String)
        JProgressBar stringProgressBar = new JProgressBar(0, 100);
        stringProgressBar.setValue(75);
        stringProgressBar.setStringPainted(true);
        frame.add(stringProgressBar);

        // JProgressBar dengan Gambar
        JProgressBar indeterminateProgressBar = new JProgressBar();
        indeterminateProgressBar.setIndeterminate(true);
        frame.add(indeterminateProgressBar);

        // Tombol untuk mengubah nilai JProgressBar
        JButton updateButton = new JButton("Perbarui");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                standardProgressBar.setValue(standardProgressBar.getValue() + 10);
                colorProgressBar.setValue(colorProgressBar.getValue() + 10);
                stringProgressBar.setValue(stringProgressBar.getValue() + 10);
            }
        });
        frame.add(updateButton);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
