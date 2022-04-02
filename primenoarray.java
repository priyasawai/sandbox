import java.util.Scanner;

public class primenoarray {
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter 5 elements:");
    for(int i=0;i<5;i++)
    arr[i]=sc.nextInt();
      System.out.println("prime no is:");
      for( int i=0;i<5;i++)
      {
          int count=0;
          for(int j=1;j<=arr[i] ;j++)
          {
          if(arr[i]%j==0)
          {
           count++;
          }
        }
      if(count==2)
      {
          System.out.println(arr[i]);
          //count=0;
      }
    }
  }
}