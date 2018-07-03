package com.profile.profile.domain.factories;

import com.profile.profile.application.models.JobModel;
import com.profile.profile.domain.model.Job;
import org.springframework.stereotype.Component;

@Component
public class JobProfileFactory {

    public Job buildJob(JobModel jobModel) {
        Job job = new Job();
        job.setJobId(jobModel.getJobId());
        job.setJobTitle(jobModel.getJobTitle());
        job.setSalary(jobModel.getSalary());
        job.setStart(jobModel.getStart());
        job.setEnd(jobModel.getEnd());
        return job;
    }

    public JobModel buildJobModel(Job job) {
        JobModel jobModel = new JobModel();
        jobModel.setJobId(job.getJobId());
        jobModel.setJobTitle(job.getJobTitle());
        jobModel.setSalary(job.getSalary());
        jobModel.setStart(job.getStart());
        jobModel.setEnd(job.getEnd());
        return jobModel;
    }
}
