package NoteApp_Project.Model;

import java.io.*;

public class NoteTree implements Serializable {
    private NoteNode root;

    public NoteTree() {
        this.root = null;
    }

    public NoteNode getRoot() {
        return root;
    }

    public void addRoot(Note rootNote) {
        this.root = new NoteNode(rootNote);
    }

    public void addNote(Note parentNote, Note newNote) {
        NoteNode parentNode = findNoteNode(parentNote, root);
        if (parentNode != null) {
            NoteNode newNoteNode = new NoteNode(newNote);
            parentNode.addChild(newNoteNode);
        } else {
            System.out.println("Parent note not found.");
        }
    }

    public void removeNote(Note noteToRemove) {
        NoteNode nodeToRemove = findNoteNode(noteToRemove, root);
        if (nodeToRemove != null) {
            NoteNode parentNode = findParentNode(noteToRemove, root);
            if (parentNode != null) {
                parentNode.removeChild(nodeToRemove);
            } else {
                System.out.println("Error: Root note cannot be removed.");
            }
        } else {
            System.out.println("Note not found.");
        }
    }

    private NoteNode findNoteNode(Note note, NoteNode node) {
        if (node != null && node.getNote().equals(note)) {
            return node;
        } else {
            for (NoteNode child : node.getChildren()) {
                NoteNode found = findNoteNode(note, child);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }

    private NoteNode findParentNode(Note note, NoteNode node) {
        if (node != null) {
            for (NoteNode child : node.getChildren()) {
                if (child.getNote().equals(note)) {
                    return node;
                } else {
                    NoteNode found = findParentNode(note, child);
                    if (found != null) {
                        return found;
                    }
                }
            }
        }
        return null;
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
            System.out.println("NoteTree saved to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static NoteTree loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            NoteTree loadedNoteTree = (NoteTree) ois.readObject();
            System.out.println("NoteTree loaded from file: " + filename);
            return loadedNoteTree;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

