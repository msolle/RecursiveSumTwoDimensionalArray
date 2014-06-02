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
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int b = arraySum(a, 3);
        System.out.println(b);
    }
    
}
