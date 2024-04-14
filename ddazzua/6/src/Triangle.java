
public class Triangle {

	public static void main(String[] args) {
		for(int i = 0;  i < 7; i++) {
			for(int j = 0; j < 7-i; j++) {
				System.out.print(" ");
			}
			for(int star = 0; star < (i+1); star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
