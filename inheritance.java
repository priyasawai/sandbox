 class Vehicle  //Base class
{
    int cost=380;
    int milege=40;
    public void show_vehicle_details()
    {
      System.out.println("i am a vehicle");  
      System.out.println("cost of vehicle is:" +cost);
      System.out.println("milege of vehicle is:" +milege);
    }
}
 class Car extends Vehicle{
     String colour="blue";
     int tyres=4;
     public void show_car_details()
     {
         System.out.println("i am a car");
         System.out.println("Colour of car is:" +colour);
         System.out.println("no of tyres is:"   +tyres);
     }

}


public class inheritance {
    public static void main(String arg[])
    {
       Car c=new Car();
      // c.show_car_details();
      c.show_vehicle_details();
    }

    
}
