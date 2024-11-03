import java.util.Scanner;
public class DivisionNames {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the your Division Number");
        int D_Number = scanner.nextInt();
        if (D_Number==1){
            System.out.println("your division name is : East Division");
        } else if (D_Number==2) {
            System.out.println("your division name is : West Division");
        }else if (D_Number==3) {
            System.out.println("your division name is : North Division");
        } else if (D_Number==4) {
            System.out.println("your division name is : South Division");
        } else if (D_Number==5) {
            System.out.println("your division name is : North East Division");
        } else if (D_Number==6) {
            System.out.println("your division name is : South west Division");
        } else if (D_Number==7) {
            System.out.println("your division name is : south west Division");
        } else if (D_Number==8) {
            System.out.println("your division name is : North West Division");
        } else {
            System.out.println(" Invalid Output");
        }
    }
}
