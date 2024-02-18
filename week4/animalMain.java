class animal {
    public void makesound() {
        System.out.println("Animal sound");
    }
}
class bird extends animal {
    public void makesound() {
        System.out.println("Bird sound");
    }
}
class cat extends animal {
    public void makesound() {
        System.out.println("Cat sound");
    }
}
public class animalMain {
    public static void main(String[] args) {
        animal aobj = new animal();
        bird bobj = new bird();
        cat cobj = new cat();
        aobj.makesound();
        bobj.makesound();
        cobj.makesound();
    }
}
