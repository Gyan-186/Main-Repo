package InterviewPrograms;

public class AscOrderArray {

	public static void main(String[] args) {
		
		int arr[] = {6,3,7,2,9,4,1,5};
		int temp = 0;
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
