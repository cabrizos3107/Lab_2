# Modular Media Streaming Suite

## Description
This project is a **Modular Media Streaming Suite** built using **structural design patterns**. It supports:  

- Multiple media sources (local files, remote streams)  
- On-the-fly feature plugins (subtitles, watermark)  
- Playlists with single media and sub-playlists  
- Switching rendering strategy (hardware or software)  
- Remote stream caching  

Design patterns used: **Decorator, Adapter, Proxy, Bridge, Composite**.


## Project Structure
src/
├─ Main.java
├─ MediaPlayer.java
├─ MediaDecorator.java
├─ MediaSource.java
├─ Render.java
├─ Playlist.java
├─ RemoteStreamProxy.java
docs/
├─ UML_Class_Diagram.png
├─ Sequence_Diagrams.png
└─ Architecture_Overview.md



## How to Run

1. Open terminal / command prompt  
2. Navigate to the `src/` folder  
3. Compile all Java files:
javac *.java

4. Run the main program:
java Main


## What the Demo Shows

- Playing local and remote media files  
- Applying decorators like subtitles and watermark  
- Switching renderer from hardware to software  
- Using cached remote streams (Proxy Pattern)  
- Playing playlists with multiple media items  


## Notes
- Make sure Java is installed on your system  
- The code uses only console output, no GUI  
- All features are implemented to demonstrate **structural design patterns** 
