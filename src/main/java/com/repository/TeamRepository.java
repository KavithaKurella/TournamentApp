package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Team;



@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
