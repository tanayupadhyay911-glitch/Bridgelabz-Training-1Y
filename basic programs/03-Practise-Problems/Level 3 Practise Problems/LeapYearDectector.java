import java.util.Scanner;
class LeapYearDectectorI{
	public static void main(String ars []){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The year [Year Must Be>=1582] :");
		int yr= sc.nextInt();
		
		if(yr%4==0 && yr%400==0 && yr%100!=0 && yr>=1582){
			System.out.print("Leap Year :) ");
			}
			
			
		else{
		System.out.print("Not A Leap Year :( ");
		}
        sc.close();
	}
}	