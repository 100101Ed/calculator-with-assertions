/**
 * File Name: Calculator.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 11, 2016
 */
package com.sqa.em.calculator.with.assertions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sqa.em.util.helper.IdentifyObject;

/**
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
@RunWith(Parameterized.class)
public class CalculatePower {

	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { "Test 1", 1, 2, 1 }, { "Test 2", 2, 2, 4 }, { "Test 3", 3, 2, 9 }, { "Test 4", 4, 2, 16 },
				{ "Test 5", 5, 2, 25 }, { "Test 6", 6, 6, 100 } };
		return data;
	}

	String label;

	int num1;

	int num2;

	int expected;

	public CalculatePower(String label, int num1, int num2, int expected) {
		this.label = label;
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}

	@Test
	public void calculatePowerTest() {
		System.out.println(this.label);
		IdentifyObject.display2DInfo(getData());
		int total = (int) Math.pow(this.num1, this.num2);
		Assert.assertEquals(this.expected, total);
		System.out.println("Passed " + total);
	}
}
