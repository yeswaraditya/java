abstract class Person{
    public abstract void eat();
    public abstract void exercise();
}
class Athlete extends Person {
    public void eat(){
        System.out.println("Athlete eats healthily");
    }
    public void exercise(){
        System.out.println("Athlete exercises regularly");
    }
}
class LazyPerson extends Person {
    public void eat(){
        System.out.println("Lazy Person just waits for food to appear");
    }
    public void exercise(){
        System.out.println("Lazy Person does minimal effort in gym");
    }
}
class Human{
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();
        athlete.eat();
        athlete.exercise();
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
