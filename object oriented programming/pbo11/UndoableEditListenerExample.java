import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UndoableEditListenerExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JTextArea textArea = new JTextArea();
            UndoManager undoManager = new UndoManager();

            textArea.getDocument().addUndoableEditListener(new MyUndoableEditListener(undoManager));

            JScrollPane scrollPane = new JScrollPane(textArea);

            JButton undoButton = new JButton("Undo");
            undoButton.addActionListener(e -> {
                if (undoManager.canUndo()) {
                    undoManager.undo();
                }
            });

            JButton redoButton = new JButton("Redo");
            redoButton.addActionListener(e -> {
                if (undoManager.canRedo()) {
                    undoManager.redo();
                }
            });

            JPanel buttonPanel = new JPanel(new FlowLayout());
            buttonPanel.add(undoButton);
            buttonPanel.add(redoButton);

            JFrame frame = new JFrame("UndoableEditListener Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static class MyUndoableEditListener implements UndoableEditListener {
        private final UndoManager undoManager;

        public MyUndoableEditListener(UndoManager undoManager) {
            this.undoManager = undoManager;
        }

        @Override
        public void undoableEditHappened(UndoableEditEvent event) {
            undoManager.addEdit(event.getEdit());
        }
    }
}
