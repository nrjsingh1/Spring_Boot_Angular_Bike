package com.NRJPVTLTD.Bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NRJPVTLTD.Bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike,Long> {

}
