package Arrays;

public class ASCAndDSC {
	public static void main(String[] args) {
	     int arr[]={5,15,21,-41,-10,0};
	     System.out.println(Ascend(arr));
	     for(int i=0;i<arr.length;i++){
		     System.out.println("Asc = "+arr[i]);
		    }
	     System.out.println(Dscend(arr));
	     for(int i=0;i<arr.length;i++){
	    	 System.out.println("Dsc = "+arr[i]);
	     }
	}
	public static int[] Ascend(int [] arr) {
		int temp=0;
	     for(int i=0;i<arr.length;i++){
	         for(int j=0;j<arr.length-1;j++){
	             if(arr[j]>arr[j+1]){
	                 temp=arr[j];
	                 arr[j]=arr[j+1];
	                 arr[j+1]=temp;
	             }
	         }
	     }
	     return arr;
	}
	public static int[] Dscend(int [] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
