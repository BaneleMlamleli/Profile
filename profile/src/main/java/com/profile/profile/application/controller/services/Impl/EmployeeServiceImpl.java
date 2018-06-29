package com.profile.profile.application.controller.services.Impl;

import com.profile.profile.application.controller.model.EmployeeModel;
import com.profile.profile.application.controller.services.EmployeeService;
import com.profile.profile.domain.factories.EmployeeProfileFactory;
import com.profile.profile.domain.model.EmployeeProfile;
import com.profile.profile.domain.repository.EmployeeProfileRepository;
import com.profile.profile.domain.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeProfileRepository employeeProfileRepository;
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private EmployeeProfileFactory employeeProfileFactory;

    @Override
    public void createEmployeeProfile(EmployeeModel employeeModel) {
        EmployeeProfile employeeProfile = this.employeeProfileFactory.buildEmployee(employeeModel);
        this.employeeProfileRepository.save(employeeProfile);
    }
}