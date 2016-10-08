package edu.hskl.projects.triangle.triangle;

public class TriangleDaniel extends Triangle {

	@Override
	public TriangleResult getTriangleResultForLenghts(final int... lengths) {
		if (lengths.length != 3) {
			return TriangleResult.UNKNOWN;
		}

		for (final int i : lengths) {
			if (i < 0) {
				return TriangleResult.UNKNOWN;
			}
		}
		return TriangleResult.UNKNOWN;
	}

}