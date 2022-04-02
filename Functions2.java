import java.util.Scanner;

public class Functions2 {
    public static int multiplyTwoNo(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
   public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int multiply=multiplyTwoNo(a,b);
      System.out.println(multiply);

    }
}
