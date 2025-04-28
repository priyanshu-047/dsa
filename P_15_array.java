package dsa_15_10_2024;




//reverse array
public class P_15_array {

	static  void reverse(int[] arr) {
		int i=0,j=arr.length-1,temp;
		while(i<j) {
			temp=arr[i];
			arr[i++]=arr[j];
			arr[j--]=temp;
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,2,3,4,5};
        reverse(arr);
        
       for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	 }
		
	}

}
