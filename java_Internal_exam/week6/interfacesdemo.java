import java.util.*;

interface A
{
    public void display();
}
class B implements A
{
    public void display()
    {
        System.out.println("Inside B");
    }
}
class C implements A
{
    public void display()
    {
        System.out.println("Inside C");
    }
}

public class interfacesdemo {
    public  static void main(String[] args) 
    {
        B b=new B();
        C c=new C();
        b.display();
        c.display();
    }
    
}
