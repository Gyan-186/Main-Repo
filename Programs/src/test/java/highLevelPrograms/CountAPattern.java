package highLevelPrograms;

public class CountAPattern {
	
public static void main(String[] args) {
		
		String s = "abcdefkhsdkjfhsdhfhabcsdhabc";
		
		String pattern = "sdh";
		
		int count =0;
		String [] combArray = new String[s.length()-2];
		int start = 0;
		int end = 3;
		
		for(start=0; end<=s.length(); end++ )
		{
			combArray[start] = s.substring(start, end);
			
			start++;
		}
		
		for(String ss :combArray)
		{
			System.out.println(ss);
			
			if(ss.equals(pattern))
			{
				count = count +1;
			}
		}
	
		
		System.out.println(count);
		
		
	}

}
