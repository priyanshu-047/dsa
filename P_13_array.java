package dsa_15_10_2024;

public class P_13_array {
      
	public static int fristvaluerepeate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,5,3,4,6,3,4};
      System.out.println(fristvaluerepeate(arr));
	}

}
