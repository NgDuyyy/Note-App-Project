package Learn_JFrame_JavaSwing.Test;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class NoteApp extends JFrame {
    private JTree noteTree;

    public NoteApp() {
        super("Tree-based Note App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Tạo cây ghi chú mẫu
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Notes");
        DefaultMutableTreeNode todayNode = new DefaultMutableTreeNode("Today");
        DefaultMutableTreeNode morningNode = new DefaultMutableTreeNode("Morning");
        DefaultMutableTreeNode afternoonNode = new DefaultMutableTreeNode("Afternoon");
        DefaultMutableTreeNode eveningNode = new DefaultMutableTreeNode("Evening");

        root.add(todayNode);
        todayNode.add(morningNode);
        todayNode.add(afternoonNode);
        todayNode.add(eveningNode);

        noteTree = new JTree(root);

        // Thêm cây vào JScrollPane để có thanh cuộn
        JScrollPane treeScrollPane = new JScrollPane(noteTree);

        // Hiển thị cây trong giao diện
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(treeScrollPane, BorderLayout.CENTER);

        // Hiển thị cửa sổ
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NoteApp());
    }
}

