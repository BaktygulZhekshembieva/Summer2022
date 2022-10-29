package oop.artist;

public class Singer extends Artist {

    public Singer(String genre) {
        super(genre);
    }

    @Override
    public String sing() {
        return super.genre + " sings songs";
    }

    @Override
    public String toString() {
        return super.genre;
    }
}
