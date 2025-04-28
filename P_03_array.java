package dsa_15_10_2024;

public class P_03_array {

	static int arraysearch(int[] arr,int val) {
		int target=-1;
		for (int i = 0; i < arr.length; i++) {
		   if(val==arr[i]) {
			   target=i;
		   }
		}
		return target;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[ ] arr= {1,2,3,4,5};
		 System.out.println(arraysearch(arr, 3));
	}

}
