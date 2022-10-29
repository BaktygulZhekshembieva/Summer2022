package practice_OOP.animals;

public class Cat extends Animals{

    private String food = "milk ";
    private String location = "home";
    public String cat(){
      return " Cat " + getFood() +  getLocation();
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}