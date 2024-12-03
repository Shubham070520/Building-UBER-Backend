package com.shubh.uber.backend.project.uber.repositories;

import com.shubh.uber.backend.project.uber.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {  //User as type and long as the id
}
