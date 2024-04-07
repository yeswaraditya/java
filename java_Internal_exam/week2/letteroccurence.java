import java.util.*;


class letteroccurence {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        String str=new String(in.nextLine());
        System.out.println(str.indexOf('o')+" ");
        System.out.println(str.lastIndexOf('o')+" ");
        System.out.println(str.indexOf(',')+" ");
        char ch=in.next().charAt(0);

        in.close();

    }
}
