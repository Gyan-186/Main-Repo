package InterviewPrograms;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num = 16761;
		int rev = 0;
		int temp = num;
		System.out.println("Original number = "+num);
		
		while(num !=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Reversed Number = "+rev);
		
		if (temp==rev) {
			System.out.println(temp+" is a Palindrome number");			
		}
		else {
			System.out.println(temp+" Number is not a Palindrome number");	
		}

		
	}

}
