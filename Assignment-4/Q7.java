package assignment4;

public class Q7 {

	public static void main(String[] args) {

		String str = "Shivam Kumar";
		int uCount = 0;
			
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					uCount++;
				}
			}
		}
		if(uCount==0) {
		    System.out.println("All characters are unique");
		}
		else {
			System.out.println("All characters are not unique");
	   }
	}

}
