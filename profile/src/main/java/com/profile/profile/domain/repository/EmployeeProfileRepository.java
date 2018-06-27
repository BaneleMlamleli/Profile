package com.profile.profile.domain.repository;

import com.profile.profile.domain.model.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Long> {

    List<EmployeeProfile> findAllByNameEquals(String name);
}