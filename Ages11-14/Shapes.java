import java.util.Scanner;       // Import the Input-Output Library
public class Shapes{

     public static void main(String []args){

        // Start the input scanner
        Scanner scanner = new Scanner( System.in );
        
        System.out.println("Area of a Rectangle:\n");

        // Get the dimensions of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double recWidth = scanner.nextDouble();
        
        System.out.print("Enter the height of the rectangle: ");
        double recHeight = scanner.nextDouble();
        
        // Calculate the Area (A=W*H)
        double recArea = recWidth * recHeight;
        
        // Ouput the Area
        System.out.println("\nThe Area of the rectangle is: " + recArea);

        
        // Close in input scanner
        scanner.close();
     }
}