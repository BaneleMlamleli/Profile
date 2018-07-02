package com.profile.profile.application.services.Impl;

import com.profile.profile.application.models.CreateEmployeeModel;
import com.profile.profile.application.services.EmployeeService;
import com.profile.profile.domain.factories.EmployeeProfileFactory;
import com.profile.profile.domain.factories.JobProfileFactory;
import com.profile.profile.domain.model.EmployeeProfile;
import com.profile.profile.domain.model.Job;
import com.profile.profile.domain.repository.EmployeeProfileRepository;
import com.profile.profile.domain.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeProfileRepository employeeProfileRepository;
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private EmployeeProfileFactory employeeProfileFactory;

    @Autowired
    private JobProfileFactory jobProfileFactory;

    @Override
    public void createEmployeeProfile(CreateEmployeeModel createEmployeeModel) {
        Job job = this.jobProfileFactory.buildJob(createEmployeeModel.getJob());
        Job savedJob = jobRepository.save(job);
        EmployeeProfile employeeProfile = this.employeeProfileFactory.buildEmployee(createEmployeeModel, savedJob);
        this.employeeProfileRepository.save(employeeProfile);
    }

    public List<EmployeeProfile> readEmployeeProfiles(){
        //An arraylist that will store all the employee profile details
        List<EmployeeProfile> employeeProfiles = new ArrayList<>();
        employeeProfileRepository.findAll();
//        .foreach(employeeProfiles::add) {
//            return employeeProfiles;
//        }
        return employeeProfiles;
    }

}