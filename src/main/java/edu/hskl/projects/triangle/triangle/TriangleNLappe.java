package edu.hskl.projects.triangle.triangle;

public class TriangleNLappe extends Triangle {

	private int mA;
	private int mB;
	private int mC;
	
	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {
		mA = lengths[0];
		mB = lengths[1];
		mC = lengths[2];

		
		if(lengths.length > 3) return TriangleResult.UNKNOWN;
		if(mA <= 0 || mB <= 0 || mC <= 0) return TriangleResult.UNKNOWN;
		if((mA != mB) && (mA!= mC) && (mB != mC)) return TriangleResult.TRIANGLE_NOT_EQUAL;
		if(((mA == mB) && (mA!= mC)) ||  ((mA == mC) && (mA!= mB)) ) return TriangleResult.TRIANGLE_ISOSCELES; 
		if((mA == mB) && (mA == mC)) return TriangleResult.TRIANGLE_EQUILATERAL;
		
		return TriangleResult.UNKNOWN;

	}
}
