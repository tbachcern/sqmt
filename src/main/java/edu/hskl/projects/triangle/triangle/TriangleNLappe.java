package edu.hskl.projects.triangle.triangle;

import java.util.Arrays;

public class TriangleNLappe extends Triangle {

	private int mA;
	private int mB;
	private int mC;

	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {

		if (lengths.length == 3) {
			Arrays.sort(lengths);
			mA = lengths[0];
			mB = lengths[1];
			mC = lengths[2];
		} else {
			return TriangleResult.UNKNOWN;
		}

		if (mA >= 1 && mB >= 1 && mC >= 1) {
			if (mA + mB < mC)
				return TriangleResult.UNKNOWN;
			if ((mA == mB) && (mA == mC))
				return TriangleResult.TRIANGLE_EQUILATERAL;
			if (((mA == mB) && (mA != mC)) || ((mA == mC) && (mA != mB)) || ((mB == mC) && (mB != mA)))
				return TriangleResult.TRIANGLE_ISOSCELES;
			if ((mA != mB) && (mA != mC) && (mB != mC))
				return TriangleResult.TRIANGLE_NOT_EQUAL;
		}
		return TriangleResult.UNKNOWN;
	}
}
