import java.util.ArrayList;

/*
Desert Island Playlist
You’re heading to a desert island, cut off from the world, for the next six months. Luckily, you can bring a playlist of your favorite music ♪♪

Also, this is a chance to put your hard-earned Java skills to the test. Your mission, should you choose to accept it:

Build Playlist.java with the best possible playlist of music using a Java ArrayList. Choose wisely.
*/

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("It's my life");
        desertIslandPlaylist.add("Unforgiven");
        desertIslandPlaylist.add("we on");
        desertIslandPlaylist.add("Songa");
        desertIslandPlaylist.add("Songb");
        desertIslandPlaylist.add("Songc");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(0);

        String a = desertIslandPlaylist.get(3);
        String b = desertIslandPlaylist.get(2);
        String temp = a;
        desertIslandPlaylist.set(3, b);
        desertIslandPlaylist.set(2,temp);
        System.out.println(desertIslandPlaylist);

    }

}