package dsa_15_10_2024;

public class P_04_array {
	static int arrayoccurence(int[] arr, int val) {
		int occurence=0;
	 for (int i = 0; i < arr.length; i++) {
		if(arr[i]==val) {
			occurence++;
		}
	}
		return occurence;
	}
  public static void main(String[] args) {
	  int[ ] arr= {1,2,1,1,5};
	  System.out.println(arrayoccurence(arr, 1));
}
}
