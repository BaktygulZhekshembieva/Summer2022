package switch1;

public class SwitchClass1 {
    public static void main(String[] args) {

//        switch (1){
//            case 1 :
//            case 2 :
//            case 3 :
//                System.out.println("One two tree");
//            break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Four, five, six");
//            break;
//            default:
//                System.out.println("Please enter 1, 2, 3");
//        }

        String season = "drugoe slovo";
        String winter = "WINTER";
        String spring = "SPRING";
        String summer = "SUMMER";
        String fall = "fall";


        //      fall
        switch ("summer"){
            case "winter":
                season = "WINTER";
                break;
            case "spring" :
                season = spring; // SPRING
                break;
            case "summer" :
                season = "SUMMER";
                break;
            case "fall" :
                season = "AUTUMN";
                break;
            default:
                System.out.println("We have only 4 season");
        }
        System.out.println(season);
    }
}
