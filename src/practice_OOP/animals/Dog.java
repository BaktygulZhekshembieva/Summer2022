package practice_OOP.animals;

public class Dog extends Animals{

    private String food = "bone ";
    private String location = "street";

    public void dog(){
//       return  "Dog " + getFood() + getLocation() ;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}