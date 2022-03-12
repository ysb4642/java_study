class SutdaDeck3 {
	final int CARD_NUM = 20;
	SutdaCard3[] cards = new SutdaCard3[CARD_NUM];
	
	public SutdaDeck3() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			
			cards[i] = new SutdaCard3(num, isKwang);
		}
	}
	
	void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random() * cards.length);
			
			SutdaCard3 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard3 pick(int index) {
		if (index < 0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}
	
	SutdaCard3 pick() {
		int i = (int)(Math.random() * cards.length);
		return pick(i);
	}
}

class SutdaCard3 {
	int num;
	boolean isKwang;
	
	SutdaCard3() {
		this(1, true);
	}
	
	SutdaCard3(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
public class Exercise7_2 {

	public static void main(String[] args) {
		SutdaDeck3 deck = new SutdaDeck3();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
		

	}

}
