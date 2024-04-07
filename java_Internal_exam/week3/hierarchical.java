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
class child2 extends Parent
{
    public void child2display()
    {
        System.out.println("child2 class");
    }
}

public class hierarchical {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        child1 obj1=new child1();
        child2 obj2=new child2();
        obj1.parentdisplay();
        obj1.child1display();
        obj2.parentdisplay();
        obj2.child2display();

        in.close();
    }
}
