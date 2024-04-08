import java.util.Scanner;

import javax.swing.text.PlainDocument;

class Palindrome
{

    void checkpalindrome(int n)
    {
        int original=n;
        int reverse=0;

        while(n>0)
        {
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;

        }
        if (reverse==original)
        {
            System.out.println("given number is a plaindrome");

        }
        else
        {
            System.out.println("given number is not a palindrome");
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number to find palindrome or not");
        int n=in.nextInt();
        Palindrome p=new Palindrome();
        p.checkpalindrome(n);
        in.close();
        


    }
}