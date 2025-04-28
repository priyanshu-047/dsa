package dsa_15_10_2024;

public class P_25_recursion {
	 public static  void  indexofelement(int[] arr,int target,int l) {
		 if(arr[l]==target) {
			 System.out.println(l+1);
		 }
		
		 if(l==0) {
			 return ;
		 }
		 indexofelement(arr, target, l-1);
	 }

	public static void main(String[] args) {
		  int[] arr= {1,2,1,1,1,4};
	      indexofelement(arr, 1, arr.length-1);

	}

}
