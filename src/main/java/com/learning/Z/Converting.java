package com.learning.Z;

import java.util.ArrayList;
import java.util.List;

public class Converting {

	public static void main(String[] args) {

		List<DTO> dTOList = new ArrayList<DTO>();

		DTO dto = new DTO();
		dto.setAge(1);
		dto.setName("A");
		DTO dto2 = new DTO();
		dto2.setAge(2);
		dto2.setName("B");
		DTO dto3 = new DTO();
		dto3.setAge(3);
		dto3.setName("C");
		DTO dto4 = new DTO();
		dto4.setAge(4);
		dto4.setName("D");

		dTOList.add(dto);
		// dTOList.add(dto2);
		dTOList.add(dto3);
		// dTOList.add(dto4);

		// Create Domain list size of DTO list
		List<Domain> domainList = new ArrayList<Domain>(dTOList.size());

		// DTO to Domain
		if (!dTOList.isEmpty()) {
			for (DTO dtoo : dTOList) {
				Domain domain = new Domain();
				domain.setAge(dtoo.getAge());
				domain.setName(dtoo.getName());
				domainList.add(domain);
			}
		}

		System.out.println("domainList size = " + domainList.size());

		for (Domain domain : domainList) {
			System.out.println("Name = " + domain.getName() + " " + " Age = " + domain.getAge());
		}

	}

}

class Domain {
	private int age;
	private String Name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}

class DTO {
	private int age;
	private String Name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}