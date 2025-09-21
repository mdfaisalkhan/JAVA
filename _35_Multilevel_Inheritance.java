class Calc
{
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}
class AdvClass extends Calc
{
    public int mul(int n1, int n2)
    {
        return n1 * n2;
    }
    public int div(int n1, int n2)
    {
        return n1 / n2;
    }
}
class SciCalc extends AdvClass{
    public double power(int n1 , int n2)
    {
        return Math.pow(n1, n2);
    }
}

    public class _35_Multilevel_Inheritance    
{
    public static void main(String agrs[])
    {
        SciCalc obj = new SciCalc();

        int r1 = obj.add(2, 4);
        int r2 = obj.sub(4, 2);
        int r3 = obj.mul(6, 5);
        int r4 = obj.div(8, 2);
        double r5 = obj.power(3,6);
        
        System.out.println("Add : "+r1);
        System.out.println("Sub : "+r2);
        System.out.println("Mul : "+r3);
        System.out.println("Div : "+r4);
        System.out.println("Power: "+r5);
    
    }
}
