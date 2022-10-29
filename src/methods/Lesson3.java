package methods;

public class Lesson3 {
    public static void main(String[] args) {

//        int maxNum = Math.max(7,9);
//        System.out.println(maxNum);
//
//        int minNum = Math.min(7,9);
//        System.out.println(minNum);

        Lesson3 obj = new Lesson3();
        System.out.println(obj.findMaxNum(47,20));

        System.out.println(fidnMin(45,66));

        int age = fidnMin(34,67);
        if (age <= 18){
            System.out.println("teenager");
        }else {
            System.out.println("adult");
        }

        String userAnswer = "YES";
        String yes = "Yes";
        String no = "No";
        boolean answer = (userAnswer.equalsIgnoreCase(yes)) ? true : false;
        System.out.println(answer);

        String word = "She";
        String str = (word.length() < 3) ? "article" : "word";
        System.out.println(str);
    }
    public double findMaxNum(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }

    //ternary operators
    public static int fidnMin(int num1, int num2){
        int result = (num1 <= num2) ? num1 : num2;
        return result;
    }
}
