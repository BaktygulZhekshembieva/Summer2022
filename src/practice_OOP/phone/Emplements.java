package practice_OOP.phone;

public class Emplements {
    public static void main(String[] args) {

        Data passwordIphone = new Data("1234");
        Data data = new Data("777");

        Iphone iphone12Pro = new Iphone();
        iphone12Pro.setIphone(passwordIphone);
        System.out.println(iphone12Pro.faceID(passwordIphone) + " + " + iphone12Pro.faceID(data));

    }
}