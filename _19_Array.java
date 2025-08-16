public class _19_Array
{
    public static void main(String args[])
    {
        // int nums[] = {3,2,5,8};
        // nums[1]=6;
        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
    
    int nums[] = new int[4];
    nums[0] = 4;
    nums[1] = 3;
    nums[2] = 7;
    nums[3] = 5;

    System.out.println(nums[0]);
    System.out.println(nums[1]);
    System.out.println(nums[2]);
    System.out.println(nums[3]);


    System.out.println("Printing Array using loop");

    for(int i=0; i<4; i++)
    {
    System.out.println(nums[i]);

    }
    }

}