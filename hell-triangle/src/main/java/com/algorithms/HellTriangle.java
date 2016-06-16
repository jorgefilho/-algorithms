package com.algorithms;

import java.time.Duration;
import java.time.Instant;

import com.algorithms.exception.EmptyListException;
import com.algorithms.exception.InvalidListException;

public class HellTriangle {

	public int maximumTotal(final int[][] inputList) {
		Instant startTime = Instant.now();
		int maximum = 0;

		if (inputList == null || inputList.length == 0) {
			throw new EmptyListException("Empty list.");
		} else if (inputList.length > 0) {
			int item = 0;
			try {

				for (int j = 0; j < inputList.length; j++) {
					if (j == 0) {
						maximum = inputList[j][item];
					} else {
						maximum += Math.max(inputList[j][item], inputList[j][item + 1]);
						item++;
					}
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new InvalidListException("Incorrect order items.");
			}
		}
		Instant endTime = Instant.now();
		System.out.println(Duration.between(startTime, endTime));
		return maximum;
	}
}