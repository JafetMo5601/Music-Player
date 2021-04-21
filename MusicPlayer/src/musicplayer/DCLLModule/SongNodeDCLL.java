package musicplayer.DCLLModule;

import musicplayer.Song;

public class SongNodeDCLL {
    public Song song;
    public SongNodeDCLL prev;
    public SongNodeDCLL next;

    public SongNodeDCLL(Song song) {
        this.song = song;
    }    
}
