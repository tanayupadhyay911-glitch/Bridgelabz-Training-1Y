import java.util.S	canner;
class HeightConverter{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Height IN CM :");
	double hcm= sc.nextDouble();
	double hin =hcm/2.54;
	double hfot = hin/12;
	System.out.println("Your Height in cm is " +hcm+ " while in feet is" +hin+  " and inches is " +hfot );
	sc.close();}
}	
	