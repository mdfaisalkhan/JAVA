class A
{
    public A()
    {
        super();
        System.out.println("This is A");
    }
    public A(int n)
    {
        super();
        System.out.println("A Int");

    }
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
}
class B extends A
{
    public char[] marks;
    public B()
    {
        super();
        System.out.println("This is B");
    }
    public B(int n)
    {
        // super(n);  // i am not passing parameter then it will print class A non para.. constructor

        this(); //this will call constructor of the same class
        System.out.println("B Int");
    }
}

public class _37_This_and_Super_Method{
    public static void main(String args[])
    {
        B obj = new B(3);   
        // B obj1 = new B();
       
    }
}