abstract class Bird{
    public abstract void fly();
    public abstract void makeSound();
}
class Eagle extends Bird {
    public void fly(){
        System.out.println("Eagle fly High in the fly");
    }
    public void makeSound(){
        System.out.println("Eagle makes a loud crowing Sound");
    }
}
class Hawk extends Bird {
    public void fly(){
        System.out.println("Hawk  fly slowly on the ground");
    }
    public void makeSound(){
        System.out.println("Hawk makes a sharp screech Sound");
    }
}
class Sky{
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird hawk = new Hawk();
        eagle.fly();
        eagle.makeSound();
        hawk.fly();
        hawk.makeSound();
    }
}
