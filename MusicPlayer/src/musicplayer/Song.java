package musicplayer;

public class Song {
    public String songName;
    public String artist;
    public String year;
    public int duration;

    public Song(String songName, String artist, String year, int duration) {
        this.songName = songName;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
    }    
}
