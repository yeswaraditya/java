import java.util.Scanner;

class Parent
{
    public void parentdisplay()
    {
        System.out.println("parent class");
    }
}
class child1 extends Parent
{
    public void child1display()
    {
        System.out.println("child1 class");
    }
}
class child2 extends child1
{
    public void child2display()
    {
        System.out.println("child2 class");
    }
}

public class multilevelinheritance {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        child2 obj=new child2();
        obj.parentdisplay();
        obj.child1display();
        obj.child2display();

        in.close();
    }
}
