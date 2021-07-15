import java.util.Collections;
import java.util.Stack;

public class Chikorita {
	public static void main(String[] args) {
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 10; col++) {
				Stack<Integer> cards = new Stack<Integer>();
				Stack<Integer> hand = new Stack<Integer>();
				for(int i = 1; i < 14; i++) {
					for (int j = 0; j < 4; j++ ) {
						cards.push(i);
					}
				}
				Collections.shuffle(cards);
				for (int j = 0; j < 4; j++ ) {
					hand.push(cards.pop());
				}
				int sum = 0;
				for(int card: hand) {
					sum += card;
				}
				double average = sum/4.0;
				System.out.print(average+" ");
			}
			System.out.println();
		}
			
	}
}
