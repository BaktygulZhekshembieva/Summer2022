package home_works_platform;

public class HW_40_Method {
    public static void main(String[] args) {

        areaPerimetersOfRectangle(5, 2);
        areaPerimetersOfRectangle(10,20);
        areaPerimetersOfRectangle(4,7);

    }

    static void areaPerimetersOfRectangle(double heiпth, double width){
        double area = heiпth * width;
        System.out.println("Area of a Rectangle " + area);
        double perimeter = (heiпth + width) * 2;
        System.out.println("Perimeters of a Rectangle " + perimeter);
    }
}
