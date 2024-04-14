package eleven;

public class Bubble2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp = 0;
		int[] arr = new int[10];
	
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 50) + 1;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr.length - 1) - i; j++) {
		if(arr[j]>arr[j+1])
			swap (arr[j], arr[j+1]);
		}
			System.out.println(arr);
	}

}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
