package musicplayer;

public class DoubleCircularLinkedList {

    SongNodeDCLL head;
    SongNodeDCLL last;

    public boolean isEmpty() {
        return (head == null);
    }

    public void add(SongNodeDCLL newSong, int position) {
        if (position == 0) {
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
        } else {
            addPosition(newSong, position);
        }
    }
    
    public int countList(){
        SongNodeDCLL temp = head;
        int count = 0;
        while (temp.next != head){
            temp = temp.next;
            count += 1;
        }
        count += 1;
        return count;
    }

    public void addPosition(SongNodeDCLL newSong, int position) {
       SongNodeDCLL temp = head;
       int count = countList();
       if(temp == null || count < position){
           System.out.println("Valor invalido");
       }else{
           int i = 1;
           while (i < position -1){
               temp = temp.next;
               i++;
           }
           newSong.next = temp.next;
           (temp.next).prev = newSong;
           temp.next = newSong;
           newSong.prev = temp;
       }
    }

    public int IntegrarRecursivo(SongNodeQueue songNode) {
        if (songNode == null) {
            return 1;
        } else {
            SongNodeDCLL temp = new SongNodeDCLL(songNode.song);
            System.out.println("Convertido: " + temp.song.songName);
            buscar(temp); // envia el nombre
            return IntegrarRecursivo(songNode.next);
        }
    }

    public void buscar(SongNodeDCLL songNode) {
        if (!isEmpty()) {
            SongNodeDCLL temp = head;
            do {
                // Si el mae deberia estar despues por orden alfabetico
                // el mae lo ingresa como su anterior
                // si no que siga
                if (temp.song.songName.compareTo(songNode.song.songName) < 0) {
                    System.out.println("" + songNode.song.songName
                            + "Despues de " + temp.song.songName);
                    this.add(songNode);
                    break;
                } else {
                    System.out.println("Antes de " + temp.song.songName);
                }
                temp = temp.next;
            } while (temp != head);
        } else {
            System.out.println("Anadir cabeza");
            this.add(songNode);
        }
    }
}
