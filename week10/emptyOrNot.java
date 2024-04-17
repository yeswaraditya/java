import java.util.HashSet;
public class emptyOrNot {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors.isEmpty());
        colors.clear();
        System.out.println(colors.isEmpty());
    } 
    
}
