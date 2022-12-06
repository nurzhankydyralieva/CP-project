package com.epam.capstone_project.service;

import com.epam.capstone_project.entity.Role;
import com.epam.capstone_project.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    public void saveRole(Role role) {
        roleRepository.save(role);
    }

    public Role getRoleById(Long id) {
        return roleRepository.findById(id).get();
    }

    public void deleteRoleById(Long id) {
        roleRepository.deleteById(id);
    }

    public Role getRole(String role) {
        return roleRepository.getRole(role);
    }
}
