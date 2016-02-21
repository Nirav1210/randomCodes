package org.sorting.algos;

public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = {23,41,3,16,8,15};
		
		for(int i=1;i<numbers.length;i++){
			int element = numbers[i];
			int j=i;
			while(j>0 && numbers[j-1]>element){
				numbers[j] = numbers[j-1];
				j=j-1;
				numbers[j] = element;
			}
		}
		for(int k=0;k<numbers.length;k++){
			System.out.println(numbers[k]);
		}
	}

}
