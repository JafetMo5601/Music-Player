package musicplayer.QueueModule;

import musicplayer.Song;

public class SongNodeQueue {
    public Song song;
    public SongNodeQueue next;

    public SongNodeQueue(Song song) {
        this.song = song;
    }    
}
