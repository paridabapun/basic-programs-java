package com.hsbc.methodinjava;//wap passing arrays to methods and returning them
//wap to perform addition using method
import java.io.*;
import java.util.*;
class Matrix{
	int arr[][];//creating a 2d matrix and r(row) c(column)
	int r,c;
	Matrix(int r,int c){//Initialize r,c and allot memory for array
		this.r=r;
		this.c=c;
		arr=new int[r][c];
	}
	//accept 2d array from keyboard and return it
	int[][] getMatrix() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i=0;i<r;i++){
			String s=br.readLine();
			st=new StringTokenizer(s, " ");
			for(int j=0;j<c;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
			
		}
	return arr;
	 
	
	}
	//accept 2d array and find sum matrix and return it
	int[][] findSum(int a[][],int b[][]){
		int temp[][]=new int[r][c];
		for(int i=0;i<r;i++)
		for(int j=0;j<c;j++)
			temp[i][j]=a[i][j]+b[i][j];
		return temp;
		}
	//display the resultant 2d array as a matrix
	void displayMatrix(int res[][])
	{
		for(int i=0;i<r;i++){
			
		
			for(int j=0;j<c;j++)
			{
				System.out.print(res[i][j]+"\t");
				
			}
	System.out.println();
		}
}
}
public class MatrixSum {

	
	public static void main(String[] args) throws IOException {
		Matrix ob1=new Matrix(3, 3);//3*3 matrix
		Matrix ob2=new Matrix(3, 3);//3*3 matrix
		int x[][],y[][],z[][];
		System.out.println("\nEnter Elements for first matrix: ");
		x=ob1.getMatrix();
		System.out.println("\nEnter Elements for second matrix: ");
		y=ob2.getMatrix();
		z=ob1.findSum(x, y);//add the matrix and return result to z
		System.out.println("\nThe sum matrix is    ");
		ob2.displayMatrix(z);
		
		
	}

}
