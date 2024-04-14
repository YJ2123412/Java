package eleven;

import java.util.Arrays;


public class Arr {

	public static void main(String[] args) {

		int[] cards = {1,3,4,5,6,};
		
		//copyOF(복사대상, 복사길이)
		int[] newCards = Arrays.copyOf(cards, cards.length);
		
		System.out.println("복사 후: " + Arrays.toString(newCards));
		
		cards[1] = 10;
		newCards[3] = 22;
		
		System.out.println("cards: " +Arrays.toString(cards));
		System.out.println("newcards: " +Arrays.toString(newCards));


	}

}
