package com.profile.profile.application.services;

import com.profile.profile.application.models.EmployeeModel;
import com.profile.profile.domain.model.EmployeeProfile;

import java.util.List;

public interface EmployeeService {
    void createEmployeeProfile(EmployeeModel employeeModel);
    void readIndividualEmployeeProfile(String name);
    List<EmployeeProfile> readEmployeeProfiles();
    void updateEmployeeProfile(EmployeeModel employeeModel);
    void deleteEmployeeProfile(long id);
}
