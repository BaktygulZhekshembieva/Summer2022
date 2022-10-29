package home_works_online;

public class HW5_LogicalOper {
    public static void main(String[] args) {
        String dog = "wildAnimal";
        String panda = "pet";
        String cat = "fluffy";
        String tiger = "strong";

        boolean wildAnimal = false;
        boolean pet = false;
        boolean fluffy = true;
        boolean strong = true;

        boolean bo = !(wildAnimal) && pet;
        System.out.println(bo);             //false
        boolean bo1 = !(pet && !(strong));
        System.out.println(bo1);            //true
        boolean bo2 = fluffy && strong;
        System.out.println(bo2);            //true

        boolean bo3 = !(wildAnimal || pet);
        System.out.println(bo3);            //true
        boolean bo4 = !(pet || strong);
        System.out.println(bo4);            //false
        boolean bo5 = fluffy || !(strong);
        System.out.println(bo5);            //true
    }
}
