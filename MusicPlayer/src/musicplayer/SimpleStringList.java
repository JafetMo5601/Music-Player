package musicplayer;

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

    public String print() {
        String lista = "";
        if (isEmpty()) {
            lista = "Vacía";
        } else {
            GenresNodeList temporal = head;
            do {
                lista += temporal.genreName + " - ";
                temporal = temporal.next;
            } while (temporal != null);
            lista += " FIN";
        }
        return lista;
    }
}
