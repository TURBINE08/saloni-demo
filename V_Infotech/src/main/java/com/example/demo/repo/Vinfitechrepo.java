package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Infotech;

@Repository
public interface Vinfitechrepo extends JpaRepository<Infotech, Long> {

	Infotech findByUsernameAndPassword(String username, String password);

	Infotech findByUsername(String username);

}
