package oop.car;

import java.util.Scanner;

public class Car {

    public String marka;
    public String model;
    protected int year;
    public String color;
    public int num;

    private boolean isCrashed;

    public Car(String marka, String model, int year, String color, int num, boolean isCrashed) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.color = color;
        this.num = num;
        this.isCrashed = isCrashed;

    }

    public boolean isCrashed() {

        return isCrashed;
    }

    public void setCrashed(boolean crashed) {
        isCrashed = crashed;

    }



    public int driveMode(int num1,int num2) {
        if (num1 == 1 && num2 == 1) {
            return  num1 + num2;
        }else {
            return 0;
        }
    }


    public int driveMode(int num1,int num2,int num3, int num4) {
        if (num1 == 1 && num2 == 1 && num3 == 1 && num4 == 1) {
            return  num1 + num2 + num3 + num4;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", num=" + num +
                ", isCrashed=" + isCrashed +
                '}';

    }
}