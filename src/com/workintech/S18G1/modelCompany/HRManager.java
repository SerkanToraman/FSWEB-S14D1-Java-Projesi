package com.workintech.S18G1.modelCompany;

import com.workintech.S18G1.modelCompany.Employee;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;
    public HRManager(int id, String name, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }


    public void addEmployee(int index, JuniorDeveloper developer ){
        try {
            boolean isExist = false;
            for (JuniorDeveloper junior  : juniors){
                if(junior!=null && junior.getId()==developer.getId()){
                    isExist = true;
                    break;
                }
            }
        if(!isExist) {
            if (this.juniors[index] == null) {
                this.juniors[index] = developer;
            } else {
                System.out.println("Ilgili indexde JuniorDeveloper mevcuttur.Lütfen farklı indexe developer ekleyiniz");
            }
        }else{
            System.out.println(getId() + " idli kullanici bulunmaktadir");
        }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama  yapıldı" + index);
        }
    }
    public void addEmployee(int index, MidDeveloper developer ){
        try {
            boolean isExist = false;
            for (MidDeveloper mid  : mids){
                if(mid!=null && mid.getId()==developer.getId()){
                    isExist = true;
                    break;
                }
            }
            if(!isExist) {
                if (this.mids[index] == null) {
                    this.mids[index] = developer;
                } else {
                    System.out.println("Ilgili indexde MidDeveloper mevcuttur.Lütfen farklı indexe developer ekleyiniz");
                }
            }else{
                System.out.println(getId() + " idli kullanici bulunmaktadir");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama  yapıldı" + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer ){
        try {
            boolean isExist = false;
            for (SeniorDeveloper senior  : seniors){
                if(senior!=null && senior.getId()==developer.getId()){
                    isExist = true;
                    break;
                }
            }
            if(!isExist) {
                if (this.seniors[index] == null) {
                    this.seniors[index] = developer;
                } else {
                    System.out.println("Ilgili indexde SeniorDeveloper mevcuttur.Lütfen farklı indexe developer ekleyiniz");
                }
            }else{
                System.out.println(getId() + " idli kullanici bulunmaktadir");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama  yapıldı" + index);
        }
    }

    @Override
    public void work() {
        System.out.println(getName() +"is a HRManager" );
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " JuniorList: " + Arrays.toString(juniors) + " MidSeniorList: " + Arrays.toString(mids)+ " SeniorList: " + Arrays.toString(seniors);
    }
}
