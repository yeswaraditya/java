import java.util.*;

class Parent
{
    public void display()
    {
        System.out.println("Parent display method");
    }
}

class child extends Parent
{
    public void display()
    {
        super.display();
        System.out.println("child display method");
    }
}

public class methodcallwithsuper {
    public static void main(String[] args)
    {
       child obj= new child();
       obj.display();
    }
}
