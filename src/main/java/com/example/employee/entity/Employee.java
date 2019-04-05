package com.example.employee.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private Long companyId;
    private Double salary;

    public Employee() {
    }

    public Employee(Long id, String name, Integer age, String gender, Long companyId, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
