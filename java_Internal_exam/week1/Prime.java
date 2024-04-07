import java.util.Scanner;
import java.lang.Math;

class Prime
{

    void checkprime(int n)
    {
        int temp=1;

        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n% i==0)
            {
                temp=0;
            }
        }

        if (temp==1)
        {
            System.out.println("given number is prime");

        }
       
        else
        {
            System.out.println("given number is not prime");
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number to find prime or not");
        int n=input.nextInt();
        Prime object=new Prime();
        object.checkprime(n);
        input.close();



    }
}