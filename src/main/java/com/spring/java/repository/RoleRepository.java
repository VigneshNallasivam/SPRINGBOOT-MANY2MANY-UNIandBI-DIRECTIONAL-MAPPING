package com.spring.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.java.model.*;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer>
{

}
