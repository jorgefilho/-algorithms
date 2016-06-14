package com.algorithms;

import java.time.Duration;
import java.time.Instant;

import com.algorithms.exception.InvalidListException;

public class HellTriangle {

	public int maximumTotal(final int[][] inputList) {
		Instant startTime = Instant.now();
		int maximum = 0;

		if (inputList == null) {
			throw new InvalidListException("Empty list!");
		} else if (inputList.length > 0) {
			int lenght = inputList.length;
			int i = 0;
			int start = 0;
			while (i < lenght) {
				if (i == 0) {
					maximum = inputList[i][start];
				} else {
					maximum += Math.max(inputList[i][start], inputList[i][start + 1]);
					start++;
				}
				i++;
			}
		}
		Instant endTime = Instant.now();
		System.out.println(Duration.between(startTime, endTime));
		return maximum;
	}

	public static void main(String[] args) {
		// [[6],[3,5],[9,7,1],[4,6,8,4]]
		final int[][] inputList = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };
		
		
		final HellTriangle hellTriangle = new HellTriangle();
		
		System.out.println(hellTriangle.maximumTotal(inputList));
		;
	}

}
