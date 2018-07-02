package com.profile.profile.domain.factories;

import com.profile.profile.application.models.CreateEmployeeModel;
import com.profile.profile.domain.model.EmployeeProfile;
import com.profile.profile.domain.model.Job;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProfileFactory {


    public EmployeeProfile buildEmployee(CreateEmployeeModel createEmployeeModel, Job job){

        EmployeeProfile employeeProfile = new EmployeeProfile();

        //employeeProfile.setId(createEmployeeModel.getId());
        employeeProfile.setName(createEmployeeModel.getName());
        employeeProfile.setSurname(createEmployeeModel.getSurname());
        employeeProfile.setGender(createEmployeeModel.getGender());
        employeeProfile.setAcademicLevel(createEmployeeModel.getAcademicLevel());
        employeeProfile.setNextOfKin(createEmployeeModel.getNextOfKin());
        employeeProfile.setLocation(createEmployeeModel.getLocation());
        employeeProfile.setDob(createEmployeeModel.getDob());
        employeeProfile.setTelephoneNumber(createEmployeeModel.getTelephoneNumber());
        employeeProfile.setAreaCode(createEmployeeModel.getAreaCode());
        employeeProfile.setJob(job);

        return employeeProfile;
    }
}
