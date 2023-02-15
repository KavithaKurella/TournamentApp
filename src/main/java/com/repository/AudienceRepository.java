package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Audience;



@Repository
public interface AudienceRepository extends JpaRepository<Audience, Integer> {

}
