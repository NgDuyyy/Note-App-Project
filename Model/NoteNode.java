package NoteApp_Project.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class NoteNode implements Serializable {
    private Note note;
    private List<NoteNode> children;

    public NoteNode(Note note) {
        this.note = note;
        this.children = new ArrayList<>();
    }

    public Note getNote() {
        return note;
    }

    public List<NoteNode> getChildren() {
        return children;
    }

    public void addChild(NoteNode childNode) {
        children.add(childNode);
    }

    public void removeChild(NoteNode childNode) {
        children.remove(childNode);
    }
}
