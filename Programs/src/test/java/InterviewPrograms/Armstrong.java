package InterviewPrograms;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int num = 153, rem, result = 0;
		int temp = num;
		
		while (num>0) {
			
			rem = num%10;
			num= num/10;
			result = result + (rem*rem*rem);
		}
		
		if(temp==result) {
			System.out.println(temp+" is an Armstrong number");
		}
		else {
			System.out.println(temp+" is not an Armstrong number");
		}
		
	}

}
