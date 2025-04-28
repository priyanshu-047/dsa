package dsa_15_10_2024;

// two pointers 
public class P_20_array {

	static void custumsortarray(int[] arr) {
		int i=0,j=arr.length-1;
		while (i<j) {
		   if (arr[i]==0 && arr[j]==1) {
			i++;
			j--;
		}
		   else if (arr[i]==0) {
			i++;
		}
		   else if (arr[j]==1) {
			j--;
		}
		   else {
			arr[i]=0;
			arr[j]=1;
			i++;
			j--;
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,1,0,1,0};
		custumsortarray(arr);
		for(int x:arr) {
			System.out.println(x);
		}
	}

}
