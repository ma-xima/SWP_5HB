package generics;

public class Newspaper {
    private String name;

    public Newspaper(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Zeitung: " + name;
    }
}
