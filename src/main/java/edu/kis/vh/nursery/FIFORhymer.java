package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer fifoRhymer = new defaultCountingOutRhymer();

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
