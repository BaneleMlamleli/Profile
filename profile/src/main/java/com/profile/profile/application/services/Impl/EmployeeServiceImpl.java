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
import java.util.Optional;

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
    //creating employee profile
    //This maps to a POST end-point
    public void createEmployeeProfile(CreateEmployeeModel createEmployeeModel) {
        Job job = this.jobProfileFactory.buildJob(createEmployeeModel.getJob());
        Job savedJob = jobRepository.save(job);
        EmployeeProfile employeeProfile = this.employeeProfileFactory.buildEmployee(createEmployeeModel, savedJob);
        this.employeeProfileRepository.save(employeeProfile);
    }

    @Override
    //retrieving all the employee profiles
    //This maps to a GET end-point
    public List<EmployeeProfile> readEmployeeProfiles(){
        //An arraylist that will store all the employee profile details
        List<EmployeeProfile> employeeProfiles = new ArrayList<>();
        Iterable<EmployeeProfile> allEmployees = employeeProfileRepository.findAll();
        allEmployees.forEach(employeeProfiles::add);    //populating the employeeProfile arraylist
        return employeeProfiles;
    }

    //Create a code to read the job as well!!!

    @Override
    //retrieving individual employee profile
    //This also maps to a GET end-point but with a specific employee profile
    public void readIndividualEmployeeProfile(String name){
        //employeeProfileRepository.findById(id);
        employeeProfileRepository.findAllByNameEquals(name);
    }

    @Override
    //updating
    public void updateEmployeeProfile(CreateEmployeeModel createEmployeeModel){
        Job job = this.jobProfileFactory.buildJob(createEmployeeModel.getJob());
        Job savedJob = jobRepository.save(job);
        EmployeeProfile employeeProfile = this.employeeProfileFactory.buildEmployee(createEmployeeModel, savedJob);
        this.employeeProfileRepository.save(employeeProfile);
    }

    @Override
    //deleting an employee profile
    public void deleteEmployeeProfile(long id){
        employeeProfileRepository.deleteById(id);
    }
}