package com.profile.profile.application.services.Impl;

import com.profile.profile.application.models.EmployeeProfileModel;
import com.profile.profile.application.services.EmployeeProfileService;
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
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

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
    public void createEmployeeProfile(EmployeeProfileModel employeeProfileModel) {
        Job job = this.jobProfileFactory.buildJob(employeeProfileModel.getJob());
        Job savedJob = jobRepository.save(job);
        EmployeeProfile employeeProfile = this.employeeProfileFactory.buildEmployee(employeeProfileModel, savedJob);
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
    //retrieving all the jobs
    //This maps to a GET end-point
    public List<Job> readAllJobs(){
        List<Job> allJobs = new ArrayList<>();
        Iterable<Job> listOfJobs = jobRepository.findAll();
        listOfJobs.forEach(allJobs::add);
        return allJobs;
    }

//    @Override
//    //retrieving individual employee profile
//    //This also maps to a GET end-point but with a specific employee profile
//    public void readIndividualJobs(String jobTitle){
//        //employeeProfileRepository.findById(id);
//        jobRepository.findByJobTitle(jobTitle);
//    }

    @Override
    //retrieving individual employee profile
    //This also maps to a GET end-point but with a specific employee profile
    public void readIndividualEmployeeProfile(String name){
        //employeeProfileRepository.findById(id);
        employeeProfileRepository.findAllByNameEquals(name);
    }

    @Override
    //updating
    public void updateEmployeeProfile(EmployeeProfileModel employeeProfileModel){
        Job job = this.jobProfileFactory.buildJob(employeeProfileModel.getJob());
        Job savedJob = jobRepository.save(job);
        EmployeeProfile employeeProfile = this.employeeProfileFactory.buildEmployee(employeeProfileModel, savedJob);
        this.employeeProfileRepository.save(employeeProfile);
    }

    @Override
    //deleting an employee profile
    public void deleteEmployeeProfile(long id){
        employeeProfileRepository.deleteById(id);
    }
}