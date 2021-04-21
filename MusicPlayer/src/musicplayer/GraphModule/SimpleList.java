package musicplayer.GraphModule;

import musicplayer.DCLLModule.SongNodeDCLL;

public class SimpleList {
    private SongNodeList head;

    public void add(SongNodeDCLL song) {
        SongNodeList newSong = new SongNodeList(song.song);
        if (isEmpty()) {
            head = newSong;
        } else {
            SongNodeList temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newSong;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String printList() {
        String list = "";
        if (isEmpty()) {
            list = "Empty!";
        } else {
            SongNodeList temp = head;
            do {
                list += temp.song.songName + " ";
                temp = temp.next;
            } while (temp != null);
        }
        return list;
    }
    
    public int quantity(){
        int count = 0;
        if(!isEmpty()){
            SongNodeList temp = head;   
            do{
                count += 1;
                temp = temp.next;
            }while(temp != null);
        }
        return count;
    }
}
