package edu.hskl.projects.triangle.triangle;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCollection {
	public static void main(final String[] args) throws Exception {
		final Triangle[] triangles = { new TriangleCBloching(), new TriangleDaniel(), new TriangleNLappe(),
				new TriangleNWerner(), new TriangleOKopp(), new TriangleTHemmer(), new TriangleTbach() };
		final Object[] tests = { new TriangleCBlochingTest(), new TriangleDanielTest(), new TriangleNLappeTest(),
				new TriangleNWernerTest(), new TriangleOKoppTest(), new TriangleTHemmerTest(),
				new TriangleTbachTest() };
		System.out.println("triangles: " + triangles.length);
		System.out.println("tests: " + tests.length);
		for (final Triangle triangle : triangles) {
			System.out.println("Triangle: " + triangle.getClass());
			for (final Object testObject : tests) {
				System.out.println("Test: " + testObject.getClass());
				final Field triangleField = testObject.getClass().getDeclaredField("triangle");
				triangleField.setAccessible(true);
				triangleField.set(testObject, triangle);
				final Method[] methods = testObject.getClass().getMethods();
				for (final Method method : methods) {
					if (!method.getName().startsWith("test")) {
						continue;
					}
					try {
						method.invoke(testObject);
					} catch (final Exception e) {
						System.out.println("method failed: " + e.getCause());
					}
				}
			}
		}
	}
}
