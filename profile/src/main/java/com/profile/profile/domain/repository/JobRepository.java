package com.profile.profile.domain.repository;

import com.profile.profile.domain.model.Job;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
//import java.util.Optional;

public interface JobRepository extends CrudRepository<Job, Long> {
    Collection<Job> findByJobTitle(String jobTitle);
}
