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

    