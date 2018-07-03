package com.profile.profile.application.services;

import com.profile.profile.application.models.EmployeeProfileModel;
import com.profile.profile.domain.model.EmployeeProfile;
import com.profile.profile.domain.model.Job;

import java.util.List;

public interface EmployeeProfileService {
    void createEmployeeProfile(EmployeeProfileModel employeeProfileModel);
    void readIndividualEmployeeProfile(String name);
    List<EmployeeProfile> readEmployeeProfiles();
    void updateEmployeeProfile(EmployeeProfileModel employeeProfileModel);
    void deleteEmployeeProfile(long id);
    List<Job> readAllJobs();
}
