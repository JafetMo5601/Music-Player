package musicplayer;

public class SongNode {
    protected String songName;
    protected String Artist;
    protected String Album;
    protected int duration;
    
    public SongNode(String songName, String Artist, String Album, int duration) {
        this.songName = songName;
        this.Artist = Artist;
        this.Album = Album;
        this.duration = duration;
    }
}
