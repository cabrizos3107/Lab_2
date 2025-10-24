Design Rationale

This media player project uses several design patterns to make the system easy to understand, flexible, and simple to update.
The patterns used are Adapter, Decorator, Proxy, and Composite. Each pattern has its own purpose in how the media player works.

1. Adapter Pattern

The Adapter Pattern helps connect two classes that normally cannot work together.
In this project, it connects the RemoteStream class (which uses streamPlay()) to the MediaSource interface (which uses play()).

Since their methods are different, we made an adapter class called RemoteStreamAdapter.
This adapter changes the streamPlay() method into a play() method, so both local and remote media can work the same way.

Why it’s used:
Without the adapter, we would need separate code for local and remote media.
With it, the system becomes more flexible and easier to maintain.

2. Decorator Pattern

The Decorator Pattern is used to add extra features to an object without changing its main class.
In this project, it’s used to add effects like watermarks or captions to a media file while playing.

The MediaDecorator class wraps around the main MediaSource.
It can show extra messages or actions before or after calling play().
You can also stack many decorators together to add more than one effect.

Why it’s used:
This pattern makes it easy to add new features without editing the main class.
It also avoids code repetition.

3. Proxy Pattern

The Proxy Pattern acts as a middleman between the user and another class.
Here, the RemoteStreamProxy works between the player and the remote stream.

When playing a remote media file, the proxy checks if it is already cached (saved locally).
If yes, it plays the cached version instead of downloading it again.
If not, it streams the file and saves it for later use.

Why it’s used:
It makes playback faster and saves internet data.
The proxy also hides complex code and makes the system easier for users.

4. Composite Pattern

The Composite Pattern lets the system treat a single object and a group of objects the same way.
In this project, it helps build playlists that can contain both media files and other playlists.

For example, a “Main Playlist” can have smaller playlists like “Music” or “Podcasts.”
When you call play() on the main playlist, it will automatically play everything inside.

Why it’s used:
It makes managing playlists simple and consistent.
The same code can play one file or many files together.