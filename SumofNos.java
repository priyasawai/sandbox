public class SumofNos {
    public static int sumofnosIteration(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        //int a=sumofnosIteration(5);
        //System.out.println(a);
        System.out.println(sumofnosIteration(5));
    } 
}
