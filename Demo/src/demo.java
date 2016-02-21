import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Type N : ");
		int n = sc.nextInt();
		
		System.out.println("Type Order: ");
		int order = sc.nextInt();
		
		int arr[] = new int[n];

		System.out.print("Given Array : ");
		
		for(int i=0;i<n;i++){
			arr[i] = i;
			System.out.print(arr[i]);
		}
		int a = arr.length - order;
		System.out.println();
		reverse(arr,0,a-1);
		reverse(arr,a,arr.length-1);
		reverse(arr,0,arr.length-1);
		

		System.out.print("Rotated Array : ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
		}
	}
	
	public static void reverse(int[] arr, int left, int right){
		while(left<right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
