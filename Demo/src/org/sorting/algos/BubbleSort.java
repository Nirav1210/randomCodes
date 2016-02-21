package org.sorting.algos;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = {3,2,9,6,5};
		doBubbleSort(0,numbers);
	}
	
	private static void doBubbleSort(int counter,int[] arr)
	{
		boolean flag = true;
		while(flag)
		{
			flag = false;
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = true;
				}
			}
			counter = counter+1;
		}
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
		System.out.println("Counter : "+counter);
	}

}
