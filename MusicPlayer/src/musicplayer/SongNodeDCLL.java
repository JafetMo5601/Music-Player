package musicplayer;

public class SongNodeDCLL {
    Song song;
    SongNodeDCLL prev;
    SongNodeDCLL next;

    public SongNodeDCLL(Song song) {
        this.song = song;
    }    
}
