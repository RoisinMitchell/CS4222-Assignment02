public class PlayListDriver {
    public static void main(String[] args){
        Track song1 = new Track("song", "Joe");
        Track song2 = new Track("Pop", "Mc");
        Track song3 = new Track("This!", "artist", 1990, 150);
        Track song4 = new Track("happy", "songs", 1995, 20);
        Track song5 = new Track("popular", "singer", 1997, 440);

        
        //Creating first platylist for testing
        PlayList myPlaylist = new PlayList();
        myPlaylist.setName("new songs");
        String name = myPlaylist.getName();
        System.out.println(name);

        //Creating second playlist for testing
        //Keeping the default name for playist
        PlayList myPlaylist2 = new PlayList();
        String name2 = myPlaylist2.getName();
        System.out.println(name2);

        //Testing add method on playList1
        myPlaylist.add(song1);
        myPlaylist.add(song2);
        myPlaylist.add(song3);
        myPlaylist.add(song4);
        myPlaylist.add(song5);
        myPlaylist.add("a song", "the artist");
        myPlaylist.add("a", "the");
        myPlaylist.add("music", "ist");
        myPlaylist.add("another song", "another artist", 1, 2);
        myPlaylist.add("another song", "another artist", 100, 255);

        //Testing add method on playlist2
        myPlaylist2.add(song3);
        myPlaylist2.add(song4);
        myPlaylist2.add(song5);
        myPlaylist2.add("a song", "the artist");
        myPlaylist2.add("a", "the");
        myPlaylist2.add("music", "ist");


        //Testing playAll and playONly methods
       myPlaylist.playAll(true);
       myPlaylist.playOnly(1995);
       myPlaylist.playOnly("joe");

        //Testing show list
       myPlaylist.showList();

       //Removing from list
       boolean boolResult = myPlaylist.remove("popular");
       System.out.println("Song has been removed: " + boolResult);
       myPlaylist.remove("popular");
       boolean boolResult2 = myPlaylist.remove("xxxx");
       System.out.println("Song has been removed: " + boolResult2);
       myPlaylist.remove("song");

        //Testing show list again after above changes
        myPlaylist.showList();


        //Testing playAll and playONly methods on myPlaylist2
        myPlaylist2.playAll(true);
        myPlaylist2.playOnly(1995);
        myPlaylist2.playOnly("joe");

        //Testing show list on myPlaylist2
        myPlaylist2.showList();

        //Removing from list on myPlaylist2
        boolean boolResult3 = myPlaylist.remove("a");
        System.out.println("Song has been removed: " + boolResult3);
        myPlaylist2.remove("popular");
        myPlaylist2.remove("song");

        //Testing show list again after above changes
        myPlaylist2.showList();
    }
}
