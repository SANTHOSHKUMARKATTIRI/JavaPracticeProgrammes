
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        float length = scanner.nextFloat();
        System.out.print("Enter the width of the rectangle:");
        float width = scanner.nextFloat();
        float area = length*width;
        System.out.println("The area of the rectangle:" +area);


    }
}
