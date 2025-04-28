package dsa_15_10_2024;

public class P_14_array {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=40,b=50;
       System.out.println("a is "+a+"\t b is "+ b);
		//swap using temp variable
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a is "+a+"\t b is "+ b);  
		// swap using sum and diffrence 
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+a+"\t b is "+ b);
		
	}

}
