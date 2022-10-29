package oop.flowers;
public class Plant {

    public String name;
    private String color;

     public Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean blossom(){
        return false;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}