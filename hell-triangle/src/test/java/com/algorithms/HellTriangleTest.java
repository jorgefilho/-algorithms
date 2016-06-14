package com.algorithms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.algorithms.exception.InvalidListException;
@RunWith(JUnit4.class)
public class HellTriangleTest {


	private HellTriangle hellTriangle = new HellTriangle();
	
	@Test(expected=InvalidListException.class)
	public void maximumTotal_whenParameterIsNull_shouldExpectedInvalidListException() {
		hellTriangle.maximumTotal(null);
	}
}
