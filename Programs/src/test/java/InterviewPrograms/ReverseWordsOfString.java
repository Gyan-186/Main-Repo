package InterviewPrograms;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		
        String inputString = "We are Learning Java Programs";
		
		String[] words = inputString.split(" ");
		
		for (int i=words.length-1; i>=0; i--) {
			String eachword = words[i];
			System.out.print(eachword+" ");
		}
	}

}
