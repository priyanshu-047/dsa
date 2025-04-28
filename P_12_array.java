package dsa_15_10_2024;
public class P_12_array {
	static int secondlargest(int[] arr) {
		int largest=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]<arr[i+1]) {
				largest=i+1;
			}
		}
		return largest;
	}
	public static void main(String[] args) {	
		int[] arr= {0,4,3,2,1};
		arr[secondlargest(arr)]=Integer.MIN_VALUE;
		System.out.println(arr[secondlargest(arr)]);
	}
}
