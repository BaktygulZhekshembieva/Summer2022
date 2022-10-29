package practice_OOP.phone;

abstract public class Android implements Smartphone{

    @Override
    public String smartPhone() {
        return null;
    }

    @Override
    public boolean touchID(Data data) {
        return false;
    }

    @Override
    public boolean faceID(Data data) {
        return false;
    }
}