package com.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.algorithms.exception.EmptyListException;
import com.algorithms.exception.InvalidListException;
@RunWith(JUnit4.class)
public class HellTriangleTest {

	private static final int EXPECTED_VALUE = 26;
	private HellTriangle hellTriangle = new HellTriangle();
	
	@Test(expected = EmptyListException.class)
	public void maximumTotal_whenParameterIsNull_shouldExpectedEmptyListException() {
		hellTriangle.maximumTotal(null);
	}
	
	@Test(expected = EmptyListException.class)
	public void maximumTotal_whenParameterIsEmpty_shouldExpectedEmptyListException() {
		final int[][] emptyList = {};
		hellTriangle.maximumTotal(emptyList);
	}

	@Test(expected = InvalidListException.class)
	public void maximumTotal_whenListOfItensIsIncorrect_shouldExpectedInvalidListException() {
		final int[][] inputList = { { 3, 5 }, { 6 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };
		hellTriangle.maximumTotal(inputList);
	}

	public void maximumTotal_whenListOfItensIsValid_shouldReturnValidValue() {
		final int[][] inputList = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };
		final int maximumTotal = hellTriangle.maximumTotal(inputList);
		assertNotNull(maximumTotal);
		assertEquals(EXPECTED_VALUE, maximumTotal);
	}
}
