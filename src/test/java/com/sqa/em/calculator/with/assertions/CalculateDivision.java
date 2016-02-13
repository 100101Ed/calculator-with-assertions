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
	// @Parameters
	// public static Object[][] getData() {
	// Object[][] data = { { "Test 1", 12.00, 6.00, 2.00 }, { "Test 2", 14.00,
	// 2.00, 7.00 },
	// { "Test 3", 100.00, 1.00, 100.00 }, { "Test 4", 4.00, 6.00, 0.67 }, {
	// "Test 5", 45.00, 5.00, 9.00 },
	// { "Test 6", 5.00, 6.00, 100.00 } };
	// return data;
	// }
	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { "Test 1", 12, 6, 2 }, { "Test 2", 14, 2, 7 }, { "Test 3", 100.00, 1.00, 100.00 },
				{ "Test 4", 4, 6, 0.67 }, { "Test 5", 45, 5, 9 }, { "Test 6", 5.00, 6.00, 100.00 } };
		return data;
	}

	String label;

	double num1;

	double num2;

	double expected;

	// This gets call automatically and gets the data Object[]
	public CalculateDivision(String label, double num1, double num2, double expected) {
		this.label = label;
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}

	@Test
	public void divideNumbersTest() {
		System.out.println("\n" + this.label);
		IdentifyObject.display2DInfo(getData());
		double total = this.num1 / this.num2;
		System.out.print("Tota = " + total);
		Assert.assertEquals(this.expected, total, 1);// By entering 1 you are
														// asking that the
														// results could be + or
														// - 1
		System.out.println("\n Passed ");
	}
}
