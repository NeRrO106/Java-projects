
package s4problema4;

import java.util.ArrayList;

public class S4problema4 {

    public static void main(String[] args) {
        ArrayList<Song> despreEl = new ArrayList<>();
        despreEl.add(new Song("cantec1", 1, "Compozitor"));
        despreEl.add(new Song("cantec2", 2, "Compozitor"));
        despreEl.add(new Song("cantec3", 3, "Compozitor"));
        despreEl.add(new Song("cantec4", 4, "Compozitor"));
        despreEl.add(new Song("cantec5", 5, "Compozitor"));
        
        DangerousAlbum dngAlb = new DangerousAlbum();
        ThrillerAlbum thrAlb = new ThrillerAlbum();
        BadAlbum badAlb = new BadAlbum();
        
        for(Song song : despreEl){
            if(song.getId() % 2 == 0){
                dngAlb.addSong(song);
            }
            if(song.getComposer().equals("Michael Jackson") && song.getId() % 2 == 0){
                thrAlb.addSong(song);
            }
            if(isPalindrom(song.getId()) && song.getName().length() == 3 && isLetter(song.getName())){
                badAlb.addSong(song);
            }
        }
    }
    
    public static boolean isPalindrom(int id){
        int temp = id; 
        int r, sum = 0;
        while(temp > 0){
            r = temp % 10;
            sum = (sum * 10) + r;
            temp /= 10;
        }
        if(sum == id) return true;
        else return false;
    }
    public static boolean isLetter(String name){
       if (name == null || name.isEmpty()) {
            return false;
        }
       for(int i = 0; i < name.length(); i++){
           if(!Character.isLetter(name.charAt(i))) return false;
           
       }
       return true;
    }
    
}
