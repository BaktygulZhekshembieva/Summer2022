package aggregasion;

public class AppMain {
    public static void main(String[] args) {

        Battery battery = new Battery(12);

        Phone phone1 = new Phone(111, "Nokia", "6300", 128);
        System.out.println(phone1);
        System.out.println(phone1.battery.charging());
        phone1.battery.timeForUsing = 18;
        System.out.println(phone1);

        Headphones headphones1 = new Headphones("right", "left");

        Phone phone2 = new Phone(222, "Motorola", "L7", 128, battery, headphones1);
        System.out.println(phone2);


        Phone phone3 = new Phone(333, "Sunsung", "KZoom", 156, battery);
        System.out.println(phone3);
    }
}
