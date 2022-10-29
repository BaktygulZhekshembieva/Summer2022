package prac_1;

public class Recrucion {
    public static void main(String[] args) {

        sayNi(5);
    }

    private static void sayNi(int a){
        System.out.println("Hi");
        if (a <= 1){
            return;
        }
        sayNi(a-1);
    }
}
