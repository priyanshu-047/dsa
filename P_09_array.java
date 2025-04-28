package dsa_15_10_2024;



public class P_09_array {
	static int targetsum(int[] arr, int val) {
		int pair=0;
		 for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]+arr[j]==val) {
						pair++;
					}
				}
			}
		 return pair;
	}
     public static void main(String[] args) {
//		target sum 
    	 int[ ] arr= {5,4,3,2,1};
    	System.out.println(targetsum(arr, 5));
	}
}
