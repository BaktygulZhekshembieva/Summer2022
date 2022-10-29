package oop.interface2;

public interface MouthCargo extends Fly, CareSmth{

    default String averageHigh(int meter){
        if (meter > COUNT){
            return "High flying";
        }else {
            return "Low flying";
        }
    }
}
