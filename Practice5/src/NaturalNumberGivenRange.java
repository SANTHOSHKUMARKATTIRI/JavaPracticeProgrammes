import java.util.Scanner;

public class NaturalNumberGivenRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the min range");
        int min = sc.nextInt();
        System.out.println("Enter the max range");
        int max = sc.nextInt();
        for (int a=min; a<max;a++){
            System.out.println(a);
        }
    }
}
