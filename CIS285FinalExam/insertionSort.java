package CIS285FinalExam;

public class insertionSort {

	public insertionSort() {
		
	}
	
	public void basicInsertionSort(int arr[], int n)
	{
		if (n <= 1)
		{
			return;
		}
		
		basicInsertionSort(arr, n-1);
		
		int last = arr[n - 1];
		int j = n - 2;
		
		while (j >= 1 && arr[j+1] > last) //find the correct index 
        { 
            arr[j+1] = arr[j];     //shift section of sorted elements upwards 
            j--; 
        } 
        arr[j] = last;         //set the last element at its correct index
		
	}
}
