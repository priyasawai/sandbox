// print sum of first natural nos:
public class recursion3 {
    public static void printSun(int i,int n,int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSun(i+1, n, sum);
    }
    public static void main(String []args)
    {
       printSun(1, 5, 0);
    }

}
