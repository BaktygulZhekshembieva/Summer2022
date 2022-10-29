package oop.interface2;

public class Penguin extends Bird{
    
    public Penguin(String name, boolean isFly) {
        super(name, isFly);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                " isFly= " + getisFly() +'\'' +
                '}';
    }

    String swim(){
        return "Swim swim";
    }


}
