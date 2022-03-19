/**
 * @author Henry Liu
 * Mar 9, 2022
 * 
 * A main class that tests Spotify and Apple Music with and without superclass
 */
public class MusicServiceTester {
  public static void main(String[] args) {
    
    //creating classes
    OldSpotify mySpotify = new OldSpotify(9.99, 100000, 1029400);
    OldAppleMusic myApple = new OldAppleMusic(10.99, 11);
    Spotify myNewSpotify = new Spotify(8.99, 8.88);
    AppleMusic myNewApple = new AppleMusic(13.99, 100);

    //testing old classes
    
    //testing Spotify
    mySpotify.subscribe();
    mySpotify.playSong();
    mySpotify.recommend("mumble rap, hardcore punk, death metal");
    mySpotify.follow("Rihanna");
    System.out.println("\n\n" + mySpotify.toString());

    //testing Apple Music
    myApple.subscribe();
    myApple.renewSub();
    myApple.tax("Manitoba");
    myApple.renewSub();
    myApple.playSong();
    myApple.recommend("pop, rock");
    myApple.makePlaylist("Larry's horrible playlist");
    System.out.print("\n\n" + myApple.toString());

    //testing new classes from the MusicService superclass
    //using methods from both the child and parent class
    //using instanceof to prove that it extends to the parent class
    
    //testing new Spotify
    if (myNewSpotify instanceof MusicService) {
      myNewSpotify.subscribe();
      myNewSpotify.playPodcast();
      myNewSpotify.newListen(true);
      myNewSpotify.recommend("baroque-era classical music");
      System.out.print("\n\n" + myNewSpotify.toString());
    } else {
      System.out.println("Not inherited from a parent class");
    }

    //testing new Apple Music
    if (myNewApple instanceof MusicService) {
      myNewApple.subscribe();
      myNewApple.tax("Ontario");
      myNewApple.renewSub();
      myNewApple.playMusicVideo();
      myNewApple.playRadio();
      System.out.print("\n\n" + myNewApple.toString());
    } else {
      System.out.println("Not inherited from a parent class") ;
    }
  }
}