package com.test.common.models;

import lombok.Data;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class Employee {

    private int empId;
    private String empName;
    private int salary;

    private String dept;

    private int age;

    public Employee(int empId, String empName, int salary, int age, String dept){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.age = age;
        this.dept = dept;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
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
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof Employee)) return false;
        if (obj == this)
            return true;
        return this.empId == ((Employee) obj).getEmpId();
    }

    @Override
    public int hashCode(){
        return empId;
    }
}
