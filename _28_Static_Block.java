
    
class Mobile
{
    String brand;
    int price;
    static String name;

    static       
    {
        name = "Phone";
        System.out.println("in static block");
    }
    public Mobile()  // Default Constructor
    {
        brand= "";
        price=200;
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println(brand +" : "+ price + " : "+name);
    }
   
}

public class _28_Static_Block
{
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class.forName("Mobile");
        // Mobile obj1 = new Mobile();
        // obj1.brand="Redmi";
        // obj1.price = 20000;
        // Mobile.name = "Smart phone";

        // Mobile obj2 = new Mobile();

    }
}     ff  f   fef ef  f  e f  s fef    s


// Static{}Initialing static variable (static block will   call only once in respective how many objects you create )