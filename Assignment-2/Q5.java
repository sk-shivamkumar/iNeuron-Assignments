package assignment2;

public class Q5 {
	
	 public static void printArray(int arr[]) {
	       for(int i=0; i<arr.length; i++) {
	           System.out.print(arr[i]+" ");
	       }
	       System.out.println();
	   }
	 
	public static void main(String[] args) {
		int arr[] = {7, 9, 1, 6, 2};
	    
	       for(int i=0; i<arr.length-1; i++) {
	           int smallest = i;
	           for(int j=i+1; j<arr.length; j++) {
	               if(arr[j] < arr[smallest]) {
	                   smallest = j;
	               }
	           }
	           int temp = arr[smallest];
	           arr[smallest] = arr[i];
	           arr[i] = temp;
	       }
	 
	       printArray(arr);
	}
}
