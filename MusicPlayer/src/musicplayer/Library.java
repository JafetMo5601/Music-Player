package musicplayer;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Library {
    public SongNodeQueue generateSongNode(
            String name, String artist, String year, int duration){
        return new SongNodeQueue(new Song(name, artist, year, duration));
    }
    
    public DefaultTableModel getModel(JTable table){
        return (DefaultTableModel) table.getModel();
    }
    
    public void clearTable(DefaultTableModel model){
        model.setRowCount(0);
    }
    
    public void updateTable(JTable musicTable, Queue list){
        DefaultTableModel m = getModel(musicTable);
        clearTable(m);
        SongNodeQueue temp = list.head; 
        if(!list.isEmpty()){
            do{
                m.addRow(new Object[]{
                    temp.song.artist,
                    temp.song.songName,
                    temp.song.duration,
                    temp.song.year});
                temp = temp.next;
            }while(temp != null);
        }
    }
}
