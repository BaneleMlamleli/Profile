package com.profile.profile.domain.factories;

import com.profile.profile.application.controller.model.EmployeeModel;
import com.profile.profile.domain.model.EmployeeProfile;
import com.profile.profile.domain.model.Job;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProfileFactory {


    public EmployeeProfile buildEmployee(EmployeeModel employeeModel){

        EmployeeProfile employeeProfile = new EmployeeProfile();

        employeeProfile.setId(employeeModel.getId());
        employeeProfile.setName(employeeModel.getName());
        employeeProfile.setSurname(employeeModel.getSurname());
        employeeProfile.setGender(employeeModel.getGender());
        employeeProfile.setAcademicLevel(employeeModel.getAcademicLevel());
        employeeProfile.setNextOfKin(employeeModel.getNextOfKin());
        employeeProfile.setLocation(employeeModel.getLocation());
        employeeProfile.setDob(employeeModel.getDob());
        employeeProfile.setTelephoneNumber(employeeModel.getTelephoneNumber());
        employeeProfile.setAreaCode(employeeModel.getAreaCode());

        return employeeProfile;
    }
}
