import java.util.Scanner;
class SideofSquare{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Perimeter:");
	

	double per = sc.nextDouble();
	double side = per/4;
	System.out.println("The length of the side is" +side+ " whose perimeter is " +per);
	sc.close();}
}	