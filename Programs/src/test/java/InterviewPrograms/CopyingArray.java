package InterviewPrograms;

public class CopyingArray {
	
	public static void main(String[] args) {
		
		int arr1[] = {8,86,56,45,34};
		int arr2[] = new int[arr1.length];
		
		for (int i=0;i<=arr1.length-1;i++) {
			arr2[i] = arr1[i];
		}
		
		for (int i=0;i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		} 
	}

}
