import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter distance in feet: ");

        
        double feet = scanner.nextDouble();

        
        scanner.close();

        
        double yards = feet / 3.0;

        
        double miles = feet / 5280.0;


    System.out.printf("Distance in yards: %.2f yards\n", yards);
    System.out.printf("Distance in miles: %.4f miles\n", miles)  ; 
        
    }
}
