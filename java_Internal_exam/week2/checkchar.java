import java.util.Scanner;


class checkchar {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        String str=in.nextLine();
        System.out.println("enter a character to search");
        char ch=in.next().charAt(0);

        if (str.contains(String.valueOf(ch)))
        {
            System.out.println("char is present in string");
       
        }
        else
      