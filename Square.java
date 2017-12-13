// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************

import java.util.Scanner;
public class Square
{

    int[][] square;
    

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square()
    {
        
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        return 0;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        for(int row = 0; row < square.length; row++){
            return 0;
        }
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag(int[][] nums)
    {
        
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        return 0;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
         
        return false;
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
     public void setSquare(int[][] sq)
    {
        this.square = sq;
    }
    



    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for(int row = 0; row < square.length; row++) {
            for(int col =0; col < square[0].length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
     }

}