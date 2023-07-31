package com.workintech.S18G1.modelCompany;

import com.workintech.S18G1.modelCompany.Employee;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    };
    @Override
    public void work() {
        setSalary(20000);
        System.out.println(getName() +"is a JuniorDeveloper" );
    }


    public void work(double salary) {
        setSalary(salary);
        System.out.println(getName() +" is a JuniorDeveloper" );
    }
}
