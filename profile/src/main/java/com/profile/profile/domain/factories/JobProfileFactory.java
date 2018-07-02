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
}
