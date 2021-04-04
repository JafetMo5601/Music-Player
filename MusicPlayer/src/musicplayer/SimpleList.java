package musicplayer;

public class SimpleList {
    SongNode head;
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void add(SongNode newSong){
        if(isEmpty()){
            head = newSong;
        }else{
            SongNode temp = head;
            
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newSong;   
        }
    }
    
    public void remove(){
        
    }
}
