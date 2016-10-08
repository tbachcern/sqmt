package edu.hskl.projects.triangle.triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TriangleTHemmerTest {

	private Triangle triangle;
	
	@Before
	public void setUp() throws Exception {
		triangle = new TriangleTHemmer();
	}
	

	@Test
	public void testGetTriangleResultForLenghtsEquileteral() throws Exception {
		
		int[] input = {10, 10, 10};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquileteral1() throws Exception {
		
		int[] input = {11, 11, 11};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquileteral2() throws Exception {
		
		int[] input = {12, 12, 12};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquileteral3() throws Exception {
		
		int[] input = {8, 10, 12};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquileteral4() throws Exception {
		
		int[] input = {8, 10,};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquileteral5() throws Exception {
		
		int[] input = {8, 10, 12, 13};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquileteral6() throws Exception {
		
		int[] input = {8, 12, 12};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquileteral7() throws Exception {
		
		int[] input = {0, 0, 0};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	

}
