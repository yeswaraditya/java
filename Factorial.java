/*
  write a java program to find factorial of a number
  
*/

import java.util.Scanner;

class Factorial
{ 
   public static void main(String args[])
   {
     System.out.println("enter a number to find factorial");
     Factorial fac=new Factorial(System.in);
     int f=fac.nextInt();
     int result;
     
     for(int i=0;i<f;i++)
     { 
       result=result*i;
     }
     System.out.println("factorial of"+f+ "is"+result);
     

   }
}

