package com.test.common.models;

public class Employee3 {

    private int empId;
    private String empName;
    private String dob;
    private int age;

    public Employee3(int empId, String empName, int age, String dob) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.dob = dob;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                '}';
    }
}
