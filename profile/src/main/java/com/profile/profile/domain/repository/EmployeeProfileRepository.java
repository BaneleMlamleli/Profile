package com.profile.profile.domain.repository;

import com.profile.profile.domain.model.EmployeeProfile;
import org.springframework.data.repository.CrudRepository;

//import java.util.List;

public interface EmployeeProfileRepository extends CrudRepository<EmployeeProfile, Long> {
    //List<EmployeeProfile> findAllByNameEquals(String name);
}