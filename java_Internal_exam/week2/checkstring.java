import java.util.Scanner;


class checkstring {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        String str=in.nextLine();
        System.out.println("enter a string to search");
        String str1=in.next();

        if (str.contains(str1))
        {
            System.out.println("string is present in string");
       
        }
        else
        {
            System.out.println("string is not present in string");

        }



        in.close();

    }
}
