package generics;

public class Video {
    private String title;

    public Video(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Video: " + title;
    }
}