package edu.hskl.projects.triangle.triangle;


public class TriangleCBloching extends Triangle {

	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {
		
		if(checkLength(lengths) == true){
			
			int a = lengths[0];
			int b = lengths[1];
			int c = lengths[2];
			
			if(checkIsTriangle(a, b, c) == true){
				if(isNotEqualOrLessZero(a, b, c) == true){
					if(checkEQUILATERAL(a, b, c) == true){
						return TriangleResult.TRIANGLE_EQUILATERAL;
					}else{
						if(checkISOSCELES(a, b, c) == true) {
							return TriangleResult.TRIANGLE_ISOSCELES;
						}else{
							return TriangleResult.TRIANGLE_NOT_EQUAL;
						}
					}
				}else{
					return TriangleResult.UNKNOWN;
				}
			}else{
				return TriangleResult.UNKNOWN;
			}
		}
		return TriangleResult.UNKNOWN;
	}

	private boolean checkLength(int... l) {
		if (l.length == 3) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkIsTriangle(int ta, int tb, int tc){
		if(ta + tb > tc && ta+tc > tb && tb+tc > ta){
			return true;
		}else{
			return false;
		}
	}
	
	protected boolean isNotEqualOrLessZero(int ta, int tb, int tc){
		if(ta <= 0 || tb <= 0 || tc <= 0){
			return false;
		}
		return true;
	}


	private boolean checkEQUILATERAL(int ta, int tb, int tc) {
		if(ta == tb && tb == tc){
			return true;
		}else{
			return false;
		}
	}

	private boolean checkISOSCELES(int ta, int tb, int tc) {
		if(ta == tb || ta == tc || tb == tc){
			return true;
		}else{
			return false;
		}
	}
	

}
