import java.util.Scanner;
class Factorsfor{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int fact=0;	
		
		int n= sc.nextInt();
		
		for(int i =1;n>=i;i++){
			if(n%i==0){
				fact++;
				}
		
		
			else{
			fact=fact*1;
			}
		}
		System.out.print("Factors of the given number including '1' and number itself are " + fact);
		sc.close();
	}
}	