class Mobile
{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand +" : "+ price + " : "+name);
    }
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand +" : "+ obj.price + " : "+name);
    }
}


public class _27_Static_Method
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand="Redmi";
        obj1.price = 20000;
        Mobile.name = "Smart phone";

        Mobile obj2 = new Mobile();
        obj2.brand="Realme";
        obj2.price = 24000;
        Mobile.name = "Smart phone";

        obj1.name= "Phone";
        obj1.show();
        obj2.show();

        System.out.println("---Static Method---");
        Mobile.show1(obj1);
        Mobile.show1(obj2);
    }
}