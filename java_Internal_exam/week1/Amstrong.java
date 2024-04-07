import java.util.Scanner;

class Amstrong
{

    void checkAmstrong(int n)
    {
       int original=n;
       int sum=0;
       int pow=n%10;

       while(n>0)
       {
          int rem=n%10;
          int num=1;
          for(int i=0;i<pow;i++)
          {
            num=num*rem;
          }
          sum+=num;
          n=n/10;
    }

    if(sum==org)
    {
        
    }

    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number to check it is amstrong or not");
        int n=in.nextInt();

    }
}