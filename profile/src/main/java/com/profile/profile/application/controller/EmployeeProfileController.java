package com.profile.profile.application.controller;

import com.profile.profile.application.services.EmployeeService;
import com.profile.profile.domain.model.EmployeeProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.profile.profile.application.models.CreateEmployeeModel;

import java.util.List;

@RestController
//@RequestMapping("employee-profile")
public class EmployeeProfileController {

    @Autowired
    private EmployeeService employeeService;

    //PostMapping("/createEmployeeProfile")
    @RequestMapping(method=RequestMethod.POST, value="employee-profile/createEmployeeProfile")
    public void createEmployeeProfile(@RequestBody CreateEmployeeModel employeeProfileDetails){
        employeeService.createEmployeeProfile(employeeProfileDetails);
    }

    //GetMapping("/allEmployeeProfiles")
    @RequestMapping(method=RequestMethod.GET, value="employee-profile/allEmployeeProfiles")
    public List<EmployeeProfile> readEmployeeProfiles(){
        return employeeService.readEmployeeProfiles();
    }

    //GetMapping("/individualEmployeeProfile/{name}")
    @RequestMapping(method=RequestMethod.GET, value="employee-profile/individualEmployeeProfile/{name}")
    public void readIndividualEmployeeProfile(@PathVariable("name") String name){
        employeeService.readIndividualEmployeeProfile(name);
    }

    //@PutMapping("/updateEmployeeProfile/{id}")
    @RequestMapping(method=RequestMethod.PUT, value="employee-profile/updateEmployeeProfile/{id}")
    public void updateEmployeeProfile(CreateEmployeeModel updateEmployeeModel){
        employeeService.updateEmployeeProfile(updateEmployeeModel);
    }

    //@DeleteMapping("/individualEmployeeProfile/{id}")
    @RequestMapping(method=RequestMethod.DELETE, value="employee-profile/individualEmployeeProfile/{id}")
    public void deleteEmployeeProfile(@PathVariable("id") long id){
        employeeService.deleteEmployeeProfile(id);
    }
}
