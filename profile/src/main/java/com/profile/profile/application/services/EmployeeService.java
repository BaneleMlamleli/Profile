package com.profile.profile.application.services;

import com.profile.profile.application.models.CreateEmployeeModel;
import com.profile.profile.domain.model.EmployeeProfile;

import java.util.List;

public interface EmployeeService {
    void createEmployeeProfile(CreateEmployeeModel createEmployeeModel);
    void readIndividualEmployeeProfile(String name);
    List<EmployeeProfile> readEmployeeProfiles();
    void updateEmployeeProfile(CreateEmployeeModel createEmployeeModel);
    void deleteEmployeeProfile(long id);
}
