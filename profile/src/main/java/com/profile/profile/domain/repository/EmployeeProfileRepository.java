package com.profile.profile.domain.repository;

import com.profile.profile.domain.model.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//import java.util.List;

public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Long> {
    Optional<List<EmployeeProfile>> findAllByNameEquals(String name);
}