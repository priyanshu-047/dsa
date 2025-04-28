package dsa_15_10_2024;

public class P_05_array {
	
	public static int lastoccurence(int[] arr , int target) {
		int last=0;
		for (int i = 0; i < arr.length; i++) {
			if(target==arr[i]) {
				last=i;
			}
		}
		return last;
	}
     public static void main(String[] args) {
    	 int[ ] arr= {1,5,3,4,5};
    	 System.out.println(lastoccurence(arr, 5));
	}
}
