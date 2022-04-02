public class addoftwonosfunc {
    /*static void Addoftwono1(int a,int b)
    {
       int Sumoftwonos=a+b;
       System.out.println("Addition is:"+Sumoftwonos);
    }*/


    static int Addoftwono1(int a,int b)
    {
        int Sumoftwonos=a+b;
        return Sumoftwonos;
    }
     public static void main(String[] args) {
       int x=10,y=20;
       int Sum=Addoftwono1(x,y);
       System.out.println("addition is:"+Sum);
       Sum+=11;
       System.out.println("Adding 11 is:"+Sum);
       Sum++;
       System.out.println("Adding 1 is:"+Sum);
       Sum/=2;
       System.out.println("Divide by 2 is:" +Sum);
     } 
}

