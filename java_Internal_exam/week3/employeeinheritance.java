import java.util.*;

class person
{
    private String name;
    private int age;

    public person(String name_,int age_)
    {
        name=name_;
        age=age_;
    }

    public void display()
    {
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        
    }

}

class employee extends person
{
    private String employeeid;
    private int salary;
     public employee(String name,int age,String employeeid_,int salary_)
     {
        super(name,age);
        employeeid=employeeid_;
        salary=salary_;

     }

     public void display()
     {
        super.display();
        System.out.println("employeeid is "+employeeid);
        System.out.println("salary is "+salary);
        
     }

}




public class employeeinheritance {
    public  static void main (String[] args)
   { Scanner in=new Scanner(System.in);
    employee em=new employee("eswar",19,"123",5000);
    em.display();
   }

    
}
