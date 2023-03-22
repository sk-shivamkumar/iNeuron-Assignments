package assignment4;

public class Q4 {

	public static void main(String[] args) {

		String str = "@Shivam";
		str = str.toLowerCase();
		
		int vCount = 0, cCount=0, sCount=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a'||
					str.charAt(i)=='e'||
					str.charAt(i)=='i'||
					str.charAt(i)=='o'||
					str.charAt(i)=='u') 
			{
				vCount++;
			}
			else if(str.charAt(i)=='@'||
					str.charAt(i)=='$') {
				sCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
				cCount++;
			}
		}
		
		System.out.println("Total vowels: "+vCount);
		System.out.println("Total consonants: "+cCount);
		System.out.println("Total special character: "+sCount);
	}

}
