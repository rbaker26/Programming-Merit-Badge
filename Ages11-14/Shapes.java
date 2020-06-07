import java.util.Scanner;       // Import the Input-Output Library
public class Shapes{

     public static void main(String []args){
        Scanner scanner = new Scanner( System.in );
        
         
        System.out.println("Area of a Rectangle:\n");
        System.out.print("Enter the width of the rectangle: ");
        double recWidth = scanner.nextDouble();
        
        System.out.print("Enter the height of the rectangle: ");
        double recHeight = scanner.nextDouble();
        
        double recArea = recWidth * recHeight;
        
        System.out.println("\nThe Area of the rectangle is: " + recArea);

        scanner.close();
     }
}