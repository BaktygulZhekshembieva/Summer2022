package codingBat;

public class Warmup1 {
    public static void main(String[] args) {
        Warmup1 warmup1 = new Warmup1();
//        System.out.println(warmup1.sleepIn(true,true));

        System.out.println(warmup1.notString("x"));
        System.out.println(warmup1.notString("x"));


    }


    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false)
            return false;
        else
            return true;
    }

    public String notString(String str) {
        if (str.startsWith("not"))
            return str;
        else
            return "not " + str;
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        // last + mid + first
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    public String front3(String str) {
        if (str.length() > 3) {
            String s = str.substring(0, 3);
            return s + s + s;
        } else {
            return str + str + str;
        }
    }

    public String backAround(String str) {
        String s1 = str.substring(str.length()-1);
        return s1 + str + s1;
    }

    public boolean or35(int n) {
        if(n % 3 == 0 || n % 5 ==0)
            return true;
        else
            return false;
    }

    public String front22(String str) {
        if(str.length() <= 2)
            return "ab" + str +"ab";
        else
            return str.substring(0,2) + str +  str.substring(0,2);
    }

    public String startOz(String str) {
        if (str.length() < 3) return str;
        if (str.startsWith("oz")) return "oz";
        if (str.substring(0,1).equals("o")) return "o";
        if (str.substring(1,2).equals("z")) return "z";
        return "";
    }
}
