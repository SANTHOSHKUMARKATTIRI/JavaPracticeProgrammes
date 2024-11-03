package ConditionalStatements;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" what is your assessment status");
        String examStatus = scanner.nextLine();
        if(examStatus.equals("pass")){
            System.out.println("please wait the further round");
        }
        else if(examStatus.equals(" Fail")){
            System.out.println("you will go to home");
        }
    }

}
