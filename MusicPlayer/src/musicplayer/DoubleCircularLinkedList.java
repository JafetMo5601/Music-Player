package musicplayer;

public class DoubleCircularLinkedList {
    SongNodeDCLL head;
    SongNodeDCLL last;
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void add(SongNodeDCLL newSong){
        if(isEmpty()){
            head = newSong;
            last = newSong;
            head.prev = last;
            head.next = last;
            last.prev = head;
            last.next = head;
        }else{
            last.next = newSong;
            newSong.prev = last; 
            newSong.next = head;
            head.prev = newSong;
            last = newSong;
        }
    }
}
