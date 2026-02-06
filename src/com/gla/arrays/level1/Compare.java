package com.gla.arrays.level1;
import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []num= new int [5];

        for(int i =0; 5>i;i++){
        num[i]= sc.nextInt();
        }

        for(int j=0;5>j;j++){
            if(num[j]>0){
                if(num[j]%2==0){
                    System.out.println( "The " + (j+1) + " Number is Positive and Even");
                }
                else{
                    System.out.println("The "+ (j+1) +" Number is Positive and Odd");
                }

            }
            else if (num[j]<0) {
                System.out.println("The "+ (j+1) +" Number is Negative");
            }

            else{
                System.out.println("The "+ (j+1) +" Number is Zero");

            }
        }

    }
}


