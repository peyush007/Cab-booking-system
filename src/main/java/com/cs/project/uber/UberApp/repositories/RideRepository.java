package com.cs.project.uber.UberApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs.project.uber.UberApp.entities.Driver;
import com.cs.project.uber.UberApp.entities.Ride;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long>{

}
