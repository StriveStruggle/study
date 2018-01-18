package com.jack.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工
 *
 * @author geqiang
 * @date 2018/1/17
 **/
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;//下属

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates=new ArrayList<Employee>();
    }

    public void  add(Employee e){
        subordinates.add(e);
    }
    public void remove(Employee e){
        subordinates.remove(e);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
