package musicplayer.DCLLModule;

import musicplayer.QueueModule.SongNodeQueue;

public class DoubleCircularLinkedList {
    public SongNodeDCLL head;
    public SongNodeDCLL last;

    public boolean isEmpty() {
        return (head == null);
    }

    public void add(SongNodeQueue newSong) {
        SongNodeDCLL newSongDCLL = new SongNodeDCLL(newSong.song);
        if (isEmpty()) {
            head = newSongDCLL;
            last = newSongDCLL;
            head.prev = last;
            head.next = last;
            last.prev = head;
            last.next = head;
        } else {
            last.next = newSongDCLL;
            newSongDCLL.prev = last;
            newSongDCLL.next = head;
            head.prev = newSongDCLL;
            last = newSongDCLL;
        }
    }

//    private void addAfter(SongNodeDCLL previousNode, SongNodeQueue songNode) {
//        SongNodeDCLL newNode = new SongNodeDCLL(songNode.song);
//        SongNodeDCLL temp = head;
//
//        while (temp != previousNode) {
//            temp = temp.next;
//        }
//        SongNodeDCLL next = temp.next;
//        temp.next = newNode;
//        newNode.prev = temp;
//        newNode.next = next;
//        next.prev = newNode;
//    }
//
//    private void addBefore(SongNodeDCLL followingNode, SongNodeQueue songNode) {
//        SongNodeDCLL newNode = new SongNodeDCLL(songNode.song);
//        SongNodeDCLL temp = head;
//        while (temp != followingNode) {
//            temp = temp.next;
//        }
//        SongNodeDCLL prev = temp.prev;
//        temp.prev = newNode;
//        newNode.prev = prev;
//        newNode.next = temp;
//        prev.next = newNode;
//    }

    public int IntegrarRecursivo(SongNodeQueue songNode) {
        if (songNode == null) {
            return 1;
        } else {
            System.out.println("Currently inserting: " + songNode.song.songName);
            add(songNode);
            return IntegrarRecursivo(songNode.next);
        }
    }

    public void printList() {
        if (!isEmpty()) {
            System.out.println("The list is: ");
            SongNodeDCLL temp = head;
            do {
                System.out.print(temp.song.songName + ": " + temp.song.genres.printGenres());
                temp = temp.next;
            } while (temp != head);
            System.out.println(".");
        } else {
            System.out.println("Is empty");
        }
    }

    public int quantity() {
        int count = 0;
        if (!isEmpty()) {
            SongNodeDCLL temp = head;
            count += 1;
            while (temp != last) {
                count += 1;
                temp = temp.next;
            }
        }
        return count;
    }
}
