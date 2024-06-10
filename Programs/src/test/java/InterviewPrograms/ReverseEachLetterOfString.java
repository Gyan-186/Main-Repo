package InterviewPrograms;


public class ReverseEachLetterOfString {

	public static void main(String[] args) {
		
        String inputString = "Learning Java Programs";
		
		String[] words = inputString.split(" ");
		String reverseString = "";
		
		for (int i=words.length-1; i>=0; i--) {
			String eachword = words[i];
			String reverseEachWord = "";
			
			for(int j=eachword.length()-1;j>=0;j--) {
				
				 reverseEachWord = reverseEachWord + eachword.charAt(j);
			}
			
			reverseString = reverseString + reverseEachWord + " ";
		}
		
		System.out.println(reverseString);
		
		
/*		
		String inputString = "Learning Java Programs";
		
		String[] words = inputString.split(" ");
		String reverseString = "";
		
		for (int i=0; i<words.length;i++) {
			String eachword = words[i];
			String reverseEachWord = "";
			
			for(int j=eachword.length()-1;j>=0;j--) {
				
				reverseEachWord = reverseEachWord + eachword.charAt(j);
			}
			
			reverseString = reverseString + reverseEachWord + " ";
		}
		
		System.out.println(reverseString);
*/
		

		
	}

}
