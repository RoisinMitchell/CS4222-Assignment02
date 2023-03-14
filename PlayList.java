import java.util.*;
public class PlayList {

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

        String printTracks = "";
        for(Track track: tracks) {
            printTracks += "Title: " + track.getTitle() + "\nArtist: " + track.getArtist() + "\nDuration: "
                        + track.getDuration() + "\nYear: " + track.getYear() + "\n\n";
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
            result = track.getTitle().equalsIgnoreCase(title);
            if(result) {
                tracks.remove(track);
            }
        }
        return result;
    }

    public void showList(){
        if(tracks.isEmpty()){
            System.out.println("\n-------------\nTHE LIST IS EMPTY\n-------------\n");
        }else{
            System.out.println(tracks.toString());
        }
    }
    public void playAll(boolean random){
        if(!random){
            System.out.println("\n-------------\nPLAYING TRACKS IN ORDER\n-------------\n" + this.toString());
        }else {
            randomTracks.addAll(tracks);
            Collections.shuffle(randomTracks);

            System.out.println("\n-------------\nPLAYING RANDOM TRACKS\n-------------\n");
            printing(randomTracks);
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
        printing(artistTracks);
    }

    public void playOnly(int year){
        for(Track track: tracks){
            boolean result = track.getYear() == year;
            if(result){
                yearTracks.add(track);
            }
        }
        System.out.println("\n-------------\nSONGS FROM "+year+"\n-------------\n");
        printing(yearTracks);

    }

    //printing array list to screen
    private void printing(ArrayList<Track> playlist){
        for(Track track: playlist) {
            System.out.println( "Title: " + track.getTitle() + "\nArtist: " + track.getArtist() + "\nDuration: "
                    + track.getDuration() + "\nYear: " + track.getYear() + "\n\n");
        }
    }
}




