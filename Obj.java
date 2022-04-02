import java.util.Scanner;
package Obj;
public class Obj {
        Scanner sc=new Scanner(System.in);
        String name="  ";
        int marks=0;
        public void get_details()
        {
            System.out.println("Enter your name:");
            String name=sc.nextLine();
            System.out.println("Enter your marks:");
              int  marks=sc.nextInt();
        }
        public void show_details()
        {
            System.out.println("name is" +name);
            System.out.println("marks is" +marks);
        }
    } 

