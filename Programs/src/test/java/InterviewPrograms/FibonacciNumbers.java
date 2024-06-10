package InterviewPrograms;

public class FibonacciNumbers {
	
	public static void main(String[] args) {
		
		int a=0, b=1, sum, count=15;
		
		System.out.print("Fibonacci Series = "+a+","+b);
		 for (int i=2;i<count;i++)
		 {
			 sum = a+b;
			 System.out.print(","+sum);
			 
			 a=b;
			 b=sum;
			 
		 }
	}

}
