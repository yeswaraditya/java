import java.util.Scanner;

class Parent
{
    public void parentdisplay()
    {
        System.out.println("parent class");
    }
}
class child extends Parent
{
    public void childdisplay()
    {
        System.out.println("child class");
    }
}

public class singleinheritence {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        child obj=new child();
        obj.parentdisplay();
        obj.childdisplay();
        in.close();
    }
}
