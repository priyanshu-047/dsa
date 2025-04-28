package dsa_15_10_2024;
   
public class P_06_array {
    public static int strictlygreater(int[] arr,int val) {
    	int number=0;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i]>val) {
				number++;
			}
		}
    	return number;
    }
  public static void main(String[] args) {
	  int[ ] arr= {1,2,3,4,5};
	  System.out.println(strictlygreater(arr, 3));
}
}
