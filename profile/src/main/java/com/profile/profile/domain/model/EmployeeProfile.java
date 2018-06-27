package com.profile.profile.domain.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "EmployeeProfile")
@Data
public class EmployeeProfile {
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
    private long telephoneNumber;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;        //primary key that is auto generated
    @NotBlank
    private int areaCode;

    public EmployeeProfile() {

    }

    public EmployeeProfile(String name, String surname, String gender, String academicLevel,
                           String nextOfKin, String location, String dob, long telephoneNumber, long id, int areaCode) {
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

}
