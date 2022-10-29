package practice_OOP.phone;

public class Iphone extends IOs{

     private Data iphone = new Data();

    @Override
    public String smartPhone() {
        return "Iphone";
    }

    @Override
    public boolean faceID(Data data) {
        return data.chekData(iphone.getData());
    }

    public void setIphone(Data iphone) {
        this.iphone = iphone;
    }
}