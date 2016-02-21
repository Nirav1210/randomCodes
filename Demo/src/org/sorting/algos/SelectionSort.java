package org.sorting.algos;

public class SelectionSort {

	public static void main(String[] args){
		int[] numbers = {23,42,4,16,8,15};
		int counter=1;
		
		Selection(counter, numbers);
	}
	public static void Selection(int counter,int[] a){
		int min=a[counter-1];
		int minIndex=counter-1;
		for(int i=counter;i<a.length;i++)
		{
			if(min>a[i]){
				min = a[i];
				minIndex = i;
			}
		}
		int temp = a[minIndex];
		a[minIndex] = a[counter-1];
		a[counter-1] = temp;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println();
		if(counter++ < a.length){
			Selection(counter++,a);
		}
	}

}
