package CIS285FinalExam;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testInsertionSort {

	@Test
	void test() {
		fail("Not yet implemented");
		testPositive();
		testNegative();
		testMixed();
	}
	
	public testInsertionSort() {
	}
	
	public void testPositive()
	{
		int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        insertionSort temp = new insertionSort();
        int[] arr2 = new int[5];
        arr2[0] = 2;
        arr2[1] = 7;
        arr2[2] = 8;
        arr2[3] = 9;
        arr2[4] = 10;
        
        assertArrayEquals("Failed Positive Test", arr2, Sortedarr);
	}
	
	public void testNegative()
	{
		int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        insertionSort temp = new insertionSort();
        int[] arr2 = new int[5];
        arr2[0] = -10;
        arr2[1] = -9;
        arr2[2] = -8;
        arr2[3] = -7;
        arr2[4] = -2;
        
        assertArrayEquals("Failed Negative Test", arr2, Sortedarr);
	}
	
	public void testMixed()
	{
		int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -7;
        Sortedarr[2] = -2;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        insertionSort temp = new insertionSort();
        int[] arr2 = new int[5];
        arr2[0] = -8;
        arr2[1] = -7;
        arr2[2] = -2;
        arr2[3] = 9;
        arr2[4] = 10;
        
        assertArrayEquals("Failed Mixed Test", arr2, Sortedarr);
	}

}
