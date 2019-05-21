package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String department;
    private String name;
    private String planet;
    private String phonenumber;
    private Long cmnd;
    private String email;
    private String birthday;
    private String manhanvien;
    private String address;



    public Employees(){
    }

    public Employees(String department, String name, String planet, String phonenumber, Long cmnd, String email, String birthday, String manhanvien, String address) {
        this.department = department;
        this.name = name;
        this.planet = planet;
        this.phonenumber = phonenumber;
        this.cmnd = cmnd;
        this.email = email;
        this.birthday = birthday;
        this.manhanvien = manhanvien;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Long getCmnd() {
        return cmnd;
    }

    public void setCmnd(Long cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}