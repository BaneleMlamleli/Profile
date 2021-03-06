package com.profile.profile.domain.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employeeprofile")
@Data
public class EmployeeProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;        //primary key that is auto generated
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    private String gender;
    @NotBlank
    private String academicLevel;    //e.g., Grade 12, First year, Diploma, BSc Degree
    @NotBlank
    private String nextOfKin;
    @NotBlank
    private String location;
    @NotBlank
    private String dob;    // date of birth
    @NotBlank
    private String telephoneNumber;

    private int areaCode;

    //
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "employeeProfile", cascade = CascadeType.ALL)
    private Job job;

    public EmployeeProfile() {

    }

    public EmployeeProfile(String name, String surname, String gender, String academicLevel,
                           String nextOfKin, String location, String dob, String telephoneNumber, long id, int areaCode) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.academicLevel = academicLevel;
        this.nextOfKin = nextOfKin;
        this.location = location;
        this.dob = dob;
        this.telephoneNumber = telephoneNumber;
        this.id = id;
        this.areaCode = areaCode;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    @Override
    public String toString() {
        return "EmployeeProfile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", academicLevel='" + academicLevel + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                ", location='" + location + '\'' +
                ", dob='" + dob + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", areaCode=" + areaCode +
                ", job=" + job +
                '}';
    }
}
