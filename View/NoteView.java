package NoteApp_Project.View;

import NoteApp_Project.Controller.NoteListener;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;


public class NoteView extends JFrame {
    public NoteView() {
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        this.setTitle("Note app");
        // Lấy kích thước màn hình
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Đặt kích thước của cửa sổ
        this.setSize(screenSize.width, screenSize.height);
//        this.setSize(900, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Declare
        pnHead = new JPanel();
        tFSearch = new JTextField();
        labelLocation = new JLabel();
        pnMenu = new JPanel();
        pnMenuTop = new JPanel();
        pnButton = new JPanel();
        btOpen = new JButton();
        btSave = new JButton();
        btAdd = new JButton();
        btAddImg = new JButton();
        btDelete = new JButton();
        pnMain = new JPanel();
        scrollPane1 = new JScrollPane();
        areaNote = new JTextArea();
        tFContent = new JTextField();

        //======== this ========
        setBackground(new Color(0xe0d9fb));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(10, 10));

        //======== pnHead ========
        {
            pnHead.setBackground(new Color(0xf6bad5));

            pnHead.setLayout(new GridLayout(1, 2, 5, 0));

            //---- tFSearch ----
            tFSearch.setText("Search");
            tFSearch.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            pnHead.add(tFSearch);

            //---- labelLocation ----
            labelLocation.setText("Curent location:");
            labelLocation.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            pnHead.add(labelLocation);
        }
        contentPane.add(pnHead, BorderLayout.NORTH);

        //======== pnMenu ========
        {
            pnMenu.setBackground(new Color(0xccccff));
            pnMenu.setLayout(new GridLayout(2, 1, 10, 10));

            //======== pnMenuTop ========
            {
                pnMenuTop.setBackground(new Color(0xccccff));
                pnMenuTop.setLayout(new FlowLayout());

                //======== pnButton ========
                {
                    pnButton.setBackground(new Color(0xccccff));
                    pnButton.setLayout(new GridLayout(5, 1, 5, 5));

                    //---- btOpen ----
                    btOpen.setText("Open Note");
                    btOpen.setHorizontalAlignment(SwingConstants.LEADING);
                    btOpen.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btOpen);

                    //---- btSave ----
                    btSave.setText("Save Note");
                    btSave.setHorizontalAlignment(SwingConstants.LEADING);
                    btSave.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btSave);

                    //---- btAdd ----
                    btAdd.setText("Add Note");
                    btAdd.setHorizontalAlignment(SwingConstants.LEADING);
                    btAdd.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btAdd);

                    //---- btAddImg ----
                    btAddImg.setText("Add Image");
                    btAddImg.setHorizontalAlignment(SwingConstants.LEADING);
                    btAddImg.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btAddImg);

                    //---- btDelete ----
                    btDelete.setText("Delete Note");
                    btDelete.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btDelete);
                }
                pnMenuTop.add(pnButton);
            }
            pnMenu.add(pnMenuTop);
        }
        contentPane.add(pnMenu, BorderLayout.WEST);

        //======== pnMain ========
        {
            pnMain.setLayout(new BorderLayout(0, 5));

            //======== scrollPane1 ========
            {

                //---- areaNote ----
                areaNote.setText("Enter the content to note ...");
                areaNote.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                scrollPane1.setViewportView(areaNote);
            }
            pnMain.add(scrollPane1, BorderLayout.CENTER);

            //---- tFContent ----
            tFContent.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            tFContent.setText("Content");
            tFContent.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            pnMain.add(tFContent, BorderLayout.NORTH);
        }
        contentPane.add(pnMain, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());

    }

    //
    //
    private JPanel pnHead;
    private JTextField tFSearch;
    private JLabel labelLocation;
    private JPanel pnMenu;
    private JPanel pnMenuTop;
    private JPanel pnButton;
    private JButton btOpen;
    private JButton btSave;
    private JButton btAdd;
    private JButton btAddImg;
    private JButton btDelete;
    private JPanel pnMain;
    private JScrollPane scrollPane1;
    private JTextArea areaNote;
    private JTextField tFContent;


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Nguyen DInh Duy
        pnHead = new JPanel();
        pnHeadLeft = new JPanel();
        tFSearch = new JTextField();
        button1 = new JButton();
        labelLocation = new JLabel();
        pnMenu = new JPanel();
        pnMenuTop = new JPanel();
        pnButton = new JPanel();
        btOpen = new JButton();
        btSave = new JButton();
        btAdd = new JButton();
        btAddImg = new JButton();
        btDelete = new JButton();
        pnMain = new JPanel();
        scrollPane1 = new JScrollPane();
        areaNote = new JTextArea();
        tFContent = new JTextField();

        //======== this ========
        setBackground(new Color(0xe0d9fb));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(10, 10));

        //======== pnHead ========
        {
            pnHead.setBackground(new Color(0xf6bad5));
            pnHead.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
            new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
            , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
            , new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 )
            ,java . awt. Color .red ) ,pnHead. getBorder () ) ); pnHead. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
            ) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
            ;} } );
            pnHead.setLayout(new GridLayout(1, 2, 5, 0));

            //======== pnHeadLeft ========
            {
                pnHeadLeft.setLayout(new BorderLayout());

                //---- tFSearch ----
                tFSearch.setText("Search");
                tFSearch.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                pnHeadLeft.add(tFSearch, BorderLayout.CENTER);

                //---- button1 ----
                button1.setText("Enter");
                pnHeadLeft.add(button1, BorderLayout.EAST);
            }
            pnHead.add(pnHeadLeft);

            //---- labelLocation ----
            labelLocation.setText("Curent location:");
            labelLocation.setFont(new Font("Segoe UI", Font.PLAIN, 16));
            pnHead.add(labelLocation);
        }
        contentPane.add(pnHead, BorderLayout.NORTH);

        //======== pnMenu ========
        {
            pnMenu.setBackground(new Color(0xccccff));
            pnMenu.setLayout(new GridLayout(2, 1, 10, 10));

            //======== pnMenuTop ========
            {
                pnMenuTop.setBackground(new Color(0xccccff));
                pnMenuTop.setLayout(new FlowLayout());

                //======== pnButton ========
                {
                    pnButton.setBackground(new Color(0xccccff));
                    pnButton.setLayout(new GridLayout(5, 1, 5, 5));

                    //---- btOpen ----
                    btOpen.setText("Open Note");
                    btOpen.setHorizontalAlignment(SwingConstants.LEADING);
                    btOpen.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btOpen);

                    //---- btSave ----
                    btSave.setText("Save Note");
                    btSave.setHorizontalAlignment(SwingConstants.LEADING);
                    btSave.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btSave);

                    //---- btAdd ----
                    btAdd.setText("Add Note");
                    btAdd.setHorizontalAlignment(SwingConstants.LEADING);
                    btAdd.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btAdd);

                    //---- btAddImg ----
                    btAddImg.setText("Add Image");
                    btAddImg.setHorizontalAlignment(SwingConstants.LEADING);
                    btAddImg.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btAddImg);

                    //---- btDelete ----
                    btDelete.setText("Delete Note");
                    btDelete.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                    pnButton.add(btDelete);
                }
                pnMenuTop.add(pnButton);
            }
            pnMenu.add(pnMenuTop);
        }
        contentPane.add(pnMenu, BorderLayout.WEST);

        //======== pnMain ========
        {
            pnMain.setLayout(new BorderLayout(0, 5));

            //======== scrollPane1 ========
            {

                //---- areaNote ----
                areaNote.setText("Enter the content to note ...");
                areaNote.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                scrollPane1.setViewportView(areaNote);
            }
            pnMain.add(scrollPane1, BorderLayout.CENTER);

            //---- tFContent ----
            tFContent.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            tFContent.setText("Content");
            tFContent.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            pnMain.add(tFContent, BorderLayout.NORTH);
        }
        contentPane.add(pnMain, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Nguyen DInh Duy
    private JPanel pnHead;
    private JPanel pnHeadLeft;
    private JTextField tFSearch;
    private JButton button1;
    private JLabel labelLocation;
    private JPanel pnMenu;
    private JPanel pnMenuTop;
    private JPanel pnButton;
    private JButton btOpen;
    private JButton btSave;
    private JButton btAdd;
    private JButton btAddImg;
    private JButton btDelete;
    private JPanel pnMain;
    private JScrollPane scrollPane1;
    private JTextArea areaNote;
    private JTextField tFContent;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
