package InterviewPrograms;

public class SwappingTwoNumbers {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 75;
		
		System.out.println("Value of a = "+a+" Value of b = "+b);
		
		int c;
		
/*		c=a;
		a=b;
		b=c;		
		System.out.println("Value of a = "+a+" Value of b = "+b);
*/		
		
/*		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a = "+a+" Value of b = "+b);
*/		
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Value of a = "+a+" Value of b = "+b);
		
		
		
		
		
		
	}

}
