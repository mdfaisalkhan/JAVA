class _03_DataType{
    public static void main(String arg[]){

    //   int -> 4 bytes
    //   long -> 8 bytes
    //   shrot -> 2 bytes
    //   byte -> 1 byte -> 2^7 to 2^7 - 1
    //                  -> -128 to 127
    //   float -> 4.4 bytes
    //   double -> 8.6 bytes
    //   char -> 2 bytes ->  UNICODE -> [ char = 'k']
    //   boolean -> true or false
        int num1 = 9;
        byte by = 127;
        short sh = 550; 
        long l = 55000l;

        float f = 5.8f; 
        double d = 5.8;

        char a = 'k';
        char b = '8';

        boolean bol = true;
        System.out.println(num1);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(sh);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(bol);
    }
}