import java.util.Scanner;

class Parent
{
    protected int num=10;
    protected void parentdisplay()
    {
        System.out.println("parent class");
    }
}
class child extends Parent
{
    public void childdisplay()
    {
        System.out.println("num from parent class is "+num);
    }

    public void display()
    {
        parentdisplay();
    }
}

public class proctectedaccessspecifier {
    public static void main(String[] args)
    {
       
        child obj=new child();
        obj.childdisplay();
        obj.display();
    }
}
