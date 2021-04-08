package musicplayer;

public class Queue {
    SongNode head = null;
    SongNode last = null;
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void enqueue(SongNode newSong){
        if(isEmpty()){
            System.out.println("Empty queue");
            head = newSong;
            last = newSong;
            System.out.println("New head " + head.song.songName);
        }else{
            last.next = newSong;
            last = newSong;
            System.out.println("New item added " + last.song.songName);
        }
    }
    
    public void dequeue(){
        if (isEmpty()){
            System.out.println("No items in the list");
        }else{
            SongNode oldHead = head;
            head = oldHead.next;
            System.out.println("New head " + head.song.songName);
        }
    }
}
