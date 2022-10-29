package oop.artist;

public class Artist {

    public String genre;

    public Artist(){

    }

    public Artist(String genre) {
        this.genre = genre;
    }

    public String sing(){
        return this.genre + " sings";
    }

    @Override
    public String toString() {
        return "Artist{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
