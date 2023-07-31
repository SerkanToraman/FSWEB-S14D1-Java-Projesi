package com.workintech.S18G1.main;

import com.workintech.S18G1.modelCompany.HRManager;
import com.workintech.S18G1.modelCompany.JuniorDeveloper;
import com.workintech.S18G1.modelCompany.MidDeveloper;
import com.workintech.S18G1.modelCompany.SeniorDeveloper;

public class MainCompany {

    public static void main(String[] args) {
        JuniorDeveloper junior1 = new JuniorDeveloper(1, "Serkan");
        junior1.work();
        junior1.setSalary(25000);
        System.out.println(junior1.getSalary());
        JuniorDeveloper junior2 = new JuniorDeveloper(2,"Aytac");
        junior2.work();
        JuniorDeveloper junior3 = new JuniorDeveloper(3,"Ihsan");
        junior3.work();
        SeniorDeveloper senior1 = new SeniorDeveloper(4,"Ayca");

        JuniorDeveloper[] juniorsList = new JuniorDeveloper[4];
        MidDeveloper[] midsList = new MidDeveloper[3];
        SeniorDeveloper[] seniors = new SeniorDeveloper[2];


        HRManager HRManager = new HRManager(3,"Mine",juniorsList,midsList,seniors);
        HRManager.addEmployee(0, junior3);
        HRManager.addEmployee(1, junior3);
        System.out.println(HRManager);
        HRManager.addEmployee(0, senior1);
        System.out.println(HRManager);


    }
}
