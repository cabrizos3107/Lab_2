// Bridge Pattern 
interface Renderer {
    void render(String media);
}

class HardwareRenderer implements Renderer {
    public void render(String media) {
        System.out.println("Rendering '" + media + "' using Hardware Renderer.");
    }
}

class SoftwareRenderer implements Renderer {
    public void render(String media) {
        System.out.println("Rendering '" + media + "' using Software Renderer.");
    }
}
