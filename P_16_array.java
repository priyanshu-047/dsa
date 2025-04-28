package dsa_15_10_2024;

public class P_16_array {

	static int[] rotate(int[] arr, int target ) {
		target =target%(arr.length);
		int[] ans=new int[arr.length];
		int j=0;
		for (int i =arr.length-target ; i <=arr.length-1; i++) {
			ans[j++]=arr[i];
		}
		for (int i = 0; i <= arr.length-(target+1); i++) {
			ans[j++]=arr[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {1,2,3,4,5};
       int[] ans=rotate(arr,6);
       for(int x:ans) {
    	   System.out.println(x);
       }
	}

}
