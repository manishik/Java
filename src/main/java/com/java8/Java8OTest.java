package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Java8OTest {
    public static void main(String[] args) {
        List<Cust> custList = new ArrayList<Cust>();
        Cust cust = new Cust();
        cust.setAge(43);
        cust.setFname("Manish");
        cust.setLname("Keshav");

        Cust cust1 = new Cust();
        cust1.setAge(12);
        cust1.setFname("Sam");
        cust1.setLname("Manish");

        Cust cust2 = new Cust();
        cust2.setAge(5);
        cust2.setFname("Aadhya");
        cust2.setLname("Manish");

        custList.add(cust);
        custList.add(cust1);
        custList.add(cust2);
        custList.add(null);
        custList.add(new Cust(38, "Nandini", "B"));

        Optional<Cust> custOptional = Optional.empty();

        if (custList.size() >= 1) {
            custOptional = Optional.ofNullable(custList.get(4)); // 3 object is null in the list
        }

        if(custOptional.isPresent()) {
            Cust customer = custOptional.get(); // Get the Cust Object from custOptional
            System.out.println("Age = " + customer.getAge());
            System.out.println("Name = " + customer.getFname());
        }
    }
}

class Cust {
    private int age;
    private String fname;
    private String lname;

    public Cust() {}

    public Cust(int age, String fname, String lname) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
