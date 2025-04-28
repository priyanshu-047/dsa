package dsa_15_10_2024;

// two pointers 
public class P_21_array {

	static void eventhenodd(int[] arr) {
		int i=0,j=arr.length-1,temp;
		while (i<j) {
		   if (arr[i]%2==0 && arr[j]%2!=0) {
			i++;
			j--;
		}
		   else if (arr[i]%2==0) {
			i++;
		}
		   else if (arr[j]%2!=0) {
			j--;
		}
		   else {
			   temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			i++;
			j--;
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,8,7,4,3,2};
		eventhenodd(arr);
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
