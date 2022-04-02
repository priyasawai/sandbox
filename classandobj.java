import java.util.Scanner;
class Bicycle
{
    int gear=2;
    String name="priya";
   public void dobreak()
    {
     System.out.println("how are you");
    }
}

/*class Solution{
     public int sumofTwoNos(int a,int b)
     {
         /*int a=10;
         int b=20;
         int c=a+b;
       System.out.println(c);*/
       // int c=a+b;
        //return c;
    // }

   /* public void solve()
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum= sumofTwoNos(a,b);
        System.out.println(sum);
      //  System.out.println("hello world");
    }   
}*/
public class classandobj {
    public static void main(String arg[])
    {
        //Scanner sc=new Scanner(System.in);
        Bicycle b=new Bicycle();
        System.out.println(b.gear);
        System.out.println(b.name);
        Bicycle c=new Bicycle();
        c.dobreak();
       // Solution s=new Solution();
        //s.solve();
    }
    
}
