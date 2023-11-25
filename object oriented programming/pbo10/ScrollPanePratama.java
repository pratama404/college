import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ScrollPanePratama {
public static void main(String[] args) {
// Membuat instance dari JFrame
JFrame frame = new JFrame("Contoh JScrollPane");
// Membuat instance dari JTextArea dengan teks panjang
String longText = "Ini adalah contoh teks yang sangat panjang. " +
"Google LLC is an American multinational technology company focusing on artificial intelligence, online advertising, search engine technology, cloud computing, computer software, quantum computing, e-commerce, and consumer electronics. Wikipedia";
JTextArea textArea = new JTextArea(longText);
// Membuat instance dari JScrollPane dengan JTextArea sebagai kontennya
JScrollPane scrollPane = new JScrollPane(textArea);
// Menambahkan JScrollPane ke JFrame
frame.add(scrollPane);
// Mengatur operasi default saat tombol close di klik
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Menampilkan JFrame
frame.setSize(300, 200);
frame.setVisible(true);
}
}
