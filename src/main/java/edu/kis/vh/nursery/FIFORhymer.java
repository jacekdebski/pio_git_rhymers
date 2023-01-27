package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer fifoRhymer = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())

			fifoRhymer.countIn(super.countOut());

		int ret = fifoRhymer.countOut();

		while (!fifoRhymer.callCheck())

			countIn(fifoRhymer.countOut());

		return ret;
	}
}
