import java.util.Scanner;

class DiscountedPriceint{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
    System.out.print("Enter the fees:");
	double fee =sc.nextDouble() ;
	System.out.println("Enter the discount %");
		
	
	double discountPercent = sc.nextDouble();
	double discount = (fee/100)*discountPercent;
	double discountedpricec = fee - discount;
	System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR " +discountedpricec) ;
	
	sc.close();}
}	