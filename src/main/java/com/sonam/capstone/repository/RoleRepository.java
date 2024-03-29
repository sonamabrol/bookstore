package com.sonam.capstone.repository;

import com.sonam.capstone.model.Role;
import com.sonam.capstone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long> {

  Role findByRole(String role);
}