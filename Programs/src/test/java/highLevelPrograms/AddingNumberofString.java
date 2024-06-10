package highLevelPrograms;

public class AddingNumberofString {

public static void main(String[] args) {
		
		
		String s= "hfjh3j334fjsdhfkjk33tsdjhf6";
		
		String number = "";
		boolean isNumberPresent = false;
		
		int sum = 0;
		
 		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				 number = number + s.charAt(i);
				 isNumberPresent = true; 
				 
				 if(i!= (s.length()-1))
				 {
					 continue;
				 }
				 				
			}			
			
			if(isNumberPresent)
			{
				int value = Integer.parseInt(number);				
				number = "";				
				sum = sum + value;				
				isNumberPresent = false;
			}
			
		}
		
		System.out.println(sum);
				
	}

}