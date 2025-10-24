public class Main {
    public static void main(String[] args) {

        // Bridge pattern: switch rendering at runtime
        Renderer hardware = new HardwareRenderer();
        Renderer software = new SoftwareRenderer();
        MediaPlayer player = new MediaPlayer(hardware);

        // Adapter + Proxy pattern: different sources
        MediaSource local = new LocalFileSource("music.mp3");
        MediaSource remote = new RemoteStreamAdapter(new RemoteStream("https://example.com/stream"));
        MediaSource cachedRemote = new RemoteStreamProxy(new RemoteStream("https://example.com/live"));

        // Decorator pattern: add features
        Media basicMedia = new BasicMedia("Chill Beats");
        Media decoratedMedia = new WatermarkDecorator(new SubtitleDecorator(basicMedia));

        // Composite pattern: create playlists
        SingleMedia song1 = new SingleMedia("Song 1");
        SingleMedia song2 = new SingleMedia("Song 2");
        Playlist playlist = new Playlist("My Mix");
        playlist.add(song1);
        playlist.add(song2);

        // Playing local file
        player.play(local, "music.mp3");

        // Playing remote stream
        player.setRenderer(software);
        player.play(remote, "Live Stream");

        // Playing cached remote (proxy)
        player.play(cachedRemote, "Cached Stream");

        // Applying decorators
        System.out.println("Applying Media Decorators:");
        decoratedMedia.play();

        // Playing a playlist
        playlist.play();
    }
}
