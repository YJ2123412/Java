import java.util.Arrays;   
public class BubbleExam {

	
	public static void main(String[] args) {

		int[] b = {7,5,3,6};
		int temp = 0;
		
		for(int i=0; i < b.length; i++) {
			for(int j =0; j < b.length-1; j++) {
				if( b[j] > b[j+1]) {
					temp = b[j+1];
					b[j+1] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(b));
		
	}
}


