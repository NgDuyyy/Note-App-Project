package NoteApp_Project.Controller;

import NoteApp_Project.View.NoteView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoteListener implements ActionListener {
    private NoteView nV;
    public NoteListener(NoteView nV) {
        nV = nV;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String btn = e.getActionCommand();
        
        if (btn.equals("Open Note")) {
            
        } else if (btn.equals("Save Note")) {
            
        } else if (btn.equals("Add Note")) {

        } else if (btn.equals("Add Image")) {

        } else if (btn.equals("Delete Note")) {

        }
    }
}
