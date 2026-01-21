import java.util.Scanner;

class KMtoMILESint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();

        double mil = km / 1.609;

        System.out.println("The total miles is " + mil + " for the given km " + km);

        sc.close();
    }
}
