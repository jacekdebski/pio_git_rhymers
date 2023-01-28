package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] numbers = new int[12];

	public int index = -1;

	public void push(int in) {
		if (!isFull())
			numbers[++index] = in;
	}

	public boolean isEmpty() {
		return index == -1;
	}

	public boolean isFull() {
		return index == 11;
	}

	protected int getLast() {
		if (isEmpty())
			return -1;
		return numbers[index];
	}

	public int pop() {
		if (isEmpty())
			return -1;
		return numbers[index--];
	}

}
