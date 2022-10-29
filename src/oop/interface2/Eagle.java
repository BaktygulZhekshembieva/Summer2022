package oop.interface2;

public class Eagle extends Bird implements Fly{

    public Eagle(String name, boolean isFly) {
        super(name, isFly);
    }


    @Override
    public String fly() {
        return "Fast fly";
    }
}
