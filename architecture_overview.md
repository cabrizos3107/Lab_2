Architecture Overview

The system is a Modular Media Streaming Suite that plays media from different sources and supports extra features like subtitles, watermarking, and rendering modes.

It has five main parts:

MediaPlayer – the main controller that manages playback.

MediaSource – handles where the media comes from (local file, remote stream, or cached proxy).

Renderer – controls how media is rendered (hardware or software).

Media (with Decorators) – represents the media and adds features like subtitles and watermarking.

Playlist (Composite) – allows multiple media files or sub-playlists to be grouped together.

All these work together to make the player flexible and modular.