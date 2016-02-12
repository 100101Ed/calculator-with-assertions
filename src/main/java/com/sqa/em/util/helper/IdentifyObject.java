/**
 * File Name: IdentifyObject.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016 Create a helper class to add to your framework which
 * gives information on any class you create. The method signatures are below.
 * Try to implement one at a time. Create a test case for each method.
 */
package com.sqa.em.util.helper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * IdentifyObject //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class IdentifyObject {

	// Uses Reflection API
	public static void display2DInfo(Object[][] objects) {
		System.out.println(get2DInfo(objects));
	}

	// Use this method to get info about the class being passed
	// Uses Reflection API
	public static void displayInfo(Object obj) {
		System.out.println("Object Type: " + obj.getClass().getSimpleName());
		System.out.print("\tFields are: " + Arrays.toString(getFieldNames(obj)) + "\n");
		System.out.print("\tMethods are: " + Arrays.toString(getMethodNames(obj)) + "\n");
	}

	// Uses Reflection API
	public static void displayInfo(Object obj1, Object obj2, Object... objN) {
	}

	//////// 2DMatrix
	public static void displayInfo(Object[] obj) {
		for (Object object : obj) {
			displayInfo(object);
		}
	}

	//////// 2DMatrix
	public static String get2DInfo(Object[][] objects) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("Display 2D Matrix\n\n");
		for (int row = 0; row < objects.length; row++) {
			for (int colum = 0; colum < objects[row].length; colum++) {
				sBuilder.append("\t" + objects[row][colum]);
			}
			sBuilder.append("\n");
		}
		return sBuilder.toString();
	}

	// Uses Reflection API
	public static String[] getFieldNames(Object obj) {
		String[] names;
		ArrayList<String> fieldNames = new ArrayList<String>();
		Field[] fields = obj.getClass().getFields();
		for (Field field : fields) {
			fieldNames.add(field.getName());
		}
		names = new String[fieldNames.size()];
		fieldNames.toArray(names);
		return names;
	}

	// Uses Reflection API
	public static String getInfo(Object obj) {
		StringBuilder sb = new StringBuilder();
		sb.append("Object Type: ");
		sb.append(obj.getClass().getSimpleName());
		sb.append("\tFields are: ");
		sb.append(Arrays.toString(getFieldNames(obj)));
		sb.append("\n");
		sb.append("\tMethods are: ");
		sb.append(Arrays.toString(getMethodNames(obj)));
		sb.append("\n");
		return sb.toString();
	}

	// Uses Reflection API
	public static String[] getMethodNames(Object obj) {
		String[] names;
		ArrayList<String> methodNames = new ArrayList<String>();
		Method[] methods = obj.getClass().getMethods();
		for (Method method : methods) {
			methodNames.add(method.getName());
		}
		names = new String[methodNames.size()];
		methodNames.toArray(names);
		return names;
	}
	/*
	 * // Methods which call Object methods getClass().getSimpleName(),
	 * toString(), // and in a readable form both to display and get String
	 * value of Object public static void display2Array(Object[][] objects) {
	 * System.out.println(get2DInfo(objects)); } public static void
	 * displayInfo(Object obj) { System.out.println("This object is named: " +
	 * obj.getClass().getName()); System.out.println("\tThe object is of type: "
	 * + obj.getClass().getSimpleName()); System.out.println(
	 * "\tThe number of modifiers are: " + obj.getClass().getModifiers());
	 * System.out.println("\tThe fields are: " +
	 * Arrays.deepToString(obj.getClass().getFields())); System.out.println(
	 * "\tThe methods are: " +
	 * Arrays.deepToString(obj.getClass().getDeclaredMethods())); } public
	 * static void displayInfo(Object obj1, Object obj2, Object... objN) {
	 * displayInfo(obj1); displayInfo(obj2); for (Object object : objN) {
	 * displayInfo(object); } } public static void displayInfo(Object[] obj1) {
	 * for (Object object : obj1) { displayInfo(object); } } public static
	 * String get2DInfo(Object[][] objects) { StringBuilder builder = new
	 * StringBuilder(); for (Object[] objects2 : objects) { for (Object object :
	 * objects2) { builder.append("\""); builder.append(object.toString());
	 * builder.append("\"\t"); } builder.append("\n"); } return
	 * builder.toString(); } public static String getInfo(Object obj) {
	 * StringBuilder builder = new StringBuilder(); builder.append(
	 * "[ This object is named = "); builder.append(obj.getClass().getName());
	 * builder.append(", The object is of type = ");
	 * builder.append(obj.getClass().getSimpleName()); builder.append(
	 * ", tThe number of modifiers are = ");
	 * builder.append(obj.getClass().getModifiers()); builder.append(
	 * ", tThe fields are = ");
	 * builder.append(Arrays.deepToString(obj.getClass().getFields()));
	 * builder.append(", The methods are = ");
	 * builder.append(Arrays.deepToString(obj.getClass().getDeclaredMethods()));
	 * builder.append(" ]"); return builder.toString(); }
	 */
}
