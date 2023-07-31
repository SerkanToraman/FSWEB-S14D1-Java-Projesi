package com.workintech.S18G1.modelCompany;

import com.workintech.S18G1.modelCompany.Employee;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(32000);
        System.out.println(getName() +"is a MidDeveloper" );
    }

    public void work(double salary){
        setSalary(salary);
        System.out.println(getName() +" is a MidDeveloper" );
    }
}
