# Lab_2
Structural Design Patterns
# Modular Media Streaming Suite — Lab 2

Simple demo project that uses structural design patterns:
Adapter, Decorator, Bridge, Composite.

## Files to run
Put Java files in `src/`:
- Main.java
- MediaPlayer.java
- MediaSource.java
- MediaDecorator.java
- Renderer.java

Docs are in `docs/`.

## How to compile & run (simple)
1. Open terminal in project root.
2. Compile all Java files (example):
   javac src/*.java
3. Run:
   java -cp src Main

You will see console output showing:
- different media sources (adapter)
- switching renderers (bridge)
- decorated media with subtitles and watermark (decorator)

## Tests
This project is a simple console demo. For unit tests, create test files and use your preferred test framework.


