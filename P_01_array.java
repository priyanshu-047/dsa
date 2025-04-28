package dsa_15_10_2024;



public class P_01_array {

	public static int arraysum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		System.out.println(arraysum(arr));
	}

}
