package home_works_platform;

public class HW_49 {
    public static void main(String[] args) {

        System.out.println(str("I"));
        System.out.println(str("Hi"));
        System.out.println(str("Bye"));
        System.out.println(str("Hello"));
    }

    static String str(String s){

        if (s.length() <= 2){
            return s;
        }else{
            return s.substring(0,2);
        }
    }
}
