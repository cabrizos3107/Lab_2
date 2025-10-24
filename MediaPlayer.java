class MediaPlayer {
    private Renderer renderer;

    public MediaPlayer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void play(MediaSource source, String name) {
        System.out.println("\n--- Media Player ---");
        source.play();
        renderer.render(name);
        System.out.println("--------------------\n");
    }
}
