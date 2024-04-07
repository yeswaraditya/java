import java.util.Scanner;


class evenodd {


    void checkevenorodd(int n)
    {
        if (n%2==0)
        {
            System.out.println("given number is even");
        }
        else
        {
            System.out.println("given number is odd");
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number to check even or odd");
        int n=in.nextInt();
        evenodd obj=new evenodd();
        obj.checkevenorodd(n);
        in.close();
    }
    
}
