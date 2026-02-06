import java.util.Scanner;


public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int sal = sc.nextInt();
		int exp = sc.nextInt();
		int bonus=(sal*5)/(100);
		
			
		if(exp>5){
			System.out.println("Here is the salary after bonus" + bonus + "enjoy :)");
		}
		else{
			System.out.println("I am very sorry to say you are little 'inexperince' for bonus.");
		    System.out.println("Work Harder Dont Worry Next time your bonus will be added ");
			}
		
		
		
		sc.close();
	    }
}