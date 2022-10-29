package oop.polymorfism;

public class Dog {

    public String name;
    protected int age;
    public String breed;

    // overloading
    public int sumOfNums(int num1, int num2){
        return num1 + num2;
    }

    public int sumOfNums(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
