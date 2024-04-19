package com.abigail.examcs.repositories;

import com.abigail.examcs.models.Roles;  
import com.abigail.examcs.models.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, Long>{
    Optional<Roles> findByName(RoleName roleName);
}
