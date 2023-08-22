package basics;

import java.util.Date;

public class Switchcase {

    public static void main(String[] args){
        String fruit = "Monday";
        switch (fruit){
            case "Monday":
                System.out.println("Have an Monday");
                break;
            case "Tuesday":
                System.out.println("Have an Tuesday");
                break;
            case "Wednesday":
                System.out.println("Have an Wednesday");
                break;
            case "Thursday":
                System.out.println("Have an Thursday");
                break;
            case "Friday":
                System.out.println("Have an Friday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Its weekend");
                break;
            default:
                System.out.println("OOpss, its not weekday or weekend");
        }
    }
}
