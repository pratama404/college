import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarPratama {
public static void main(String[] args) {
// Membuat instance objek JFrame
JFrame frame = new JFrame("Contoh JMenuBar");
// Membuat instance objek JMenuBar
JMenuBar menuBar = new JMenuBar();
// Membuat instance objek JMenu
JMenu fileMenu = new JMenu("File");
JMenu editMenu = new JMenu("Edit");
// Membuat instance objek JMenuItem
JMenuItem newItem = new JMenuItem("New");
JMenuItem openItem = new JMenuItem("Open");
JMenuItem saveItem = new JMenuItem("Save");
JMenuItem exitItem = new JMenuItem("Exit");
JMenuItem cutItem = new JMenuItem("Cut");
JMenuItem copyItem = new JMenuItem("Copy");
JMenuItem pasteItem = new JMenuItem("Paste");
// Menambahkan ActionListener untuk menangani aksi saat menu dipilih
ActionListener menuActionListener = new ActionListener() {
public void actionPerformed(ActionEvent e) {
String command = e.getActionCommand();
switch (command) {
case "New":
System.out.println("Menu New dipilih");
break;
case "Open":
System.out.println("Menu Open dipilih");
break;
case "Save":
System.out.println("Menu Save dipilih");
break;
case "Exit":
System.out.println("Menu Exit dipilih");
System.exit(0);
break;
case "Cut":
System.out.println("Menu Cut dipilih");
break;
case "Copy":
System.out.println("Menu Copy dipilih");
break;
case "Paste":
System.out.println("Menu Paste dipilih");
break;
}
}
};
// Menambahkan ActionListener ke JMenuItem
newItem.addActionListener(menuActionListener);
openItem.addActionListener(menuActionListener);
saveItem.addActionListener(menuActionListener);
exitItem.addActionListener(menuActionListener);
cutItem.addActionListener(menuActionListener);
copyItem.addActionListener(menuActionListener);
pasteItem.addActionListener(menuActionListener);
// Menambahkan JMenuItem ke JMenu
fileMenu.add(newItem);
fileMenu.add(openItem);
fileMenu.add(saveItem);
fileMenu.add(exitItem);
editMenu.add(cutItem);
editMenu.add(copyItem);
editMenu.add(pasteItem);
// Menambahkan JMenu ke JMenuBar
menuBar.add(fileMenu);
menuBar.add(editMenu);
// Menambahkan JMenuBar ke dalam frame
frame.setJMenuBar(menuBar);
// Menentukan ukuran frame
frame.setSize(300, 200);
// Menentukan operasi default saat tombol close ditekan
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Menentukan posisi frame di tengah layar
frame.setLocationRelativeTo(null);
// Membuat frame menjadi visible
frame.setVisible(true);
}
}
