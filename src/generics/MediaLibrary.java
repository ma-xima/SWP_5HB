package generics;

import java.util.ArrayList;

public class MediaLibrary {
    private ArrayList<Object> mediaList = new ArrayList<>();

    public void addMedia(Object media) {
        mediaList.add(media);
    }

    public Object retrieveLast() {
        if (mediaList.isEmpty()) {
            return null;
        }
        return mediaList.get(mediaList.size() - 1);
    }
}
