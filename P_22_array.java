package dsa_15_10_2024;

public class P_22_array {
     static void sortarr(int[] arr) {
    	int i=0,j=arr.length-1,temp;
    	while (i<j) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i++]=arr[j];
				arr[j--]=temp;
			}
		}
     }
	public static void main(String[] args) {
		int[] arr= {9,8,7,4,3,2};
		sortarr(arr);
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
