// Composite Pattern Example
import java.util.ArrayList;
import java.util.List;

// Common interface
interface Playable {
    void play();
}

// Single media item (Leaf)
class SingleMedia implements Playable {
    private String name;
    public SingleMedia(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println("Playing: " + name);
    }
}

// Playlist (Composite)
class Playlist implements Playable {
    private String name;
    private List<Playable> items = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void add(Playable playable) {
        items.add(playable);
    }

    public void remove(Playable playable) {
        items.remove(playable);
    }

    public void play() {
        System.out.println("\nPlaylist: " + name);
        for (Playable item : items) {
            item.play();
        }
        System.out.println("End of playlist: " + name + "\n");
    }
}
