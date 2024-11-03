package ConditionalStatements;
import java.util.Scanner;
public class SatementsIfandElseIf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("which day you want ");
        String day = scanner.nextLine();
        if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("Thursday") || day.equals("Friday")){
            System.out.println("uff it's weekday");
        }
        else if  (day.equals("Saturday") || day.equals("sunday")){
            System.out.println("yeah it's weekend");
        }
        else{
            System.out.println("It's a invalid day");
        }

    }
}
