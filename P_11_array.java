package dsa_15_10_2024;

public class P_11_array {

	static int unique(int[] arr) {
	 for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) {
				arr[i]=-1;
				arr[j]=-1;
			}
		}
	}
	  for(int x:arr) {
		  if(x!= -1) {
			  return x;
		  }
	  }
	  return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,2,3,4,3};
		System.out.println(unique(arr));

	}

}
