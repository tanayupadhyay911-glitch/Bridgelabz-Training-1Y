import java.util.Scanner;
class TotalPrice{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Amount");
	double up = sc.nextDouble();
	System.out.println("Enter Amount");
	double qua = sc.nextDouble();
	
	double amt = up*qua;
	System.out.println("The total purchase price is INR " +amt+ " if the quantity " +qua+ " and unit price is INR" +up);
	}
}	
	
	