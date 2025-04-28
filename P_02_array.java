package dsa_15_10_2024;

public class P_02_array {
	static int arraymax(int[] arr) {
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max ;
	}
	public static void main(String[] args) {
		 int[ ] arr= {1,2,3,4,5};
	      System.out.println(arr[arraymax(arr)]);
	}
  
}
