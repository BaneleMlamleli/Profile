package com.profile.profile.domain.repository;

import com.profile.profile.domain.model.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {
}
