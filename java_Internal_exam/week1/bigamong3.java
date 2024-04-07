import java.util.Scanner;

class bigamong3
{

    void checkbig(int a, int b,int c)
    {
        if (a>b && a>c )
        {
            System.out.println(a+" is big");
        }
        else if (b>c)
        {
            System.out.println(b+" is big");
        }
        else
        {
            System.out.println(c+" is big");
        }
    }  
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first number");
        int a = in.nextInt();
        System.out.print("Enter second number");
        int b = in.nextInt();
        System.out.print("Enter third  number");
        int c = in.nextInt();

        bigamong3 obj=new bigamong3();
        obj.checkbig(a,b,c);
        in.close();
    }
}