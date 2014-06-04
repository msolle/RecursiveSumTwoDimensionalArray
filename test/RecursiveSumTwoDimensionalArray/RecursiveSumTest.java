package RecursiveSumTwoDimensionalArray;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class RecursiveSumTest {
    
    public RecursiveSumTest() {
    }

    /**
     * Test of arraySum method, of class RecursiveSum, with an array of sum equals zero
     */
    @Test
    public void testArraySum_zero() {
        System.out.println("arraySum of array of zeroes");
        int[][] a = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}};
        int expResult = 0;
        int result = RecursiveSum.arraySum(a, a.length);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of arraySum method, of class RecursiveSum, with an array of sum equals one
     */
    @Test
    public void testArraySum_one() {
        System.out.println("arraySum of 1");
        int[][] a = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0, 0, 0, 0, 1}};
        int expResult = 1;
        int result = RecursiveSum.arraySum(a, a.length);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of arraySum method, of class RecursiveSum, with an array of sum equals 51904
     */
    @Test
    public void testArraySum_large() {
        System.out.println("arraySum of large number");
        int[][] a = {{0, 2, 3}, {3, 5, 99}, {50000, 2, 120, 57, 0, 610, 999}, {1}, {3}};
        int expResult = 51904;
        int result = RecursiveSum.arraySum(a, a.length);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of arraySum method, of class RecursiveSum, with an array consisting of singular values of nested arrays
     */
    @Test
    public void testArraySum_single() {
        System.out.println("arraySum of single nested arrays");
        int[][] a = {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}};
        int expResult = 8;
        int result = RecursiveSum.arraySum(a, a.length);
        assertEquals(expResult, result);
    }

    
}
