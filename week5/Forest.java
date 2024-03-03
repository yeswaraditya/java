abstract class Animal{
    public abstract void sound();
}
class Lion extends Animal {
   public void sound(){
       System.out.println("Lion is roaring");
   }
}
class  Tiger extends Animal {
   public void sound(){
       System.out.println("Tiger is growling");
   }
}
class Forest{
   public static void main(String[] args) {
       Animal lion = new Lion();
       Animal tiger = new Tiger();
       lion.sound();
       tiger.sound();
   }
}
