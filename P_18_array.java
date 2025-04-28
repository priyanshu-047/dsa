package dsa_15_10_2024;

public class P_18_array {

	static int[] frequencyarray(int[] arr,int range) {
		
		int[] frarr=new int[range];
		for(int x:arr) {
			frarr[x]++;
		}
		return frarr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int[] target = {1,2,2,3,5,8};
	    int frarr[]=  frequencyarray(arr, 10);
	
	    for(int x:target) {
	    	if(frarr[x]==0) {
	    		System.out.print("false \t");
	    	}
	    	else {
				System.out.print("true \t");
			}
	    }
	}

}
