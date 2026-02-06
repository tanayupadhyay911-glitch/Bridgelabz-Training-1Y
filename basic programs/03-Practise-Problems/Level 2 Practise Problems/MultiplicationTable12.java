import java.util.Scanner;
class MultiplicationTable{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter number who's table you want to print :");
	
	int n = sc.nextInt();
	int i=1;
	int mu=i*n;
	
	for( i=1 ; 10>=i ;i++){
		System.out.println(n+ " x " +i+ " = " +i*n);
		}
	sc.close();
	}
}		