package RecursiveSumTwoDimensionalArray;

/**
 *
 * Problem taken from Data Structures & Algorithms In Java 5th Edition
 * R-3.4 "Describe a way to use recursion to add all the elements in a n x n (two-dimensional) array of integers."
 * 
 * @author Matt
 */
public class RecursiveSum {
    
    /**
     * 
     * @param a array of integers
     * @param i index starting at length of array
     * @return sum of elements of the array
     */
    public static int arraySum(int[] a, int i) {
        if(i == 1) return a[0];
        else  {
        return arraySum(a, i-1) + a[i-1];
        }
    }
    
    /**
     * 
     * @param a two-dimensional array of integers
     * @param i index starting at length of array
     * @return sum of elements of the array
     */
    public static int arraySum(int[][]a, int i) {
        if(i == 1) return arraySum(a[i-1], a[i-1].length);
        else return arraySum(a, i-1) + arraySum(a[i-1], a[i-1].length);
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[][] b = {{3, 2, 1, 2, 3}, {1, 1}};
        int z = arraySum(a, a.length);
        int y = arraySum(b, b.length);
        System.out.println(z);
        System.out.println(y);
    }
    
}
