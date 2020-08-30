
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared){
        //check possition of variables
        if(this == compared){
            return true;
        }
        //if object compared is not of type song - not equal
        if(!(compared instanceof Song)){
            return false;
        }
        
        //convert object into a Song type obj
        Song comparedSong = (Song) compared;
        
        //if the values are equal, objects are equal
        if(this.artist == comparedSong.artist && this.name == comparedSong.name && this.durationInSeconds == comparedSong.durationInSeconds){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
