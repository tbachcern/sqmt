package edu.hskl.projects.triangle.triangle;

public class TriangleTHemmer extends Triangle{

	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {
		
		if (lengths.length != 3) {
			
			return TriangleResult.UNKNOWN;
			
		}
			
		for (int n : lengths) {
			
			if (n<=0) {
				return TriangleResult.UNKNOWN;
			}
		}
		
		if (lengths[0] == lengths[1] && lengths[1] == lengths[2]) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}
		
		if (lengths[0] == lengths[1] || lengths[1] == lengths[2] || lengths[0] == lengths[2]) {
			return TriangleResult.TRIANGLE_ISOSCELES;
	
		} else {
			return TriangleResult.TRIANGLE_NOT_EQUAL;
			
		}
	}

}
