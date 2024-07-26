package com.test.common.models;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class Manager {

    private int empId;
    private String empName;
    private int salary;

    public Manager(int empId, String empName, int salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
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

    public String toString(){
        return empId + " " + empName + " " + salary;
    }
}
