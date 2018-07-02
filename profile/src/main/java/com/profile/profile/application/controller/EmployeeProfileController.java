package com.profile.profile.application.controller;

import org.springframework.web.bind.annotation.*;

import com.profile.profile.application.models.CreateEmployeeModel;

@RestController
@RequestMapping("employee-profile")
public class EmployeeProfileController {


    /*
        @PostMapping – Handle HTTP POST Requests
        @GetMapping – Handle HTTP Get Requests
        @PutMapping – Handle HTTP Put Requests
        @DeleteMapping – Handle HTTP Delete Requests
     */
    @PostMapping()
    public void createEmployeeProfile(@RequestBody CreateEmployeeModel employeeProfileDetails){
    }

//    @GetMapping("/{id}")
//    public CreateEmployeeModel getEmployeeProfile(@PathVariable("id") int id){
//        return null;
//    }

}
