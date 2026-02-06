import java.util.Scanner;
class FactorsWhile{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int fact=0;	
		
		int n= sc.nextInt();
		int i=n;
		
		while(i!=0){
			if(n%i==0){
				fact++;
				i--;
				}
		
		
			else{
			i--;
			}
		}
		System.out.print("Factors of the given number including '1' and number itself are " + fact);
		sc.close();
	}
}	