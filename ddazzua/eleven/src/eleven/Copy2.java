package eleven;

public class Copy2 {

	public static void main(String[] args) {
		int[] cards = {1,6,9,8,2,7};
		int[] newcards = {4,5,7,9,1,3,9,2,1,9};
		
		System.arraycopy(cards, 3, newcards, 3, 5);
		
		System.out.println("card: ");
		for(int i=0; i< cards.length; i++) {
			System.out.print(cards[i]+"\t");
		}
		System.out.println();
		
		System.out.println("new cards: ");
		for(int i= 0; i< newcards.length; i++) {
			System.out.print(newcards[i]+"\t");
			
		}
		
	}


}
