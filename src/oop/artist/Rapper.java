package oop.artist;

public class Rapper extends Artist{

    public Rapper(String genre) {
        super(genre);
    }

    @Override
    public String sing() {
        return super.genre + " rapping";
    }

    @Override
    public String toString() {
        return super.genre;
    }
}

