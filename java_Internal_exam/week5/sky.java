import java.util.*;


abstract class Bird
{
    public abstract void fly();
    public abstract void makeSound();
}

class Eagle extends Bird
{
    public void fly()
    {
        System.out.println("Eagle");
    }
    public void makeSound()
    {
        System.out.println("Eagle sound");
    }
}
class Hawk extends Bird
{
    public void fly()
    {
        System.out.println("Hawk");
    }
    public void makeSound()
    {
        System.out.println("Hawk sound");
    }
}

class sky {
    public static void main(String[] args)
    {
     Eagle eg = new Eagle();
     eg.fly();
     eg.makeSound();
     Hawk hw=new Hawk();
     hw.fly();
     hw.makeSound();
  
    }
}
