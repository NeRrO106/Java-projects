package s4problema4;

import java.util.ArrayList;

public class DangerousAlbum extends Album {
    ArrayList<Song> song = new ArrayList<>();
    @Override
    void addSong(Song sg) {
        song.add(sg);
    }
    
    
}
