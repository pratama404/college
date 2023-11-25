import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeSelectionListenerExamplePratama extends JFrame {
    private JTree tree;

    public TreeSelectionListenerExamplePratama() {
        setTitle("TreeSelectionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat komponen pohon
        tree = new JTree(createSampleTree());

        // Mendaftarkan TreeSelectionListener pada komponen pohon
        tree.addTreeSelectionListener(new MyTreeSelectionListener());

        add(tree);

        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private DefaultMutableTreeNode createSampleTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Pohon");

        DefaultMutableTreeNode category1 = new DefaultMutableTreeNode("Kategori 1");
        category1.add(new DefaultMutableTreeNode("Item 1.1"));
        category1.add(new DefaultMutableTreeNode("Item 1.2"));

        DefaultMutableTreeNode category2 = new DefaultMutableTreeNode("Kategori 2");
        category2.add(new DefaultMutableTreeNode("Item 2.1"));
        category2.add(new DefaultMutableTreeNode("Item 2.2"));

        root.add(category1);
        root.add(category2);

        return root;
    }

    private class MyTreeSelectionListener implements TreeSelectionListener {
        @Override
        public void valueChanged(TreeSelectionEvent e) {
            // Kode untuk menangani perubahan pemilihan pada komponen pohon
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) e.getPath().getLastPathComponent();
            String selectedNodeLabel = selectedNode.toString();
            System.out.println("Simpul terpilih: " + selectedNodeLabel);
        }
    }

    public static void main(String[] args) {
        new TreeSelectionListenerExamplePratama();
    }
}
