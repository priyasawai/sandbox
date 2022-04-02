import java.util.ArrayList;
import java.util.Collection;
public class ArrList {
    public static void main(String args[])
    {
        ArrayList<Integer>l1=new ArrayList<Integer>();
        // add elements:
        l1.add(3);
        l1.add(4);
        l1.add(5);
       // System.out.println(l1);

      //  get elements:  
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }

        // add element between:
        l1.add(1,1);
        System.out.println(l1);
        // set
        l1.set(0,5);
        System.out.println(l1);
        // delete
        l1.remove(1);
        System.out.println(l1);
        // size
        int a=l1.size();
        System.out.println(a);
        // sorting
        Collection.sort(l1);
        

    }
}
