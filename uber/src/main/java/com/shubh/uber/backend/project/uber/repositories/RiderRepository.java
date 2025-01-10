package com.shubh.uber.backend.project.uber.repositories;

import com.shubh.uber.backend.project.uber.entities.Rider;
import com.shubh.uber.backend.project.uber.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RiderRepository extends JpaRepository<Rider , Long> {

    Optional<Rider> findByUser(User user);

}
