/**
 * @author Henry Liu
 * Mar 7, 2022
 * 
 * A class for AppleMusic
 * calls the superclass
 */
public class AppleMusic extends MusicService {
  
  //attributes

  /** the price of the subscription */
  //private double price;

  /** the user's bank account */
  //private double bank;

  /** whether tax is added */
  //private boolean taxAdded;

  /** whether thye are subscribed or not */
  //private boolean subscribed;

  /** a string containing recommendations for the user */
  //private String recommendations;

  /** whether a song is playing */
  //private boolean songOn;

  /** whether a music video is playing */
  private boolean musicVideoOn;

  /** whether the radio is playing*/
  private boolean radioOn;

  /** whether the music is shuffled */
  //private boolean shuffle;

  /** whether the music will repeat */
  //private boolean repeat;

  /** string containing playlist names */
  //private String playlists;

  /** string containing all the profiles followed */
  //private String followedProfiles;

  //constructors

 /** 
  * creating Apple Music
  *
  * @param price, price of the subscription
  * @param bank, user's current bank account
  */
  public AppleMusic(double price, double bank) {
    super(price, bank); //calls the superclass constructor
    //this.price = price;
    //this.bank = bank;
    //this.taxAdded = false;
    //this.subscribed = false;
    //this.recommendations = "";
    //this.songOn = false;
    this.musicVideoOn = false;
    this.radioOn = false;
    //this.shuffle = false;
    //this.repeat = false;
    //this.playlists = "";
    //this.followedProfiles = "";
  }

  //return methods
  
  //public double getPrice() {return this.price;}
  //public double getBank() {return this.bank;}
  //public boolean getTaxAdded() {return this.taxAdded;}
  //public boolean getSubscribed () {return this.subscribed;}
  //public String getRecommendations () {return this.recommendations;}
  //public boolean getSongOn() {return this.songOn;}
  public boolean getMusicVideoOn() {return this.musicVideoOn;}
  public boolean getradioOn() {return this.radioOn;}
  //public boolean getShuffle() {return this.shuffle;}
  //public boolean getRepeat() {return this.repeat;}
  //public String getPlaylists() {return this.playlists;}
  //public String getFollowedProfiles() {return this.followedProfiles;}

  //mutator methods

 /**
  * adding tax
  * if user is in Ontario, there is a 13 percent HST
  * since I do not know the tax in other areas the tax is voided 
  * 
  * @param province, the province of the user
  */
/*  public void tax(String province) {
    if (province.equals("Ontario")) {
      price = price * 1.13;
      taxAdded = true;
    } else {
      taxAdded = false;
    }
  }
*/

 /**
  * the user subscribes
  * they can only subscribe if they have enough money
  * the subscription is free the first time
  */
/*  public void subscribe() {
    if (bank < price) {
      subscribed = false;
    } else {
      subscribed = true;
    }
  } 
*/

 /**
  * the user renews subscription
  * they can only renew if they have the money
  * this time they are charged money
  */
/*  public void renewSub() {
    if (bank < price) {
      subscribed = false;
    } else {
      subscribed = true;
      bank -= price;
    }
  }
*/

 /**
  * recommendations
  * Apple Music recommendations are very basic and horrible
  * 
  * @param favs, a string that contains their favourite music genres
  */
/*  public void recommend(String favs) {
    if (favs.contains("pop")) {
      recommendations += "Justin Bieber\n";
    }

    if (favs.contains("rock")) {
      recommendations += "Nickelback\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("rap") || favs.contains("hip hop")) {
      recommendations += "Nicki Minaj\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("country")) {
      recommendations += "Billy Ray Cyrus\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("metal")) {
      recommendations += "Mötley Crüe\n";
    } else {
      recommendations += "";
    } 
    
    if (favs.contains("punk")) {
      recommendations += "Agnostic Front\n";
    } else {
      recommendations += "";
    } 
    
    if (favs.contains("classical")) {
      recommendations += "Stravinsky\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("jazz")) {
      recommendations += "Kenny G\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("electronic dance music") || favs.contains("EDM")) {
      recommendations += "Skrillex\n";
    } else {
      recommendations += "";
    }
  }
*/

 /**
  * toggling playSong
  * will play or pause the music
  */
  /*public void playSong() {
    songOn = !songOn;

    if (songOn == true) {
      musicVideoOn = false;
      radioOn = false;
    }
  }
  */

 /**
  * toggling playMusicVideo
  * will play or pause the the music video
  */
  public void playMusicVideo() {
    musicVideoOn = !musicVideoOn;

    if (musicVideoOn == true) {
      //songOn = false;
      radioOn = false;
    }
  }

 /**
  * toggling the radio
  * will play or pause the radio
  */
  public void playRadio() {
    radioOn = !radioOn;

      if (radioOn == true) {
      //songOn = false;
      musicVideoOn = false;
    } 
  }

 /**
  * toggling shuffe
  * will turn shuffle on or off
  */
/* public void toggleShuffle() {
    shuffle = !shuffle;
  }
*/

 /**
  * toggling repeat
  * will turn repeat on or off
  */
/*  public void toggleRepeat() {
    repeat = !repeat;
  }
*/

 /**
  * the user creates a new playlist
  * adds the playlist name to the playlist name string
  *
  * @param playlistName, the name of the playlist
  */
/*  public void makePlaylist(String playlistName) {
    playlists += playlistName + "\n";
  }
*/

 /**
  * the user follows a new profile
  * adds the followed user to the string that contains the following users
  */
/*  public void follow(String profileName) {
    followedProfiles += profileName + "\n";
  }
*/

 /**
  * toString method
  * prints out the user's information
  * 
  * @return extraInfo, adding on to the user's current information
  */
  public String toString() {
    String extraInfo = super.toString();
    if (this.musicVideoOn == true) {
      extraInfo += "You are currently watching a music video\n";
    } else if (this.radioOn == true) {
      extraInfo += "You are currently listening to the radio\n";
    } else {
      extraInfo += "You are currently not playing a music video or a radio station\n";
    }

    return extraInfo;
   }
}