public class PlayListDriver {
    public static void main(String[] args){
        Track song1 = new Track("Freaky", "Joe", 1991, 150);
        Track song2 = new Track("Pop", "Mc", 1995, 150);
        Track song3 = new Track("This is IT!", "joe", 1990, 150);
        Track song4 = new Track("Help", "songs", 1995, 20);
        Track song5 = new Track("Cat", "joe", 1997, 440);

        PlayList myPlaylist = new PlayList();
        String name = "";
        myPlaylist.setName("new songs");
        name = myPlaylist.getName();


        //adding to playlist
        myPlaylist.add(song1);
        myPlaylist.add(song2);
        myPlaylist.add(song3);
        myPlaylist.add(song4);
        myPlaylist.add(song5);


        String print = myPlaylist.toString();
        System.out.println("\n-------------\nPLAYLIST CONTENT\n-------------\n"+ print);

       myPlaylist.playAll(true);
       myPlaylist.playOnly(1995);
       myPlaylist.playOnly("joe");





    }
}
