package assignment2;

public class Q1 {

	public static void main(String[] args) {
		
		int[] arr = {2,5,6,2,9,7,1,5,8};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
