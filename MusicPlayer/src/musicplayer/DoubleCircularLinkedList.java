package musicplayer;

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
            System.out.println("Prev: " + newSong.prev.song.songName
                    + " current " + newSong.song.songName + " next: "
                    + newSong.next.song.songName);
        }
    }

    public void addBefore(SongNodeDCLL newSong, SongNodeDCLL prevSong) {
        SongNodeDCLL temp = head;
        while (temp != prevSong) {
            temp = temp.next;
        }

        newSong.next = prevSong.next;
        (prevSong.next).prev = newSong;
        prevSong.next = newSong;
        newSong.prev = prevSong;
    }

    public int IntegrarRecursivo(SongNodeQueue songNode) {
        if (songNode == null) {
            return 1;
        } else {
            SongNodeDCLL temp = new SongNodeDCLL(songNode.song);
            System.out.println("Current converted: " + temp.song.songName);
            buscar(temp);
            return IntegrarRecursivo(songNode.next);
        }
    }

    public void buscar(SongNodeDCLL songNode) {
        if (!isEmpty()) {
            SongNodeDCLL temp = head;
            do {
                if (temp.song.songName.compareTo(songNode.song.songName) > 0) {
                    System.out.println(temp.song.songName);
                    System.out.println(songNode.song.songName);
//                    System.out.println("" + temp.prev.song.songName + 
//                            " will be before of " + songNode.song.songName);
                    this.addBefore(songNode, temp.prev);
                    break;
                }
                temp = temp.next;
            } while (temp != head);
            this.add(songNode);
        } else {
            this.add(songNode);
        }
    }

    public void printList() {
        System.out.println("The list is: ");
        SongNodeDCLL temp = head;
        while (temp.next != head) {
            System.out.println("Entering to the while");
            System.out.println(temp.song.songName);
            temp = temp.next;
        }
        System.out.println("After the while");
    }
}
