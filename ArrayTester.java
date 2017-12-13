public class ArrayTester
{
    public static void main(String[] args) {
        
        int[][] arr1 = {{1, 8, 3,},{10, 21, 16},{32, 53, 12}};
        int[][] arr2 = {{1, 28, 33,},{0, 2, 6},{302, 63, 2}};
        
        ArrayCalculation ac = new ArrayCalculation();
        double avg = ac.averageArray(arr1);
        
        System.out.println("Problem One Part 1");
        System.out.println("The average is: " + avg + "\n\n");
        System.out.println("Problem One Part 2");
        
        int[] result = ac.sumColoumns(arr1);
        
        for(int thing : result) {
            System.out.println("thing " + thing );
        }
        
        System.out.println("\n\nProblem One Part 3");
               
        int[][] squared = ac.squareArray(arr2);
        System.out.println();
        for (int[] row : squared){
            for(int num : row){
                System.out.println(num);
            }
        }
    }
}
