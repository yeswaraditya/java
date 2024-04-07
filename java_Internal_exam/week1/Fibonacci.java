import java.util.Scanner;

class Fibonacci
{

    void print(int n)
    {
        int a=0;
        int b=1;

        while(n>1)
        {
            System.out.println(a+" ");
            System.out.println(b+" ");
            a=a+b;
            b=a+b;
            n=n-2;

        }
        if(n==1)
        {
            System.out.println(a+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the value of n");
        
        int n=input.nextInt();
        Fibonacci object=new Fibonacci();
        object.print(n);
        input.close();
        
    }
}

