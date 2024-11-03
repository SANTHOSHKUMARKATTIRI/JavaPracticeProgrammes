import java.util.Scanner;

public class Bill {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bill");
        double bill = scanner.nextDouble();
        if (bill>=5000){
            System.out.println("Final payable bill is" +bill*0.75);
        } else{
            System.out.println("Final payable bill is"+ bill*0.90);
        }

    }
}
