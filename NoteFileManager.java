package NoteApp;

import java.io.*;
import java.util.List;

public class NoteFileManager {

    public static void saveNotesToFile(List<Note> notes, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(notes);
            System.out.println("Notes saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving notes to file: " + e.getMessage());
        }
    }

    public static List<Note> loadNotesFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Note>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading notes from file: " + e.getMessage());
        }
        return null;
    }
}

