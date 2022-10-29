package oop.interface2;

public interface Fly {

    int COUNT = 3000;
//    boolean isFly;

    String fly();

    default String averageHigh(int meter){
        if (meter > COUNT){
            return "High flying";
        }else {
            return "Low flying";
        }
    }

    static String flyIn(){
        return "Fly in";
    }

//    private  String flyOut(){
//        return "";
//    }
}
