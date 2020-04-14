package com.scjp.chap9;

import java.text.*;
import java.util.*;

class CodeWalkEight {
	public static void main(String[] args) {
		DateFormat df = DateFormat
				.getDateInstance(DateFormat.MEDIUM, Locale.US);
		Date d = new Date(0L);
		String date = "Java 3, 2005";
		try {
			d = df.parse(date);
		} catch (ParseException e) {
		}
		System.out.println(d.getTime());
	}
}
