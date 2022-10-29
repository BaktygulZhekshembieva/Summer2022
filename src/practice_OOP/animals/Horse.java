package practice_OOP.animals;

public class Horse extends Animals{

    private String food = "dress";
    private String location = "padd";



    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}