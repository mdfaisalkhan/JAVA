class A
{
    public A(){
        System.out.println("This is Constructor");
    }
    public void show()
    {
        System.out.println("This is A Show");
    }
}
public class _33_Anonymous_object
{
    public static void main(String[] args) 
    {
        new A().show();  //Anonymous object
        new A().show();
    }
}
