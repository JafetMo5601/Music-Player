package musicplayer;

public class Graph {
    public int verticesQuantity = 0;
    public SimpleList vertices[];

    public Graph() {
        verticesQuantity = 8;
        vertices = new SimpleList[verticesQuantity];
        for (int i = 0; i < verticesQuantity; i++) {
            vertices[i] = new SimpleList();
        }
    }
    
    public void fillEdges(DoubleCircularLinkedList songsList){
        SongNodeDCLL temp = songsList.head;
        do{
            addEdge(temp);
        }while(temp.next != songsList.head);
    }

    public void addEdge(SongNodeDCLL song) {
        GenresNodeList tempNode = song.song.genres.head;
        do{
            if (tempNode.genreName.equals("Merengue")){
                System.out.println("Adding to Merengue");
                vertices[0].add(song);
            }
            if (tempNode.genreName.equals("Pop")){
                System.out.println("Adding to Pop");
                vertices[1].add(song);
            }
            if (tempNode.genreName.equals("Electronic")){
                System.out.println("Adding to Electronic");
                vertices[2].add(song);
            }
            if (tempNode.genreName.equals("Reggae")){
                System.out.println("Adding to Reggae");
                vertices[3].add(song);
            }
            if (tempNode.genreName.equals("Salsa")){
                System.out.println("Adding to Salsa");
                vertices[4].add(song);
            }
            if (tempNode.genreName.equals("Rock")){
                System.out.println("Adding to Rock");
                vertices[5].add(song);
            }
            if (tempNode.genreName.equals("Instrumental")){
                System.out.println("Adding to Instrumental");
                vertices[6].add(song);
            }
            if (tempNode.genreName.equals("Reggaeton")){
                System.out.println("Adding to Reggaeton");
                vertices[7].add(song);
            }
            tempNode = tempNode.next;
        } while (tempNode.next != null);
    }
    
    public int totalEdges(){
        int total = 0;
        for (int i = 0; i < verticesQuantity; i++){
            total += vertices[i].quantity();
        }
        return total/2;
    }
    
    public int edgesToMerengue(){
        return vertices[0].quantity();
    }
    
    public int edgesToPop(){
        return vertices[1].quantity();
    }
    
    public int edgesToElectronic(){
        return vertices[2].quantity();
    }
    
    public int edgesToReggae(){
        return vertices[3].quantity();
    }
    
    public int edgesToSalsa(){
        return vertices[4].quantity();
    }
    
    public int edgesToRock(){
        return vertices[5].quantity();
    }
    
    public int edgesToInstrumental(){
        return vertices[6].quantity();
    }
    
    public int edgesToReggaeton(){
        return vertices[7].quantity();
    }
    
    public void printGraph(){
        for (int i = 0; i < verticesQuantity; i++){
            if(!vertices[i].isEmpty()){
                System.out.println("The node " + i + "connects with the nodes: "
                        + vertices[i].printList() + "\n");
            }
        }
    }
}
