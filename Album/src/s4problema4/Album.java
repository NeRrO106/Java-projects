
package s4problema4;

import java.util.ArrayList;

public abstract class Album{
    ArrayList<Song> songs  = new ArrayList<Song>();
    abstract void addSong(Song sg);
    void removeSong(Song sg){
        songs.remove(sg);
    }
    @Override
    public String toString(){
        return "Songs: " + songs;
    }
}
