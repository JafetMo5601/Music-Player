package musicplayer.GraphModule;

import musicplayer.Song;

public class SongNodeList {
    Song song;
    SongNodeList next;
    
    public SongNodeList (Song song){
        this.song = song;
    }   
}
