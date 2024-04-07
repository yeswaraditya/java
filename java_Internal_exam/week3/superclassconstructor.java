import java.util.*;

class Parent
{
    public Parent()
    {
        System.out.println("Parent constructor");
    }
}

class child extends Parent
{
    public child()
    {
        super();
        System.out.println("child constructor");
    }
}

public class superclassconstructor {
    public static void main(String[] args)
    {
        new child();
    }
}
