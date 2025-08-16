// class Calculator
// {
//     int a;
//     public int add()
//     {
//             System.out.println("In Add");
//             return 0;
//     }
// }


// public class _16_Class_Object
// {
//     public static void main (String args[])
//     {
//         int num1 = 7;
//         int num2 = 4;

//         Calculator calc = new Calculator(); //Object 

//         calc.add();
//     }
// }.

// --------Printing Intiger values -------------
class Calculator
{
    public int add(int num1, int num2)
    {
        int r = num1 + num2;
        return r;       
    }
}


public class _16_Class_Object
{
    public static void main (String args[])
    {
        int num1 = 7;
        int num2 = 4;

        Calculator calc = new Calculator(); //Object 

        int result =calc.add(num1, num2);
        System.out.println(result);
    }
}