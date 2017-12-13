public class ArrayCalculation
{
   
    public double averageArray(int[][] nums)
    {
        int sum = 0;
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[0].length; col++){
                    sum += nums[row][col];
            }
        }
        int total = nums.length * nums[0].length;
        return (double)sum/total;
    }
    
    public int[] sumColoumns(int[][] nums) 
    {
        int[] result = new int[nums[0].length];
        for(int col = 0; col<nums[0].length; col++){
            int total = 0;
            for(int row = 0; row < nums.length; row++){
                total += nums[row][col];
            }
            result[col] = total;
        }
        return result;
    }
    
    public int[][] squareArray(int[][] nums)
    {
        int[][] result = new int[nums.length][nums[0].length];
        
        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[0].length; col++){
                    int value = nums[row][col];
                    result[row][col] = value*value;
            }
        }
        return result;
    }
}
