package InterviewPrograms;

public class LargestElementOfArray {
	
	public static void main(String[] args) {
		
		int arr[] = {34,56,23,533,45,4322};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i=1; i< arr.length; i++) {
			
			if (arr[i]>max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
			
	}

}
