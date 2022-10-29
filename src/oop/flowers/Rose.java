package oop.flowers;

public class Rose extends Plant{

    public Rose(String name, String color) {
        super(name, color);
    }

    public boolean blossom(){
        return true;
    }

    public String oneButon(){
        return "S odnoi vetki odin buton";
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                "color='" + getColor() + '\'' +
                '}';
    }
}