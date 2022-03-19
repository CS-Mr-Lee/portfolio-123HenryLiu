/**
 * @author Henry Liu
 * Mar 7, 2022
 * 
 * A class for Spotify
 */
public class OldSpotify {

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

  /** the number of monthly listners the user has */
  private int monthlyListeners;

  /** whether a song is playing */
  private boolean songOn;

  /** whether a podcast is playing */
  private boolean podcastOn;

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
  * creating Spotify
  *
  * @param price, price of the subscription
  * @param bank, user's current bank account
  */
  public OldSpotify(double price, double bank) {
    this.price = price;
    this.bank = bank;
    this.taxAdded = false;
    this.subscribed = false;
    this.recommendations = "";
    this.monthlyListeners = 0;
    this.songOn = false;
    this.podcastOn = false;
    this.shuffle = false;
    this.repeat = false;
    this.playlists = "";
    this.followedProfiles = "";
  }

 /** 
  * creating Spotify
  *
  * @param price, price of the subscription
  * @param bank, user's current bank account
  * @param monthlyListeners, the number of monthly listeners the user has
  */
  public OldSpotify(double price, double bank, int monthlyListeners) {
    this.price = price;
    this.bank = bank;
    this.taxAdded = false;
    this.subscribed = false;
    this.recommendations = "";
    this.monthlyListeners = monthlyListeners;
    this.songOn = false;
    this.podcastOn = false;
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
  public int getMonthlyListeners() {return this.monthlyListeners;}
  public boolean getSongOn() {return this.songOn;}
  public boolean getPodcastOn() {return this.podcastOn;}
  public boolean getShuffle() {return this.shuffle;}
  public boolean getRepeat() {return this.repeat;}
  public String getPlaylists() {return this.playlists;}
  public String getFollowedProfiles() {return this.followedProfiles;}

  //mutator methods

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
  * the first time cost is 99 cents
  */
  public void subscribe() {
    if (bank < price) {
      subscribed = false;
    } else {
      subscribed = true;
      bank -= 0.99;
    }
  }

 /**
  * the user renews subscription
  * they can only renew if they have the money
  * this time they are charged money
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
  * Spotify recommendations are much better and more complicated
  * 
  * @param favs, a string that contains their favourite music genres
  */
  public void recommend(String favs) {
    if (favs.contains("pop")) {
      recommendations += "Katy Perry\n";
      recommendations += "Adele\n";
      recommendations += "The Weeknd\n";
    }

    if (favs.contains("rock")) {
      if (favs.contains("indie")) {
        recommendations += "Linkin Park\n";
        recommendations += "The Killers\n";
      } else if (favs.contains("hard")) {
        recommendations += "AC/DC\n";
        recommendations += "Guns N'Roses";
      } else if (favs.contains("soft")) {
        recommendations += "U2\n";
        recommendations += "The Police\n";
      } else if (favs.contains("progressive")) {
        recommendations += "Rush\n";
        recommendations += "Tool\n";
      } else {
        recommendations += "Led Zeppelin\n";
        recommendations += "Nirvana\n";
        recommendations += "Red Hot Chili Peppers\n";
      }
    } else {
      recommendations += "";
    } 

    if (favs.contains("rap") || favs.contains("hip hop")) {
      if (favs.contains("old school")) {
        recommendations += "Tupac\n";
        recommendations += "The Notorious B.I.G.\n";
      } else if (favs.contains("mumble")) {
        recommendations += "Cardi B\n";
        recommendations += "Lil Wayne\n";
      } else {
        recommendations += "Eminem\n";
        recommendations += "Snoop Dogg\n";
        recommendations += "50 Cent\n";
      }
    } else {
      recommendations += "";
    } 

    if (favs.contains("country")) {
      recommendations += "Carrie Underwood\n";
      recommendations += "Kenny Chesney\n";
      recommendations += "Dolly Parton\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("metal")) {
      if (favs.contains("progressive")) {
        recommendations += "Dream Theater\n";
        recommendations += "Symphony X\n";
      } else if (favs.contains("black")) {
        recommendations += "Mayhem\n";
        recommendations += "Immortal\n";
      } else if (favs.contains("death")) {
        recommendations += "Death\n";
        recommendations += "Cannibal Corpse\n";
      } else if (favs.contains("thrash")) {
        recommendations += "Slayer\n";
        recommendations += "Megadeth\n";
      } else if (favs.contains("doom")) {
        recommendations += "Candlemass\n";
        recommendations += "Sunn 0)))\n";
      } else if (favs.contains("power")) {
        recommendations += "Dragonforce\n";
        recommendations += "Helloween\n";
      } else {
        recommendations += "Iron Maiden\n";
        recommendations += "Metallica\n";
        recommendations += "Judas Priest\n";
      }
    } else {
      recommendations += "";
    } 
    
    if (favs.contains("punk")) {
      if (favs.contains("hardcore")) {
        recommendations += "Dead Kennedys\n";
        recommendations += "Black Flag\n";
      } else if (favs.contains("crust")) {
        recommendations += "Extreme Noise Terror\n";
        recommendations += "Amebix\n";
      } else if (favs.contains("proto")) {
        recommendations += "The Velvet Underground\n";
        recommendations += "The Stooges\n";
      } else {
        recommendations += "Bad Religion\n";
        recommendations += "Ramones\n";
        recommendations += "The Sex Pistols\n";
      }
    } else {
      recommendations += "";
    } 
    
    if (favs.contains("classical")) {
      if (favs.contains("baroque")) {
        recommendations += "Handel\n";
        recommendations += "Vivaldi\n";
      } else if (favs.contains("romantic")) {
        recommendations += "Chopin\n";
        recommendations += "Brahms\n";
      } else {
        recommendations += "Mozart\n";
        recommendations += "Beethoven\n";
        recommendations += "Bach\n";
      }
    } else {
      recommendations += "";
    } 

    if (favs.contains("jazz")) {
      recommendations += "Miles Davis\n";
      recommendations += "Louis Armstrong\n";
      recommendations += "Billie Holiday\n";
    } else {
      recommendations += "";
    } 

    if (favs.contains("electronic dance music") || favs.contains("EDM")) {
      recommendations += "Martin Garrix\n";
      recommendations += "David Guetta\n";
      recommendations += "The Chainsmokers\n";
    } else {
      recommendations += "";
    }
  }

 /**
  * adding a monthly listener
  * 
  * @param firstListen, if a listener has not listened in the last month, it adds to monthly listeners
  */
  public void newListen(boolean firstListen) {
    if (firstListen == true) {
      monthlyListeners += 1;
    } else {
      this.monthlyListeners = monthlyListeners;
    }
  }

 /**
  * toggling playSong
  * will play or pause the music
  */
  public void playSong() {
    songOn = !songOn;

    if (songOn == true) {
      podcastOn = false;
    }
  }

 /**
  * toggling playPodcast
  * will play or pause a podcast
  */
  public void playPodcast() {
    podcastOn = !podcastOn;

    if (podcastOn == true) {
      songOn = false;
    }
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
    profileDetails += "Your Spotify Profile information:\n\n";
    
    profileDetails += "Price: $" + this.price + "\n";

    if (this.taxAdded == true) {
      profileDetails += "HST is charged\n";
    } else {
      profileDetails += "HST is not charged\n";
    }

    if (this.subscribed == true) {
      profileDetails += "You are subscribed to Spotify Premium, enjoy music on the go!\n";
    } else {
      profileDetails += "You are using the free version of Spotify, upgrade today!\n";
    }

    if (this.recommendations.isEmpty() == true) {
      profileDetails += "No recommendations so far\n";
    } else {
      profileDetails += "Your recommendations:\n" + this.recommendations + "\n";
    }

    if (this.monthlyListeners == 1) {
      profileDetails += "You have only one monthly listener";
    } else {
      profileDetails += "You have " + this.monthlyListeners + " monthly listeners\n";
    }
    

    if (this.songOn == true) {
      profileDetails += "You are currently listening to music\n";
    } else if (this.podcastOn == true) {
      profileDetails += "You are currently listening to a podcast\n";
    } else {
      profileDetails += "You are not playing anything at the moment\n";
    }

    if (this.shuffle == true) {
      profileDetails += "Your queue is shuffled\n";
    } else {
      profileDetails += "Your queue is in order\n";
    }

    if (this.repeat == true) {
      profileDetails += "Your queue will loop when it is finished\n";
    } else {
      profileDetails += "Your music will stop when the queue is finished\n";
    }

    if (this.playlists.isEmpty() == true) {
      profileDetails += "You have no playlists\n";
    } else {
      profileDetails += "Your playlists:\n" + this.playlists + "\n";
    }

    if (this.followedProfiles.isEmpty() == true) {
      profileDetails += "You are not following anyone\n";
    } else {
      profileDetails += "Following:\n" + this.followedProfiles + "\n";
    }
    
    return profileDetails;
   }
}