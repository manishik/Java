package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Java8OTest {
    public static void main(String[] args) {
        List<Cust> custList = new ArrayList<Cust>();
        Cust cust1 = new Cust();
        cust1.setAge(1);
        cust1.setFname("Manish");
        cust1.setLname("Keshav");

        Cust cust2 = new Cust();
        cust2.setAge(2);
        cust2.setFname("Sam");
        cust2.setLname("Manish");

        Cust cust3 = new Cust();
        cust3.setAge(3);
        cust3.setFname("3name");
        cust3.setLname("3lname");

        custList.add(cust1);
        custList.add(cust2);
        custList.add(cust3);

        List<Cust> custList1 = new ArrayList<Cust>();

        Optional<Cust> custOptional;

        if (custList.size() >= 1) {
            //System.out.println(Optional.of(custList.get(0).getFname()));
            custOptional = Optional.of(custList.get(0));
            custList1.add(custList.get(0));
        }

        for(Cust cust: custList1){
            System.out.println(cust.getFname());
        }

        ///////////////////////////////////////////////////////////////////////////////////
        List<Customer> customerList = new ArrayList<Customer>();
        Customer customer1 = new Customer();
        customer1.setFname("Manish");
        customer1.setLname("Keshav");
        customer1.setAddress("Mysore");

        Customer customer2 = new Customer();
        customer2.setFname("MMMM");
        customer2.setLname("KKKK");
        customer2.setAddress("MyyyyyyySoooore");

        customerList.add(customer1);
        customerList.add(customer2);




    }
}

class Cust {
    private int age;
    private String fname;
    private String lname;


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

class Customer {

    private String fname;
    private String lname;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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