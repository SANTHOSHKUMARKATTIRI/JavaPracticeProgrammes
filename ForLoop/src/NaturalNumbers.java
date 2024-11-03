import java.util.Scanner;
public class NaturalNumbers {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number");
        int numbers = n.nextInt();
        for(int a=1;a<=100;a++){
            System.out.println(a+"numbers");
        }

    }
}
