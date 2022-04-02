// print the fibonacci sequence till nth term:
public class recursion5 {
    public static void printFibonacci(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFibonacci(b, c, n-1);  
    }
    
    public static void main(String []args)
    {
       int a=0,b=1,n=7;
       System.out.println(a);
       System.out.println(b);
       printFibonacci(a,b,n);
    }
    
}
