package oop.movie;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Actor {

    public String name;
    protected int age;
    private String filmography;
    public ArrayList<String> movieLists = new ArrayList<>();
    public Map<String, Integer> oscarFilms = new TreeMap<>();

    public Actor(String name, int age, ArrayList<String> movieLists) {
        this.name = name;
        this.age = age;
        this.movieLists = movieLists;
    }

    public Actor(String name, Map<String, Integer> oscarFilms) {
        this.name = name;
        this.oscarFilms = oscarFilms;
    }

    public String getFilmography() {
        return filmography;
    }

    public void setFilmography(String filmography) {
        this.filmography = filmography;
    }




    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", filmography='" + filmography + '\'' +
                '}';
    }
}
