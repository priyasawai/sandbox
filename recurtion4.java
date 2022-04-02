// print factorial of a no n:
public class recurtion4 {
    public static int printFactorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
      int fmin=printFactorial(n-1);
      int fact=n*fmin;
       return fact;      
    }
   public static void main(String []args) 
   {
     int n=5;
     int f= printFactorial(n);
     System.out.println(f);
   }
}
