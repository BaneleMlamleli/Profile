package com.profile.profile.domain.factories;

import com.profile.profile.application.models.EmployeeProfileModel;
import com.profile.profile.application.models.JobModel;
import com.profile.profile.domain.model.EmployeeProfile;
import com.profile.profile.domain.model.Job;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProfileFactory {


    public EmployeeProfile buildEmployee(EmployeeProfileModel employeeProfileModel, Job job){

        EmployeeProfile employeeProfile = new EmployeeProfile();

        //employeeProfile.setId(employeeProfileModel.getId());
        employeeProfile.setName(employeeProfileModel.getName());
        employeeProfile.setSurname(employeeProfileModel.getSurname());
        employeeProfile.setGender(employeeProfileModel.getGender());
        employeeProfile.setAcademicLevel(employeeProfileModel.getAcademicLevel());
        employeeProfile.setNextOfKin(employeeProfileModel.getNextOfKin());
        employeeProfile.setLocation(employeeProfileModel.getLocation());
        employeeProfile.setDob(employeeProfileModel.getDob());
        employeeProfile.setTelephoneNumber(employeeProfileModel.getTelephoneNumber());
        employeeProfile.setAreaCode(employeeProfileModel.getAreaCode());
        employeeProfile.setJob(job);

        return employeeProfile;
    }

    public EmployeeProfileModel buildEmployeeProfileModel(EmployeeProfile employeeProfile, JobModel jobModel){
        EmployeeProfileModel employeeProfileModel = new EmployeeProfileModel();

        //employeeProfile.setId(employeeProfileModel.getId());
        employeeProfileModel.setName(employeeProfile.getName());
        employeeProfileModel.setSurname(employeeProfile.getSurname());
        employeeProfileModel.setGender(employeeProfile.getGender());
        employeeProfileModel.setAcademicLevel(employeeProfile.getAcademicLevel());
        employeeProfileModel.setNextOfKin(employeeProfile.getNextOfKin());
        employeeProfileModel.setLocation(employeeProfile.getLocation());
        employeeProfileModel.setDob(employeeProfile.getDob());
        employeeProfileModel.setTelephoneNumber(employeeProfile.getTelephoneNumber());
        employeeProfileModel.setAreaCode(employeeProfile.getAreaCode());
        employeeProfileModel.setJob(jobModel);

        return employeeProfileModel;
    }
}
