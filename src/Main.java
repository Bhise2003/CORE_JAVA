import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Album1","AC/DC");

        album.addSong("TNT",4.5);
        album.addSong("Highway to hell",3.5);
        album.addSong("ThunderStruck",5.0);
        albums.add(album);

        album = new Album("ablum2","eminem");


        album.addSong("Rap god",3.5);
        album.addSong("lose your self",4.5);
        album.addSong("Not afraid",5.0);

        albums.add(album);

        LinkedList<Song> Playlist1 = new LinkedList<>();

        albums.get(0).addToPlaylist("TNT",Playlist1);
        albums.get(0).addToPlaylist("Highway to hell",Playlist1);
        albums.get(0).addToPlaylist("Rap god",Playlist1);
        albums.get(0).addToPlaylist("Lose your self",Playlist1);


        play(Playlist1);



    }
    private static void play(LinkedList<Song> playlist){

    }

    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0-to quit\n");

    }



}