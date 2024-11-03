import java.util.Scanner;

public class userName2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the natural numbers");
        int n = scanner.nextInt();
        for(int a=1;a<=n;a++){
            System.out.println(a+"numbers");
        }

    }
}
