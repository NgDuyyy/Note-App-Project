package NoteApp_Project.Model;

import java.io.Serializable;

class Note implements Serializable {
    private String content;
    private String imagePath;  // Đường dẫn đến hình ảnh

    public Note(String content) {
        this.content = content;
        this.imagePath = null;  // Ban đầu không có hình ảnh
    }

    public String getContent() {
        return content;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
