package NoteApp_Project.View;

import javax.swing.*;
import java.awt.*;

public class NoteAppView extends JFrame {
    //Add Button
    private JButton addNote;
    private JButton addImgNote;
    private JButton deleteNote;

    //Text area
    private JTextArea textArea = new JTextArea(100,100);

    //Label
    JLabel jLabel_Info = new JLabel("-------");

    //Add search bar
    private JTextField searchBar = new JTextField();

    public NoteAppView() {
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Note app");
        this.setSize(900, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set font
        Font font = new Font("Arial", Font.BOLD, 15);

        //Set color

        //Declare button
        addNote = new JButton("Add Note");
        addNote.setFont(font);
        addImgNote = new JButton("Add Image");
        addImgNote.setFont(font);
        deleteNote = new JButton("Delete Note");
        deleteNote.setFont(font);

        //Label
        JLabel jLabel_search = new JLabel("Search", JLabel.CENTER);
        jLabel_search.setFont(font);
        jLabel_Info.setFont(font);

        //Declare text field
        textArea = new JTextArea();
        textArea.setFont(font);
        searchBar = new JTextField();
        searchBar.setFont(font);

        //Panel header
        JPanel jPanel_head = new JPanel();
        JPanel jPanel_HLeft = new JPanel();
        JPanel jPanel_HCen = new JPanel();

        jPanel_head.setLayout(new GridLayout());
        jPanel_HLeft.setLayout(new BorderLayout());
        jPanel_HCen.setLayout(new FlowLayout());

        jPanel_head.add(jPanel_HLeft);
        jPanel_head.add(jPanel_HCen);
        jPanel_HLeft.add(searchBar, BorderLayout.CENTER);
        jPanel_HLeft.add(jLabel_search, BorderLayout.WEST);
        jPanel_HCen.add(jLabel_Info);

        //Panel center
        JPanel jPanel_Center = new JPanel();
        JPanel jPanel_CLeft = new JPanel(); //Display Note Tree
        JPanel jPanel_CCen = new JPanel();  //Enter note

        jPanel_Center.setLayout(new BorderLayout());
        jPanel_CCen.setLayout(new FlowLayout());

        jPanel_Center.add(jPanel_CLeft, BorderLayout.WEST);
        jPanel_Center.add(jPanel_CCen, BorderLayout.CENTER);
        jPanel_CCen.add(textArea);

        //Menu panel footer
        JPanel jPanel_Footer = new JPanel();
        jPanel_Footer.setLayout(new GridLayout());
        jPanel_Footer.add(addNote);
        jPanel_Footer.add(addImgNote);
        jPanel_Footer.add(deleteNote);

        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_Center, BorderLayout.CENTER);
        this.add(jPanel_Footer, BorderLayout.SOUTH);


    }
}
