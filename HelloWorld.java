import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class HelloWorld
{
    public static void main(String[] args) {
        
       // a=10;
      // float c=3.5f;
      // double d=2.4;
      //char c='a';
      //String b="priya sawai";
      //System.out.println(b);
      //System.out.println(c);
       // System.out.println(d);
       // System.out.println(" priya sawai");
     // int d= increment(10);
      //System.out.println(d);
      //float s=10.0f/3;
      //int z=5%2;
    //  System.out.println(z);
      //String a=" hiii there !";
     // String b=" my name is";
     // String c= "priya sawai";
      //int d=10;
     // int g=30;
      //System.out.println(a+" "+b+" "+c+" "+d+" "+g);// cancatenation
     // System.out.println(d+g+c);
        
      //System.out.println("Enter no:");
     // Scanner sc=new Scanner(System.in);
    //int num=sc.nextInt();
     // System.out.println("The no is :"  +num);
     // System.out.println("Enter name:");
      //String name=sc.nextLine();
      //System.out.println("the name is:" +name);

      /*System.out.println("enter value of p:");
      int P=sc.nextInt();
      System.out.println("enter value of R");
      int R=sc.nextInt();
      System.out.println("enter value of T");
      int T=sc.nextInt();
      int si=((P*R*T)/100);
      System.out.println(si);*/

     // System.out.println("Enter your age:");
     // int age=sc.nextInt();
     /* if(age>50)
      {
          System.out.println("Hello bloomer");
      }
      else if(age<50 && age>20)
      {
          System.out.println("Hii there are you millenial");
      }
      else{
           System.out.println("hello Gen");
      }*/
      
      // switch:
     /* switch(age)
      {
         case 10:
               System.out.println("your age is 10");
               break;

         case 20:
               System.out.println("your age is 20");
               break;
          default:
                 System.out.println(age);          
      }*/

      // for loop:
      /*int i=1;
      for(i=1;i<5;i++)
      {
        System.out.println(i);
      }*/

      /*int i=1;
      for(i=1;i<=10;i++)
      {
        if(i==6)
        {
          break;
        }
        System.out.println(i);
      }*/

      /*int i=1;
      for(;;)
      {
        if(i==6)
        {
          break;
        }
        System.out.println(i);
        i++;
      }*/

      // While loop:
    /* int i=1;
      while(i<=10)
      {
        System.out.println(i);
        i++;
      }*/

      // Do While:
        /* int i=1;
         do{
           System.out.println(i);
           i++;
         }
         while(i<5);*/

// System.out.println("Hello world");

/*int a=10,b=30;
int c=a+b;
System.out.println("Addition of two nos:" +c);*/

// take input from user:
/*System.out.println("Enter two nos:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=a+b;
System.out.println("Addition is:"+c);*/


/*int i=1;
while(i<=4)
{
  System.out.println(i);
  i++;
}*/

/*int i=0;
while(i<=40)
{
  
  System.out.println(i);
  i++;
}*/
/*Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int avg=((a+b+c+d)/4);
System.out.println(+avg);


   //sc.close();*/
// Type casting:
/*double a=12,b=10;
double y=a/b;
System.out.println(y);
int c=(int)y;
System.out.println(c);
boolean bool=true;
System.out.println(bool);
boolean c=!bool;
System.out.println(c);*/
/*int a=10,b=5;
 a+=5;
 System.out.println(a);
 b-=3;
 System.out.println(b);*/

 Scanner sc=new Scanner(System.in);
 //String str=sc.nextLine();
 /*int upper=0;
 int lower=0;
 int digit=0;
 for(int i=0;i<str.length();i++) 
 {
   char c=str.charAt(i);
   if(c>='A' && c<='Z')
   {
     upper++;
   }
   else if(c>='a' && c<='z')
   {
     lower++;
   }
   else if(c>='0' && c<='9')
   {
     digit++;
   }
 }
 System.out.println("Upper" +upper);
 System.out.println("Lower" +lower);
 System.out.println("Digit" +digit);
 */

 //int a=5;
 //System.out.println(a++>5);
// System.out.println(a++);
 //System.out.println(++a>5);
 //System.out.println(++a);

 
 /*System.out.println("enter a string");
 String str=sc.nextLine();
 char ch=str.charAt(1);
 if(ch>=65 && ch<97)
 {
   System.out.println("Upper case");
 }
 else if(ch>=97)
 {
  System.out.println("lower case");
 }
 else{
  System.out.println("pagal hai kay");
 }*/

/*for(int i=0;i<=7;i++)
{
  System.out.println("Hello");
}

for(int i=0;i<10;i++)
{
  System.out.print(i+" ");
}*/

/*int i=0;
while(i<11)
{
 System.out.print(i+" ");
 i++;
}*/

/*int i=0;
do{
  System.out.println(i);
  i++;
}while(i<10);*/
    
// print the sum 4 of natural nos:
/*int sum=0;
for(int i=1;i<=4;i++)
{
  sum=sum+i;
}
System.out.println(sum);*/

// print the table of a number input by user:
 //int n=sc.nextInt();
 /*for(int i=1;i<10;i++)
 {
   System.out.println(i*n);
 }*/

 String month=sc.nextLine();
 switch(month)
 {
   case "Jan":
              System.out.println("January");
              break;
   case "Feb":
              System.out.println("feb");
              break;
   case "March" :
              System.out.println("March");
              break;
   case " Apr":
              System.out.println("Apr");
              break; 
   default: 
              System.out.println("enter valid month");                                        
 }

}   
}