package com.rakuten.croptracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.croptracking.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
