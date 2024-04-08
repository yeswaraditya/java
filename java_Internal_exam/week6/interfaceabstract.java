import java.util.*;

interface A
{
    public void show();
}

abstract class B implements A
{
    public void show()
    {
        System.out.println("Inside B");
    }
}

public class interfaceabstract extends B {


    public static void main(String[] args)
    {  
      interfaceabstract ib=new interfaceabstract();
      ib.show();
 
    }
}
