import java.util.Scanner;
public class MulOfThreeNo {
     private static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int firstName=sc.nextInt();
         int secondName=sc.nextInt();
         int ThirdName=sc.nextInt();
         int d=((firstName+secondName)-ThirdName);
         System.out.println(d);
     }
        
    
}


