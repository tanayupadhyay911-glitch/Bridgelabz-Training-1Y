import java.util.Scanner;

class ArmstrongNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int original = n;   
        int arm = 0;

        while (n != 0) {
            int i = n % 10;
            arm = arm + (i * i * i);
            n = n / 10;
        }

        if (arm == original) {
            System.out.println("The Given Number Is Armstrong Number");
        } else {
            System.out.println("The Given Number Is Not An Armstrong Number");
        }

        sc.close();
    }
}
