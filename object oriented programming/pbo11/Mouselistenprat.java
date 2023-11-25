import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouselistenprat {
    public static void main(String[] args) {
        // Membuat instance dari JFrame
        JFrame frame = new JFrame("Contoh Event Handling");

        // Membuat tombol
        JButton button = new JButton("Klik Saya");
        button.setBounds(100, 100, 200, 50);

        // Mendaftarkan ActionListener ke tombol
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Tindakan yang akan dijalankan saat tombol diklik
                JOptionPane.showMessageDialog(null, "Tombol diklik!");
            }
        });

        // Membuat JCheckBox
        JCheckBox checkBox = new JCheckBox("Pilih");
        JLabel label = new JLabel("Status: Belum dipilih");

        // Menambahkan ItemListener ke JCheckBox
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent event) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    label.setText("Status: Dipilih");
                } else {
                    label.setText("Status: Belum dipilih");
                }
            }
        });

        // Membuat objek MyMouseListener
        MyMouseListener myMouseListener = new MyMouseListener();

        // Menambahkan MouseListener ke tombol
        button.addMouseListener(myMouseListener);

        // Menambahkan tombol, JCheckBox, dan JLabel ke dalam JFrame
        frame.add(button);
        frame.add(checkBox);
        frame.add(label);

        // Menambahkan MouseListener ke panel
        JPanel panel = new JPanel();
        MouseListener mouseListener = new MyMouseListener();
        panel.addMouseListener(mouseListener);

        // Mengatur operasi default saat tombol close di klik
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan JFrame
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

class MyMouseListener implements MouseListener {
    public void mousePressed(MouseEvent e) {
        // Kode untuk menangani peristiwa tombol mouse ditekan
        JOptionPane.showMessageDialog(null, "Tombol mouse ditekan!");
    }

    public void mouseReleased(MouseEvent e) {
        // Kode untuk menangani peristiwa tombol mouse dilepaskan
    }

    public void mouseClicked(MouseEvent e) {
        // Kode untuk menangani peristiwa tombol mouse diklik
    }

    public void mouseEntered(MouseEvent e) {
        // Kode untuk menangani peristiwa mouse memasuki area komponen
    }

    public void mouseExited(MouseEvent e) {
        // Kode untuk menangani peristiwa mouse keluar dari area komponen
    }
}
