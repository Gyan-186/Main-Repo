package highLevelPrograms;

public class AddIndividualNumber {
	
public static void main(String[] args) {
		
		
		String s = "ab5ds51s2";
		String number ="";
		int sum = 0;
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(Character.isDigit(c))
			{
			number = number + c;
				
			int num = Integer.parseInt(number);
			
			sum = num + sum;
			
			number = "";
			
			}
		}
		
		System.out.println(sum);
	}

}
