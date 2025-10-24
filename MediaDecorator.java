// Decorator Pattern Example
interface Media {
    void play();
}

// Base media class
class BasicMedia implements Media {
    private String name;
    public BasicMedia(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println("Playing media: " + name);
    }
}

// Abstract decorator
abstract class MediaDecorator implements Media {
    protected Media decoratedMedia;
    public MediaDecorator(Media decoratedMedia) {
        this.decoratedMedia = decoratedMedia;
    }
    public void play() {
        decoratedMedia.play();
    }
}

// Subtitle decorator
class SubtitleDecorator extends MediaDecorator {
    public SubtitleDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }
    public void play() {
        super.play();
        System.out.println("→ Subtitles Enabled");
    }
}

// Watermark decorator
class WatermarkDecorator extends MediaDecorator {
    public WatermarkDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }
    public void play() {
        super.play();
        System.out.println("→ Watermark Displayed");
    }
}
