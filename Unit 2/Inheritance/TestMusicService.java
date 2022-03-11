/**
 * @author Henry Liu
 * Mar 9, 2022
 * 
 * The music subscription service class
 */
public class TestMusicService {
  public static void main(String[] args) {
    Spotify mySpotify = new Spotify(9.99, 100000, 1029400);
    AppleMusic myApple = new AppleMusic(10.99, 100000);

    //testing Spotify
    mySpotify.subscribe();
    mySpotify.playSong();
    mySpotify.playPodcast();
    mySpotify.recommend("mumble rap, hardcore punk, death metal");
    mySpotify.follow("Rihanna");
    System.out.println(mySpotify.toString());

    //testing Apple Music
    myApple.subscribe();
    myApple.renewSub();
    myApple.tax("Manitoba");
    myApple.renewSub();
    myApple.playMusicVideo();
    myApple.playRadio();
    myApple.recommend("pop, rock");
    myApple.toggleRepeat();
    myApple.makePlaylist("Larry's horrible playlist");
    System.out.print(myApple.toString());
  }
}