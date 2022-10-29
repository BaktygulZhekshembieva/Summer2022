package practice_OOP.phone;

public class Samsung extends Android{
    @Override
    public String smartPhone() {
        return "Samsung";
    }

    @Override
    public boolean touchID(Data data) {
        return data.chekData(data.getData());
    }

}