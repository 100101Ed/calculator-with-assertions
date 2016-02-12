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
public class CalculateDivision {

	// @Parameters //unable to handle floats points
	// public static Object[][] getData() {
	// Object[][] data = { { "Test 1", 5, 6, 0.83 }, { "Test 2", 50, 16, 3.13 },
	// { "Test 3", 35, 46, 0.76 },
	// { "Test 4", 4, 6, 0.67 }, { "Test 5", 45, 5, 9 }, { "Test 6", 5, 6, 100 }
	// };
	// return data;
	// }
	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { "Test 1", 12, 6, 2 }, { "Test 2", 14, 2, 7 }, { "Test 3", 100, 1, 100 },
				{ "Test 4", 4, 6, 0.67 }, { "Test 5", 45, 5, 9 }, { "Test 6", 5, 6, 100 } };
		return data;
	}

	String label;

	int num1;

	int num2;

	int expected;

	public CalculateDivision(String label, int num1, int num2, int expected) {
		this.label = label;
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}

	@Test
	public void divideNumbersTest() {
		System.out.println(this.label);
		IdentifyObject.display2DInfo(getData());
		int total = this.num1 / this.num2;
		System.out.print("Tota = " + total);
		Assert.assertEquals(this.expected, total);
		System.out.println(" Passed ");
	}
}
