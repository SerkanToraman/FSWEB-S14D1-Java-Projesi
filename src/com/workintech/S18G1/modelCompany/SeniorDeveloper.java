package com.workintech.S18G1.modelCompany;

import com.workintech.S18G1.modelCompany.Employee;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(int id, String name) {

        super(id, name);
    }
    @Override
    public void work() {
        setSalary(45000);
        System.out.println(getName() +"is a SeniorDeveloper" );
    }

    public void work(double salary) {
        setSalary(salary);
        System.out.println(getName() +" is a SeniorDeveloper" );
    }
}
