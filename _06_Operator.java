class _06_Operator
{
    public static void main(String args[])
    {

        int num1 = 7;
        int num2 = 5;

        int add = num1 + num2;
        System.out.println("Addition is " +add); 

        int sub = num1 - num2;
        System.out.println("Subtraction is " +sub);

        int div = num1 / num2;
        System.out.println("Division is " +div);

        int mul= num1 * num2;
        System.out.println("Multiply is " +mul);

        int mod= num1 % num2;
        System.out.println("Modulas is " +mod);  

        num1 += 3;
        System.out.println(num1);  
        num2 *= 3;
        System.out.println(num2);  

        num1++;   // Post Increment and ++num pre Increment
        System.out.println(num1);  
        num1--;       
        System.out.println(num1);  
        --num2;
        System.out.println(num2);  

    //   ++a -> first Increment then print the value => pre increment
    //   a++ -> first print then increment the value => post increment

    //   --a -> first decrement then print the value => pre decrement
    //   a-- -> first print then decrement the value => post decrement

    }
}