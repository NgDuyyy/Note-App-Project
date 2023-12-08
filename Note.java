package NoteApp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Note {
    private String title;
    private String content;
    private LocalDateTime reminder;
    private String imagePath;
    private List<Note> children;
    private Note parent;

    public Note(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    // Getters and Setters

    public void addChild(Note child) {
        child.setParent(this);
        children.add(child);
    }

    public void setParent(Note parent) {
        this.parent = parent;
    }

    public Note getParent() {
        return parent;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setReminder(LocalDateTime reminder) {
        this.reminder = reminder;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public List<Note> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return title;
    }
}
