package musicplayer.LinkedListModule;

public class SimpleStringList {
    public GenresNodeList head;

    public void add(String genre) {
        GenresNodeList newGenre = new GenresNodeList(genre);
        if (isEmpty()) {
            head = newGenre;
        } else {
            GenresNodeList temporal = head;
            while (temporal.next != null) {
                temporal = temporal.next;
            }
            temporal.next = newGenre;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String printGenres() {
        String list = "";
        if (isEmpty()) {
            list = "Empty!";
        } else {
            GenresNodeList temp = head;
            do {
                list += temp.genreName + " ";
                temp = temp.next;
            } while (temp != null);
        }
        return list;
    }
}
