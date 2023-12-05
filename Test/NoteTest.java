package NoteApp_Project.Test;

import Learn_JFrame_JavaSwing.Jpanel.TestJPanel;
import NoteApp_Project.View.NoteView;

import javax.swing.*;

public class NoteTest {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            NoteView view2 = new NoteView();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
