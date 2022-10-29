package methods;

public class Lesson1 {
    public static void main(String[] args) {

        Lesson1 object = new Lesson1();
        object.secondMethod();

        String str = "Hello";
        str.toUpperCase();

        StringBuilder object1 = new StringBuilder("Monkey");
//        object1.append("Dance for me!");

        object.sumOfTwoNums(45,23);
        object.sumOfTwoNums(90,78);
        greeting("Clark");
        greeting("Kasiet");
        greeting(object1.toString());
        object.info("Adilet", 37, 'm');
        System.out.println(object.sumOfThreeNums(5,3,1));


    }
    // static method belongs to current class
    public static void firstMethod(){
        System.out.println("This is my first method!");
    }

    // non static method call with object of current class
    public void secondMethod(){
        System.out.println("This is my second method!");
    }

    // method with parameters
    public void sumOfTwoNums(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void greeting(String name){
        String result = "Hello " + name + "!";
        System.out.println(result);
    }

    public void info(String name, int age, char gender){
        System.out.println("Name: \t" + name + "\n" +
                "Age: \t" + age +  "\n" +
                "Gender: " + gender);
    }

    // return method
    public int sumOfThreeNums(int num1, int num2, int num3){
        System.out.println("Sum of three numbers:");
        return num1 + num2;
    }

    // java methods      user method
    // (libraries)       (We created)

    // static method                    non static method
    // calls by name of method          calls by object of current class

    // return method                    non return method
    // return data types                empty
}
