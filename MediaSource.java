// Adapter Pattern Example
interface MediaSource {
    void play();
}

// Local File Source
class LocalFileSource implements MediaSource {
    private String fileName;
    public LocalFileSource(String fileName) {
        this.fileName = fileName;
    }
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }
}

// Remote Stream Source (incompatible, so we adapt it)
class RemoteStream {
    private String url;
    public RemoteStream(String url) {
        this.url = url;
    }

    public void streamPlay() {
        System.out.println("Streaming from: " + url);
    }

    // 👇 This is the added method
    public String getUrl() {
        return url;
    }
}

// Adapter class
class RemoteStreamAdapter implements MediaSource {
    private RemoteStream remoteStream;
    public RemoteStreamAdapter(RemoteStream remoteStream) {
        this.remoteStream = remoteStream;
    }
    public void play() {
        remoteStream.streamPlay();
    }
}
