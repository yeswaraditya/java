package exercises.java;


public class exercise3p {
    
    public void addarr(int a[],int n)
    {
        
        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of array elements is: "+sum);
    }
}
