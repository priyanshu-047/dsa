package dsa_15_10_2024;



public class P_08_array {
   
	static int[] smallandlarge( int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1]>arr[i]) {
				temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		 int[ ] arr= {5,4,3,2,1};
		 System.out.println(smallandlarge(arr));
	}
}
