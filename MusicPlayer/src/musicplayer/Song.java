package musicplayer;

import musicplayer.LinkedListModule.SimpleStringList;

public class Song {
    public String songName;
    public String artist;
    public String year;
    public int duration;
    public SimpleStringList genres;

    public Song(String songName, String artist, String year, int duration) {
        this.songName = songName;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
    }    

    public SimpleStringList getGenres() {
        return genres;
    }

    public void setGenres(SimpleStringList genres) {
        this.genres = genres;
    }
    
}
