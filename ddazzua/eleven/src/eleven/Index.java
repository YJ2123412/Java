package eleven;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inArray = new int[5];
		String[] strArray = new String[5];
		
		int[] varArray = {1, 2, 3, 4, 5};
		
		System.out.println(inArray);
		System.out.println(inArray[0]);
		System.out.println(inArray[2]);

		System.out.println(varArray[0]);

		inArray[0] = 10;
		inArray[1] = 12;
		inArray[2] = 32;

		System.out.println(inArray[0]);
		System.out.println(inArray[2]);
	}

}
