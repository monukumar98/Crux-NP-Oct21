package Lec10;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,6,4,9,3,1};

	}
	public static void Sort(int [] arr) {
		
		for (int counter = 1; counter < arr.length; counter++) {
			int j=counter-1;
			int item=arr[counter];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;		
			
		}
		
	}

}
