package musicplayer.QueueModule;

import javax.swing.JOptionPane;
import musicplayer.Song;

public class Queue {
    public SongNodeQueue head = null;
    public SongNodeQueue last = null;
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void enqueue(Song song){
        SongNodeQueue newSong = new SongNodeQueue(song);
        if(isEmpty()){
            head = newSong;
            last = newSong;
        }else{
            last.next = newSong;
            last = newSong;
        }
    }
    
    public void dequeue(){
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "No items in the list to dequeue");
        }else{
            SongNodeQueue oldHead = head;
            head = oldHead.next;
        }
    }
}
