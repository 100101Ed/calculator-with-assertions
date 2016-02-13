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
public class CalculateTotal {

	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { "Test 1", 12, 6, 18 }, { "Test 2", 14, 2, 16 }, { "Test 3", 100, 1, 101 },
				{ "Test 4", 4, 6, 10 }, { "Test 5", 45, 5, 50 }, { "Test 6", 5, 6, 100 } };
		return data;
	}

	String label;

	int num1;

	int num2;

	int expected;

	public CalculateTotal(String label, int num1, int num2, int expected) {
		this.label = label;
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}

	@Test
	public void divideNumbersTest() {
		System.out.println(this.label);
		IdentifyObject.display2DInfo(getData());
		int total = this.num1 + this.num2;
		System.out.print("Tota = " + total);
		Assert.assertEquals(this.expected, total);
		System.out.println(" Passed ");
	}
}
