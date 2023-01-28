package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void push(int in) {
		if (!isEmpty() && in > getLast())
			totalRejected++;
		else
			super.push(in);
	}
}
//Pytanie: Które wiersze w klasie HanoiRhymer były źle sformatowane?
//		W klasie HanoiRhymer źle sformatowane były wiersze: 5, 12, 14 i 15.
//Zweryfikuj działanie kombinacji klawiszy alt + ← oraz alt + →.
//Skrót umożliwia przechodzenie pomiędzy ostatnio modyfikowanymi linijkami w projekcie, gdy wczytana jest opcja
//Keymap:Eclipse w IntelliJ IDEA.