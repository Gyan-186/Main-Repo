package InterviewPrograms;

public class ReversingString {

	public static void main(String[] args) {
		
		String name = "Robert";
		String rev = "";
		
		System.out.println("Original String "+name);
/*		
		for(int i=name.length()-1; i>=0; i--) {			
			rev= rev + name.charAt(i);
		}		
		System.out.println("Reversed String "+rev);
*/
/*		
		char ch[] = name.toCharArray();
		for(int i=name.length()-1; i>=0; i--) {			
			rev= rev + ch[i];
		}		
		System.out.println("Reversed String "+rev);
*/
/*		
		StringBuffer st = new StringBuffer(name);
		System.out.println("Reversed String "+st.reverse());
*/		
		StringBuilder stb = new StringBuilder();
		stb.append(name);
		System.out.println("Reversed String "+stb.reverse());
	}

}
