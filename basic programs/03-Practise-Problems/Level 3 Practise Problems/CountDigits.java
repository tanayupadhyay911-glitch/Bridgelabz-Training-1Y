import java.util.Scanner;
class CountDigits{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Enter a number (Number>0);");
	
	int n = sc.nextInt();
	int i=1;
	int count=0;
	
	while(n!=0){
		n=n/10;
		count++;
		}
	System.out.println(count);	
	sc.close();	
	}
}	