package InterviewPrograms;

import java.util.Scanner;

public class ReversingNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the Number ");		
		int num = sc.nextInt();		
		System.out.println("Original number "+num);
/*		
		int rev = 0 ;	
		while (num != 0) {
			
			rev = rev*10 + num%10;
			num = num/10;			
		}
		
		System.out.println("After reversing "+rev);
*/
/*		
		StringBuffer st = new StringBuffer(String.valueOf(num));
		System.out.println("After reversing "+st.reverse());
*/

		StringBuilder stb = new StringBuilder();
		stb.append(num);
		System.out.println("After reversing "+stb.reverse());
	
	}

}