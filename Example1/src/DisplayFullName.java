import java.util.Scanner;
public class DisplayFullName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scanner.next();
        System.out.println("Enter your last name:");
        String lastName = scanner.next();
        String fullName = firstName+" " + lastName;
        System.out.println("Full Name:" + fullName);

    }
}
