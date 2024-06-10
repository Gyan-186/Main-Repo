package InterviewPrograms;

public class DublicateElementOfArray {
	
	public static void main(String[] args) {
		
		int arr[] = {3,5,7,3,6,7};
		
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
		
	}

}
