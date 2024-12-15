package com.shubh.uber.backend.project.uber.repositories;

import com.shubh.uber.backend.project.uber.entities.User;
import com.shubh.uber.backend.project.uber.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {

    Optional<Wallet> findByUser(User user);

}
