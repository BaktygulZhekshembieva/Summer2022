package practice;

public class CodingBat {
    public static void main(String[] args) {

//        String str = "llojj";
//        int i = str.length();
//        String str1 = str.substring(i-2);
//        System.out.println(str1);

        System.out.println(a());



//        public String extraEnd (String str){
//            String newStr = str.length() > 2 ? str.substring(str.length() -2) : str;
//            return newStr.concat(newStr);
//
//
//            String newStr = str.length() > 2 ? str.substring(str.length() -2) : str;
//            return newStr.concat(newStr);

        }


        static String f (){
            String str = "llojj";
            String t = str.length() > 2 ? str.substring(str.length() - 2) : str;
            return t+t+t;
        }

        static String a(){
        String q = "00dddd";
        String d = q.length() < 2 ? q : q.substring(0,2);
        return d;
        }

    public String firstHalf(String str) {
    return  str.substring(0, str.length()/2);
    }

}
