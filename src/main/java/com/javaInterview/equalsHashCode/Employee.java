package com.javaInterview.equalsHashCode;

public class Employee {

	private String name;
	private int ssn;

	public Employee(int ssn) {
		this.ssn = ssn;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee employee = (Employee) obj;
		return ssn == employee.ssn;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(ssn);
	}
}
