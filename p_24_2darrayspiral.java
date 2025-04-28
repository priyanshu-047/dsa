package dsa_15_10_2024;

import java.util.Scanner;

public class p_24_2darrayspiral {

	public static void spriralmatrix(int[][] arr,int n,int m) {
		//initialize four variable
		int top_row=0,bottom_row=n-1,right_column=m-1,leftcolumn=n-1;
		int total=0;
		
		//while
		while(total<=n*m) {
			
			//first
			for(int j=top_row;j<=right_column && total<=n*m;j++) {
				System.out.print(arr[top_row][j]+ "  ");
				total++;
			}
			top_row++;
			//second
			for(int i=right_column;i<=bottom_row && total<=n*m;i++) {
				System.out.print(arr[i][right_column]+"  ");
				total++;
			}
			right_column--;
			//third
			for(int j=bottom_row;j>=leftcolumn && total<=n*m;j--) {
				System.out.print(arr[bottom_row][j]+"  ");
				total++;
			}
			bottom_row--;
			//fourth
			for(int i=leftcolumn;i>=top_row && total<=n*m;i--) {
				System.out.print(arr[i][leftcolumn]);
				total++;
			}
			leftcolumn--;
		}
	}
	public static void main(String[] args) {
		System.out.println("enter dimention");
		int n,m;
		Scanner scanner= new Scanner(System.in);
		n=scanner.nextInt();m=scanner.nextInt();
		
		int[][] arr=new int[n][m];
		System.out.println("enter");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=scanner.nextInt();
				
			}
		}
		System.out.println();
		spriralmatrix(arr,n,m);
		
		
	}

}
