package generics;

import java.util.ArrayList;

public class GenericMediaLibrary<T> {
    private ArrayList<T> mediaList = new ArrayList<>();

    public void addMedia(T media) {
        mediaList.add(media);
    }

    public T retrieveLast() {
        if (mediaList.isEmpty()) {
            return null;
        }
        return mediaList.get(mediaList.size() - 1);
    }
}
