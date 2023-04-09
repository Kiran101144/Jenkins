package Arrays;

public class ArithmaticOperat {
public static void main(String[] args) {
	float arr[]= {10,10,10,10,10,0};
	System.out.println(AVG(arr));
}
static float result,sum;
public static float AVG(float [] arr) {
	
	for(int i=0;i<arr.length;i++) {
		 sum=sum+arr[i];
	}
	System.out.println(sum);
	result=sum/arr.length;
	return result;
}

}
