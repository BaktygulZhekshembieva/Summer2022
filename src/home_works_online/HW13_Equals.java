package home_works_online;

public class HW13_Equals {
    public static void main(String[] args) {

        String str1 = "Well";
        String str2 = new String("Well");
        StringBuilder sb1 = new StringBuilder("Well");
        StringBuilder sb2 = new StringBuilder("Well");

        System.out.println(str1.equals(str2)); //true -- значение одинаковые
        System.out.println(str1 == str2);      //false -- ссылки разные

        System.out.println(str1.equals(sb1));            /* false -- .equals метод Stringа.
                                                                     .equals в StringBuilder работает как == */
        System.out.println(str1.equals(sb1.toString())); //true -- StringBuilder перевели в String, значение одинаковые

        System.out.println(sb1 == sb2);                  //false -- ссылки разные
        System.out.println(sb1.equals(sb2));             //false -- .equals в StringBuilder работает как ==

        sb1.toString(); //все методы Stringа в StringBuilderе игнорируется, если их не сохранять
        sb2.toString();
        System.out.println(sb1.equals(sb2));                      //false -- т.к StringBuilder неприводился в String
        System.out.println(sb1.toString().equals(sb2.toString())); /* true -- т.к метод Stringа сохранен,
                                                                     и StringBuilder перевелся в String */

        StringBuilder sb3 = sb1;

        System.out.println(sb3 == sb1);      //true -- sb3 = sb1 ссылка один и тот же
        System.out.println(sb3.equals(sb1)); //true -- sb3 = sb1 ссылка один и тот же


        System.out.println("Hashcode of sb1: " + sb1.hashCode()); // 460141958
        System.out.println("Hashcode of sb2: " + sb2.hashCode()); // 1163157884
        boolean result1 = sb1.equals(sb2);
        System.out.println("Is sb1 equals to sb2? " + result1); //false
    }
}
