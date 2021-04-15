package musicplayer;

import javax.swing.JOptionPane;

public class DoubleCircularLinkedList {

    SongNodeDCLL head;
    SongNodeDCLL last;

    public boolean isEmpty() {
        return (head == null);
    }

    public void add(SongNodeDCLL newSong) {
        if (isEmpty()) {
            head = newSong;
            last = newSong;
            head.prev = last;
            head.next = last;
            last.prev = head;
            last.next = head;
        } else {
            last.next = newSong;
            newSong.prev = last;
            newSong.next = head;
            head.prev = newSong;
            last = newSong;
        }
    }
    
    public int IntegrarRecursivo(SongNodeQueue songNode){
        if(songNode == null) {
            return 1;
        } else {
            SongNodeDCLL temp = new SongNodeDCLL(songNode.song);
            this.add(temp);
            return IntegrarRecursivo(songNode.next);
        }
    }

//    public void next(SongNodeDCLL song) {
//        SongNodeDCLL actual = new SongNodeDCLL(song);
//        if (isEmpty()) {
//            JOptionPane.showMessageDialog(null, "The playlist is empty cannot play the next song");
//        } else {
//
//            actual = head;
//            actual = actual.next;
//        }
//
//    }
//
//    public void prev(SongNodeDCLL song) {
//        SongNodeDCLL actual = new SongNodeDCLL(song);
//
//        if (isEmpty()) {
//            JOptionPane.showMessageDialog(null, "The playlist is empty cannot play the previous song");
//        } else {
//            actual = head;
//            actual = actual.prev;
//        }
//
//    }

}
