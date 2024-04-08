import java.util.*;


abstract class Animal
{
    public abstract void sound();
}

class Lion extends Animal
{
    public void sound()
    {
        System.out.println("lion");
    }
}
class Tiger extends Animal
{
    public void sound()
    {
        System.out.println("tiger");
    }
}
public class forest {
    public static void main(String[] args)
    {
     Lion li= new Lion();
     li.sound();
     Tiger ti =new Tiger();
     ti.sound();
    }
}
