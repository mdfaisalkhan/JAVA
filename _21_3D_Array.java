public class _21_3D_Array{
    public static void main(String args[])
    {
      int nums[][][]= new int[3][4][5];



    //   int nums[][] = new int[3][]; //jagged 

    //   nums[0] = new int[3];
    //   nums[1] = new int[4];
    //   nums[2] = new int[2];


    //-------------- Jagged 3D array example------------
    // int nums[][][] = new int[3][][]; // First dimension fixed at 3

// Initialize each 2D slice with different dimensions
    // nums[0] = new int[4][5]; // First slice 4x5
    // nums[1] = new int[2][3]; // Second slice 2x3
    // nums[2] = new int[5][4]; // Third slice 5x4

      for(int i = 0; i < nums.length; i++)
      {
        for(int j = 0; j < nums[i].length; j++)
        {
            for(int k = 0; k < nums[i][j].length; k++)
            {
                nums[i][j][k] = (int)(Math.random() * 10);
                System.out.print(nums[i][j][k]+" ");

            }
            System.out.println();
        }
            System.out.println();
      }
       
    }
}