package dsa_15_10_2024;



public class P_17_array {

	static  void reverse(int[] arr,int start,int end) {

		int i=start,j=end,temp;
		while(i<j) {
			temp=arr[i];
			arr[i++]=arr[j];
			arr[j--]=temp;
		}
	}
    
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int k=4;
		reverse(arr,0,arr.length-(k+1));
		reverse(arr, k-1, arr.length-1);
		reverse(arr, 0, arr.length-1);
		for(int x:arr) {
			System.out.println(x);
		}

	}

}
