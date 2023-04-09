package Arrays;

import java.util.Scanner;

public class SumOFZeroInSubArray {
public static void main(String[] args) {
//	System.out.print("enter Length of Array");
//	Scanner sc=new Scanner(System.in);
//	int arr[]= new int[sc.nextInt()];
//	
//	System.out.print("enter Array numbers");
//	for(int i=0;i<arr.length;i++) {
//		
//		arr[i]=sc.nextInt();
//	}
	int arr[]= {-3, 2, 1, 1, 6};
	Boolean a=Sum(arr,arr.length);
	System.out.println(a);
}
public static boolean Sum(int arr[],int n) {
	
	for(int i=0;i<n;i++) {
		int sum=0;
		int large=0;
		for(int j=i;j<n;j++) {
			if(arr[j]==0) {
				return true;
			}
			sum=sum+arr[j];
			if(sum==0) {
				System.out.println(i+" to "+j);
				return true;
			}
		}
	}
	return false;
}
}
