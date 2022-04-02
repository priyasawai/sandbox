// Recursion means function calling itself:
import java.util.Scanner;
public class recursion {
    public static void main(String args[])
    {
        Solution s=new Solution(n);
        s.print();
        
    }
}
class Solution
{
    //int num=0;
    public void print()
    //{
      /* if(num>=10)
        {
            return;
        }
        System.out.println(num);
        num++;
         print(); //function calling */

    int sum(int n)
    {
       if(n==0)
       {
           return 0;
       }
       else
       return n+sum(n-1);
      }
 }

    public void solve()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //print();
        int a=sum(n);
        System.out.println(a);
    }
}