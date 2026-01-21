import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of students (N)");
	Double shakes = sc.nextDouble();
	double ts=(shakes)*(shakes-1)*(0.5);
	System.out.print("HAndshakes = " +ts);

        

    sc.close();
    }
}

