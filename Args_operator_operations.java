/*
  write a java program which accepts 2 integers and one arithmetic operator through arguments .Perform the operation as per given operator 
  Display the output on the screen 
*/


class Args_operator_operations
{
  public static void main(String  args[])
  { 
    
     int a= Integer.parseInt(args[0]);
     int b= Integer.parseInt(args[1]);
     String operator=args[2];
     
     switch(operator)
     {
       case "+":
         System.out.println(a+"+"+b+"="+(a+b));
         break;
         
       case "-":
         System.out.println(a+"-"+b+"="+(a-b));
         break;
        
       case "*":
         System.out.println(a+"*"+b+"="+(a*b));
         break;
       case "/":
         System.out.println(a+"/"+b+"="+(a/b));
         break;
         
       default:
        System.out.println("operation not available");
        break; 
        
         
     }
     
         

    
  }
  
}
