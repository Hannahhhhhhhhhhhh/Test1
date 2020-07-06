package sort;

public class Quicksort {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,2,5,8,1,9};
		for (int i: arr) {
			System.out.print(i);
		}
		quicksort(arr,0,arr.length-1);
		System.out.println();
		for (int i: arr) {
			System.out.print(i);
		}
	}
	
	public static int getIndex(int[] arr,int low, int high ) {
		int temp = arr[low];
		while(low < high) {
			while(low < high && arr[high]>temp) {
				high--;
			}
			arr[low] = arr[high];
			while(low < high && arr[low]<temp) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = temp;
		return low;
	}
	
	public static void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int index = getIndex(arr,low, high);
			quicksort(arr,0,index-1);
			quicksort(arr,index+1,high);
			
		}
	}

}
