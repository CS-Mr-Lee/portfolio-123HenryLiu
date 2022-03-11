/**
 * @author Henry Liu
 * Mar 9, 2022
 * 
 * The music subscription service class
 */
public class MusicService {
  
  //attributes

  /** the price of the subscription */
  private double price;

  /** the user's bank account */
  private double bank;

  /** whether tax is added */
  private boolean taxAdded;

  /** whether thye are subscribed or not */
  private boolean subscribed;

  /** a string containing recommendations for the user */
  private String recommendations;

  /** whether a song is playing */
  private boolean songOn;

  /** whether the music is shuffled */
  private boolean shuffle;

  /** whether the music will repeat */
  private boolean repeat;

  /** string containing playlist names */
  private String playlists;

  /** string containing all the profiles followed */
  private String followedProfiles;

  //constructors

 /** 
  * creating MusicService
  *
  * @param price, price of the subscription
  * @param bank, user's current bank account
  */
  public MusicService(double price, double bank) {
    this.price = price;
    this.bank = bank;
    this.taxAdded = false;
    this.subscribed = false;
    this.recommendations = "";
    this.songOn = false;
    this.shuffle = false;
    this.repeat = false;
    this.playlists = "";
    this.followedProfiles = "";
  }

  //return methods
  
  public double getPrice() {return this.price;}
  public double getBank() {return this.bank;}
  public boolean getTaxAdded() {return this.taxAdded;}
  public boolean getSubscribed () {return this.subscribed;}
  public String getRecommendations () {return this.recommendations;}
  public boolean getSongOn() {return this.songOn;}
  public boolean getShuffle() {return this.shuffle;}
  public boolean getRepeat() {return this.repeat;}
  public String getPlaylists() {return this.playlists;}
  public String getFollowedProfiles() {return this.followedProfiles;}

 /**
  * adding tax
  * if user is in Ontario, there is a 13 percent HST
  * since I do not know the tax in other areas the tax is voided 
  * 
  * @param province, the province of the user
  */
  public void tax(String province) {
    if (province.equals("Ontario")) {
      price = price * 1.13;
      taxAdded = true;
    } else {
      taxAdded = false;
    }
  }

 /**
  * the user subscribes
  * they can only subscribe if they have enough money
  * sadly there is no free trial
  */
  public void subscribe() {
    if (bank < price) {
      subscribed = false;
    } else {
      subscribed = true;
      bank -= price;
    }
  }

 /**
  * the user renews subscription
  * they can only renew if they have the money
  */
  public void renewSub() {
    if (bank < price) {
      subscribed = false;
    } else {
      subscribed = true;
      bank -= price;
    }
  }

 /**
  * recommendations
  * by default there are decent recommendations
  * 
  * @param favs, a string that contains their favourite music genres
  */
  public void recommend(String favs) {
    if (favs.contains("pop")) {
      recommendations += "Britney Spears\n";
      recommendations += "Taylor Swift\n";
      recommendations += "Beyoncé\n";
    }

    if (favs.contains("rock")) {
      recommendations += "Foo Fighters\n";
      recommendations += "Fleetwood Mac\n";
      recommendations += "Bon Jovi\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("rap") || favs.contains("hip hop")) {
      recommendations += "Kanye West\n";
      recommendations += "Jay-Z\n";
      recommendations += "Kendrick Lamar\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("country")) {
      recommendations += "Garth Brooks\n";
      recommendations += "Chris Stapleton\n";
      recommendations += "Shania Twain\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("metal")) {
      recommendations += "Black Sabbath\n";
      recommendations += "Gojira\n";
      recommendations += "Pantera\n";
    } else {
      recommendations += "";
    } 
    
    if (favs.contains("punk")) {
      recommendations += "Bad Brains\n";
      recommendations += "Discharge\n";
      recommendations += "Minor Threat\n";
    } else {
      recommendations += "";
    } 
    
    if (favs.contains("classical")) {
      recommendations += "Vivaldi\n";
      recommendations += "Debussy\n";
      recommendations += "Tchaikovsky\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("jazz")) {
      recommendations += "Ella Fitzgerald\n";
      recommendations += "Ray Charles\n";
      recommendations += "J. J. Johnson\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("electronic dance music") || favs.contains("EDM")) {
      recommendations += "Marshmello\n";
      recommendations += "Alan Walker\n";
      recommendations += "Deadmau5\n";
    } else {
      recommendations += "";
    }
  }

 /**
  * toggling playSong
  * will play or pause the music
  */
  public void playSong() {
    songOn = !songOn;
  }

 /**
  * toggling shuffe
  * will turn shuffle on or off
  */
 public void toggleShuffle() {
    shuffle = !shuffle;
  }

 /**
  * toggling repeat
  * will turn repeat on or off
  */
  public void toggleRepeat() {
    repeat = !repeat;
  }

 /**
  * the user creates a new playlist
  * adds the playlist name to the playlist name string
  *
  * @param playlistName, the name of the playlist
  */
  public void makePlaylist(String playlistName) {
    playlists += playlistName + "\n";
  }

 /**
  * the user follows a new profile
  * adds the followed user to the string that contains the following users
  */
  public void follow(String profileName) {
    followedProfiles += profileName + "\n";
  }

 /**
  * toString method
  * prints out the user's information
  * 
  * @return profileDetails, the user's profile information
  */
  public String toString() {
    String profileDetails = "";
    profileDetails += "Price: " + price + "\n";

    if (taxAdded == true) {
      profileDetails += "HST is charged\n";
    } else {
      profileDetails += "HST is not charged\n";
    }

    if (subscribed == true) {
      profileDetails += "You are subscribed to Spotify Premium, enjoy music on the go!\n";
    } else {
      profileDetails += "You are using the free version of Spotify, upgrade today!\n";
    }

    if (recommendations.isEmpty() == true) {
      profileDetails += "No recommendations so far\n";
    } else {
      profileDetails += "Your recommendations" + recommendations;
    }

    if (songOn == true) {
      profileDetails += "You are currently listening to music\n";
    } else {
      profileDetails += "You are not playing anything at the moment\n";
    }

    if (shuffle == true) {
      profileDetails += "Your queue is shuffled\n";
    } else {
      profileDetails += "Your queue is in order\n";
    }

    if (repeat == true) {
      profileDetails += "Your queue will loop when it is finished";
    } else {
      profileDetails += "Your music will stop when the queue is finished";
    }

    if (playlists.isEmpty() == true) {
      profileDetails += "You have no playlists";
    } else {
      profileDetails += "Your playlists:\n" + playlists;
    }

    if (followedProfiles.isEmpty() == true) {
      profileDetails += "You are not following anyone";
    } else {
      profileDetails += "Following:\n" + followedProfiles;
    }
    
    return profileDetails;
   }
}