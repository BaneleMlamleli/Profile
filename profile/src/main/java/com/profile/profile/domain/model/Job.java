//package com.profile.profile.domain.model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import java.util.Date;
//
//@Entity
//@Table(name="Job")
//public class Job {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long jobId; //This is a primary key that will be automatically created and incremented by one
//    @NotBlank
//    private String jobTitle;
//    @NotBlank
//    private double salary;
//    @NotBlank
//    private String start;
//    @NotBlank
//    private String end;
//
//    public Job(){
//
//    }
//
//    public Job(long jobId, String jobTitle, double salary, String start, String end){
//        this.jobId = jobId;
//        this.jobTitle = jobTitle;
//        this.salary = salary;
//        this.start = start;
//        this.end = end;
//    }
//
//    public long getJobId() {
//        return jobId;
//    }
//
//    public void setJobId(long jobId) {
//        this.jobId = jobId;
//    }
//
//    public String getJobTitle() {
//        return jobTitle;
//    }
//
//    public void setJobTitle(String jobTitle) {
//        this.jobTitle = jobTitle;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public String getStart() {
//        return start;
//    }
//
//    public void setStart(String start) {
//        this.start = start;
//    }
//
//    public String getEnd() {
//        return end;
//    }
//
//    public void setEnd(String end) {
//        this.end = end;
//    }
//}
