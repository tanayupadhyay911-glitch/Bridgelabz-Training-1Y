import java.util.Scanner;
class BMICalculator{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your weight in Kg:");
	double weight= sc.nextDouble();
	System.out.print("Enter Your Height in meter: ");
	double height= sc.nextDouble();
	
	double bmi = (weight)/(height*height);
	
	if(bmi<=18.4){
	System.out.print("Underweight");
	}
	else if(bmi>=18.5 && 24.9>=bmi){
	System.out.print("Normal");
	}
	else if(bmi>=25 && 39.9>=bmi){
	System.out.print("Overweight");
	
	}
	else{
	System.out.print("Obese");
	}
	sc.close();
	
	}
}