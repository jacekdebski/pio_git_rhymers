package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer fifoRhymer = new DefaultCountingOutRhymer();

	@Override
	public int pop() {
		while (!isEmpty())

			fifoRhymer.push(super.pop());

		int ret = fifoRhymer.pop();

		while (!fifoRhymer.isEmpty())

			push(fifoRhymer.pop());

		return ret;
	}
}
