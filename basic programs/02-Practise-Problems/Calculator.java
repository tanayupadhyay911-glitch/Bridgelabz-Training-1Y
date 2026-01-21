import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number 1: ");
	double num1= sc.nextDouble();
	System.out.println("Enter Number 2: ");
	double num2 = sc.nextDouble();
	double add = num1+num2;
	double dif = num1-num2;
	double mul = num1*num2;
	double div = num1/num2;
	sc.close();
	
	
	
	
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +num1+ "and" +num2+
	"is" +add+ "," +dif+ "," +mul+", and" +div	);}

	
}	