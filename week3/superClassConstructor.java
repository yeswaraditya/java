class Parent {
    public Parent() {
        System.out.println("Parent constructor");
    }
}
class Child extends Parent {
    public Child() {
        super(); 
        System.out.println("Child constructor");
    }
}
public class superClassConstructor {
    public static void main(String[] args) {
        new Child();
    }
}
