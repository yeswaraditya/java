import java.util.Scanner;

class Parent
{
    public void display()
    {
        System.out.println("parent class");
    }
}
class child extends Parent
{
    public void display()
    {
        System.out.println("child class");
    }
}

public class overidebaseclass {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        child obj=new child();
        obj.display();
    }
}
