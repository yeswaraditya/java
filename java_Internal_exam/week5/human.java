import java.util.*;


abstract class Person
{
    public abstract void eat();
    public abstract void exercise();
}

class Athlete extends Person
{
    public void eat()
    {
        System.out.println("Athlete eats");
    }
    public void exercise()
    {
        System.out.println("Athlete exercise");
    }
}
class LazyPerson extends Person
{
    public void eat()
    {
        System.out.println("LazyPerson eats");
    }
    public void exercise()
    {
        System.out.println("LazyPerson exercise");
    }
}

class human {
    public static void main(String[] args)
    {
     Athlete al= new Athlete();
     al.eat();
     al.exercise();
     LazyPerson lp=new LazyPerson();
     lp.eat();
     lp.exercise();
     
  
    }
}
