import java.util.Scanner;

public class Studentinfo {
    
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name:");
        String name=sc.next();
        System.out.println("enter your age:");
        int age=sc.nextInt();
        System.out.println("enter your roll no:");
        int Roll_no=sc.nextInt();
        System.out.println("name:"+name+  "\nage:"+age+  " \nroll_no:"+Roll_no);
    
     }
        
}
