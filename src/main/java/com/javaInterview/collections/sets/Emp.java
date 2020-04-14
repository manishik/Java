package com.javaInterview.collections.sets;

import java.util.Objects;

public class Emp {

    private int id;
    private String name;
    private int deptId;

    public Emp(){

	}

    public Emp (int id, String name, int deptId){
    	this.id = id;
    	this.name = name;
    	this.deptId = deptId;
	}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String toString() {
        return "Emp Name = " + name + " Emp Id = " + id + " Emp DeptId = " + deptId;
    }

	/*@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Emp emp = (Emp) o;
		return id == emp.id &&
				deptId == emp.deptId &&
				name.equals(emp.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, deptId);
	}*/
}
