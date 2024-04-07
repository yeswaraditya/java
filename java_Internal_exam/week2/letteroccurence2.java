import java.util.*;


class letteroccurence2 {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        String str=new String(in.nextLine());
        int index=in.nextInt();
        System.out.println(str.charAt(index));

        

        in.close();

    }
}
