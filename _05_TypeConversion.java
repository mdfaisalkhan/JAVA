class _05_TypeConversion{
    public static void main(String args[])
    {
        // byte b = 127;
        int a = 123 ;
        byte k = (byte) a;     //type casting
        System.out.println(k);

        float f = 5.6f;
        int t =(int) f;
        System.out.println(t);

        // type promotion

        byte a1 = 10;
        byte b1 = 30;
        int result = a1 * b1; 

        System.out.println(result);

    }
}