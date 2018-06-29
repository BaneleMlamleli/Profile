package com.profile.profile.domain.factories;

import com.profile.profile.application.controller.model.JobModel;
import com.profile.profile.domain.model.Job;

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
}
