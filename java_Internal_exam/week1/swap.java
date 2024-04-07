import java.util.Scanner;

class swap
{

    void swapnum(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println(" after swap a="+a+"b="+b);

    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter first number");
        int a=in.nextInt();
        System.out.println("Enter second number");
        int b=in.nextInt();

        swap obj= new swap();
        obj.swapnum(a,b);
        in.close();

    }
}