
class Mobile
{
    String brand;   //instance variable 
    int price;
    static String name; //By adding static then this variable will common to all the object

    public void show()
    {
        System.out.println(brand + " : " + price + " + " +name);
    }
}

public class _26_Static_Variable
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price= 45000;
        // obj1.name = "Smart Phone";  //static variable call by the class name
        Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price= 35000;
        Mobile.name = "Smart Phone";

        obj1.name="Phone";  // It changes the name Smart phone to phone (static variable effect all the object)

        obj1.show();
        obj2.show();

        
    }
}