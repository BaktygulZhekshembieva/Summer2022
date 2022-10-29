package practice_OOP.animals;

public class Animals {

    private String food;
    private String location;

    public String makeNoise(){
        return "Hourse spit";
    }

    public String eat(){
        return "Cat eat";
    }

    public String sleep(){
        return "Dog sleep";
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}