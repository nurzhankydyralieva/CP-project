package com.epam.capstone_project.repository;

import com.epam.capstone_project.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("FROM Role WHERE roleName=:roleName")
    public Role getRole(@Param("roleName") String roleName);
}