package practice_OOP.phone;

abstract public class IOs implements Smartphone {


    @Override
   abstract public String smartPhone();

    @Override
    abstract public boolean faceID(Data data);

    @Override
    public boolean touchID(Data data) {
        return false;
    }
}