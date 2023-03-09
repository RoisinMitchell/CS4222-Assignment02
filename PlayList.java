import java.util.*;
public class PlayList {// Create a PlayList with a default name (e.g. My PlayList)

    private String playListName = "";
    private ArrayList<Track> tracks = new ArrayList<>();
    private ArrayList<Track> randomTracks = new ArrayList<>();
    private ArrayList<Track> artistTracks = new ArrayList<>();
    private ArrayList<Track> yearTracks = new ArrayList<>();

    public PlayList() {
        this.playListName = "My Playlist";
    }

    public PlayList(String playListName) {
        this.playListName = playListName;
    }
    public String toString(){
        //I am aware I could print the array directly and it is readable this way, however I want it to look nice
        String printTracks = "";
        for(Track track: tracks) {
            printTracks += "Title: " + track.getTitle() + "\nArtist: " + track.getArtist() + "\nDuration: " + track.getDuration() + "\nYear: " + track.getYear() + "\n\n";
        }
        return printTracks;
    }

    public void setName(String name) {
        playListName = name;
    }

    public String getName() {
        return playListName;
    }

    public void add(String title, String artist){
        tracks.add(new Track(title, artist));
    }

    public void add(String title, String artist, int year, int duration){
        tracks.add(new Track(title, artist, year, duration));
    }

    public void add(Track t){
        tracks.add(t);
    }
    public boolean remove(String title){
        boolean result = false;
        for (Track track : tracks) {
            String comparisonTrack = track.getTitle();
            result = comparisonTrack.equalsIgnoreCase(title);
            if(result == true) {
                tracks.remove(track);
            }
        }
        return result;
    }

    public void showList(){
        boolean empty = tracks.isEmpty();
        if(empty == false){
            System.out.println(tracks.toString());
        }else{
            System.out.println("The list is empty");
        }
    }
    public void playAll(boolean random){
        if(!random){
            System.out.println("Tracks Playing In Order:\n-----------------------\n" + this.toString());
        }else {
            randomTracks.addAll(tracks);
            Collections.shuffle(randomTracks);

            String printTracks = "Playing Random Songs:\n";
            for (Track track : randomTracks) {
                System.out.println("Title: " + track.getTitle() + "\nArtist: " + track.getArtist() + "\nDuration: " + track.getDuration() + "\nYear: " + track.getYear() + "\n\n");
            }
        }
    }
    public void playOnly(String artist){
        for(Track track: tracks){
            boolean result = track.getArtist().equalsIgnoreCase(artist);
            if(result){
                artistTracks.add(track);
            }
        }
        System.out.println("\n-------------\nSONGS BY "+artist.toUpperCase()+"\n-------------\n");
        for(Track track: artistTracks) {
            System.out.println( "Title: " + track.getTitle() + "\nArtist: " + track.getArtist() + "\nDuration: " + track.getDuration() + "\nYear: " + track.getYear() + "\n\n");
        }
    }

    public void playOnly(int year){
        for(Track track: tracks){
            boolean result = track.getYear() == year;
            if(result){
                yearTracks.add(track);
            }
        }
        System.out.println("\n-------------\nSONGS FROM "+year+"\n-------------\n");
        for(Track track: yearTracks) {
            System.out.println( "Title: " + track.getTitle() + "\nArtist: " + track.getArtist() + "\nDuration: " + track.getDuration() + "\nYear: " + track.getYear() + "\n\n");
        }


    }
}




