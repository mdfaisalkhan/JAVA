class _08_LogicalOperator
{
    public static void main(String args[])
    {
        int x = 7;
        int y = 5;
        int a = 5; 
        int b = 9; 

        boolean result = x > y && a > b;
        System.out.println(result); 
        
        boolean result2 = x > y && a < b;
        System.out.println(result2); 
        
        boolean result3 = x > y || a < b;
        System.out.println(result3); 
        
        boolean result4 = x > y || a > b;
        System.out.println(result4); 

        boolean result5 = x > y || a > b || a > 1;
        System.out.println(result5); 

        boolean result6 = x > y;
        System.out.println(!result6); 

    }

}
/*
  && AND             || OR
 T T -> T           T T -> T
 T F -> F           T F -> T
 F T -> F           F T -> T
 F F -> F           F F -> F

*/