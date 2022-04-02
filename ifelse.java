import java .util.*;
public class ifelse {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((a<=10 && b>=10)? true:false);
        System.out.println((a%2==0 || b%2==0) ? true: false);
        System.out.println((a!=b)? true:false);
    }
}
