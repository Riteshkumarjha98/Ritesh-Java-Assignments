package com.assignment;

import java.util.Arrays;

abstract class SortingAlgorithm{
  
	abstract void sort(int[] arr, int n);
	
}

class SelectionSort extends SortingAlgorithm{

	@Override
	void sort(int[] arr, int n) {
    for (int i = 0; i < n-1; i++) {
   
		  int min_idx = i;
	  for (int j = i+1; j < n; j++)
       if (arr[j] < arr[min_idx])
		   min_idx = j;
		 
	  int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;           
		           
    }
    
	}
}

class InsertionSort extends SortingAlgorithm{

	@Override
	void sort(int[] arr , int n) {
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
		
	}

	
}
class BubbleSort extends SortingAlgorithm{

	@Override
	void sort(int[] arr, int n) {
	 for(int i =0;i<n;i++) {
		 for(int j =0;j<n-i-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 swap(arr,j,j+1);
			 }
		 }
	 }
		
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
	}
	
}
class Main{
	public static void main(String[] args) {
		int[] arr = {10,15,20,25,10};
		
		SelectionSort ss = new SelectionSort();
		ss.sort(arr, 5);
		System.out.println(Arrays.toString(arr));
		
		BubbleSort bs = new BubbleSort();
		bs.sort(arr, 5);
		System.out.println(Arrays.toString(arr));
		
		InsertionSort Is = new InsertionSort();
		Is.sort(arr, 5);
		System.out.println(Arrays.toString(arr));
		
	}
}









