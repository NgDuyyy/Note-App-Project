package NoteApp;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class NoteManager {
    private Note rootNote;
    private List<Note> notes;

    public NoteManager() {
        this.rootNote = new Note("Root");
    }

    // Methods for creating, editing, deleting, and displaying notes...

    public void createNote(String title, String content, String imagePath) {
        Note newNote = new Note(title);
        newNote.setContent(content);
        newNote.setImagePath(imagePath);
        rootNote.addChild(newNote);
    }

    public void deleteNote(Note noteToDelete) {
        if (noteToDelete != null) {
            Note parentNote = noteToDelete.getParent();
            if (parentNote != null) {
                parentNote.getChildren().remove(noteToDelete);
            }
        }
    }


    public List<Note> flattenNotes () {
        List<Note> flattenedNotes = new ArrayList<>();
        flattenNotes(rootNote, flattenedNotes);
        return flattenedNotes;
    }

    private void flattenNotes (Note note, List < Note > flattenedNotes){
        flattenedNotes.add(note);
        if (note.getChildren() != null) {
            for (Note child : note.getChildren()) {
                flattenNotes(child, flattenedNotes);
            }
        }
    }

    public void saveNotesToFile (String filePath){
        List<Note> flattenedNotes = flattenNotes();
        NoteFileManager.saveNotesToFile(flattenedNotes, filePath);
    }

    public void loadNotesFromFile (String filePath){
        notes = NoteFileManager.loadNotesFromFile(filePath);
        rebuildNoteHierarchy();
    }

    private void rebuildNoteHierarchy () {
        rootNote = new Note("Root");
        for (Note note : notes) {
            if (note.getParent() == null) {
                rootNote.addChild(note);
            }
        }
    }

    public void addImageToNote(Note note, String imagePath) {
        try {
            BufferedImage originalImage = ImageIO.read(new File(imagePath));
            // Resize the image (you can customize the width and height)
            int newWidth = 100; // Set your desired width
            int newHeight = 100; // Set your desired height
            Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_DEFAULT);

            // Convert Image to BufferedImage
            BufferedImage bufferedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
            bufferedImage.getGraphics().drawImage(resizedImage, 0, 0, null);

            // Save the resized image path to the note
            note.setImagePath(saveResizedImage(bufferedImage, imagePath));
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    private String saveResizedImage(BufferedImage image, String originalImagePath) throws IOException {
        String resizedImagePath = originalImagePath.replace(".", "_resized."); // Modify the path as needed
        ImageIO.write(image, "png", new File(resizedImagePath));
        return resizedImagePath;
    }
}




