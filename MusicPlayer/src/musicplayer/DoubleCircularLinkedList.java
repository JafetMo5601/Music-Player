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
        }
    }

    public int IntegrarRecursivo(SongNodeQueue songNode) {
        if (songNode == null) {
            return 1;
        } else {
            SongNodeDCLL temp = new SongNodeDCLL(songNode.song);
            // buscar(temp.song.songName); // envia el nombre
//            this.add(temp);
            return IntegrarRecursivo(songNode.next);
        }
    }

    public void buscar(String nombre) {
        // El mae va a buscar el campo donde entrar
        if (!isEmpty()) {
            SongNodeDCLL temp = head;
            do {
                // Si el mae deberia estar despues por orden alfabetico
                // el mae lo ingresa como su anterior
                // si no que siga
                if (temp.song.songName.equals(nombre)) {
                    break;
                }
                temp = temp.next;
            } while (temp != head);
        }
    }
}
