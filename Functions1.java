import java.util.Scanner;

public class Functions1 {
    public static int addTwoNo(int a,int b)
    {
      int sum=a+b;
      return sum;
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int add=addTwoNo(a, b);
      System.out.println(add);
    }
}
