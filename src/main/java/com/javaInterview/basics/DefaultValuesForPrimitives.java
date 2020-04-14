package com.javaInterview.basics;

public class DefaultValuesForPrimitives {
	byte b; short s; int i; long l;
	float f; double d;
	boolean bool;
	char c; String string;

	public static void main(String[] args) {
		DefaultValuesForPrimitives t1 = new DefaultValuesForPrimitives();
		t1.method();
	}

	void method() {
		System.out.println("Default value for byte : " + b);
		System.out.println("Default value for short : " + s);
		System.out.println("Default value for int : " + i);
		System.out.println("Default value for long : " + l);

		System.out.println("Default value for float : " + f);
		System.out.println("Default value for double : " + d);

		System.out.println("Default value for boolean : " + bool);
		System.out.println("Default value for char : " + c);
		System.out.println("Default value for String : " + string);

	}
}
