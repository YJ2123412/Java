package eleven;

public class Cpoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr01 = {1,3,5,7,9};
		int[] arr02 = new int[5];
		
		for(int i=0; i< arr01.length; i++) {
			arr02[i] = arr01 [i];  }
			
			arr02[1] = 11;
			arr01[0] = 8;
			
			System.out.println();		
			System.out.println("arr01 값 출력"
					);		
			for(int i =0; i< arr01.length; i++) {
				System.out.print(arr01[i]+"\t");	
			}
				
			System.out.println();		
			System.out.println("arr02 값 출력"
						);		
			for(int i =0; i< arr02.length; i++) {
				System.out.print(arr02[i]+"\t");	
				
				
		}
	}

}
