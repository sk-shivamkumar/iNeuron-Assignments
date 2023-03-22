package assignment4;

public class Q8 {

	public static void main(String[] args) {

		String str = "maxcharacter";
		char[] charr = str.toCharArray();
		int[] freq = new int[str.length()];
		int max;
		char maxchar=str.charAt(0);
		
		for(int i=0;i<str.length();i++) {
			freq[1]=1;
			for(int j=i+1;j<str.length();j++) {
				if(charr[i]==charr[j]&&charr[i]!=' '&& charr[i]!='0') {
					freq[i]++;
					charr[j]='0';
				}
			}
		}
		
		max=freq[0];
		for(int i=0;i<freq.length;i++) {
			if(max<freq[i]) {
				max = freq[i];
				maxchar = charr[i];
			}
		}
		
		System.out.print(maxchar);
	
	}

}
