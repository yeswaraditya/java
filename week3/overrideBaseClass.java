class Parent {
    public void display() {
        System.out.println("Parent class");
    }
}
class Child extends Parent{
    public void display() {
        System.out.println("Child class");
    }
}
public class overrideBaseClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); 
    }
} 
