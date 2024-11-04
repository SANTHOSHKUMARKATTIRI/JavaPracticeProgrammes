package Week2Practice;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Given Number");
        int num = sc.nextInt();
        for(int a=1;a<=10;a++){
            System.out.println(a*num);
            System.out.println(num+"*"+a+"="+a*num);
        }
    }

}
