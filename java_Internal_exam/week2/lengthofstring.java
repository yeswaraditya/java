import java.util.Scanner;


class lengthofstring {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        String str=in.nextLine();
        System.out.println(str.length());
        in.close();

    }
}
