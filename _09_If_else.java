class _09_If_else{
    public static void main(String arg[])
    {
        // int x = 28;
        int x =  18;
        int y = 32;
        int z = 43;
        int a = 2;
        int b = 4;

        // if(x > 10)
        //     System.out.println("Hello");
        if(x>10 && x<=20)
            System.out.println("Hello");
        else
            System.out.println("Bye");
         
         

         if(a<b){
            System.out.println(a);
            System.out.println("Thankyou");
         }
         else
            System.out.println(b);


        if(x>y && x>z)
            System.out.println(x);
        else if(y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);

    }
}