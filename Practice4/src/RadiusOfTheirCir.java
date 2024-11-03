import java.util.Scanner;

public class RadiusOfTheirCir {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double a = scanner.nextDouble();
        double Area = (3.14*a*a);
        System.out.println("Area of Circle:" + Area);
    }
}
