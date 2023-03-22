package assignment4;

public class Q2 {

	public static void main(String[] args) {

		String str = "Shivam Kumar";
		char[] ch = str.toCharArray();
		
		for(int i=0; i<str.length();i++) {
			for(int j=i+1; j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[j]);
					break;
				}
			}
		}
	}

}
