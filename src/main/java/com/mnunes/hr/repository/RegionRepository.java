package com.mnunes.hr.repository;

import com.mnunes.hr.entities.RegionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<RegionEntity, Integer> {
}
