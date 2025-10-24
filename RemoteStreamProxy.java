// Proxy Pattern Example
class RemoteStreamProxy implements MediaSource {
    private RemoteStream realStream;
    private boolean isCached = false;

    public RemoteStreamProxy(RemoteStream realStream) {
        this.realStream = realStream;
    }

    public void play() {
        if (!isCached) {
            System.out.println("Caching stream from: " + realStream.getUrl());
            isCached = true;
        } else {
            System.out.println("Using cached stream...");
        }
        realStream.streamPlay();
    }
}
