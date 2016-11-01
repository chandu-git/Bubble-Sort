package com.test1;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		boolean swapped = true;
		int j = 0;
		int tmp;
		while (swapped) { // Stops when there are no more swaps (which means that the data is sorted)
			swapped = false;
			j++;
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {    // if current spot is smaller than next spot                    
					tmp = arr[i];           // stores current spot in tmp variable
					arr[i] = arr[i + 1];    // makes current spot equal to next spot
					arr[i + 1] = tmp;       // makes next spot equal to tmp variable
					swapped = true;         // swapping occurred, so sorting still needs to happen
				}
			}                
		}
		return arr;
	}


	public static void main(String[] args) {
		int[] a = {60,40,20,50,80,30,10,90};
		long startTime = System.currentTimeMillis();
		a = bubbleSort(a);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
