package com.aiims.antenatalcare.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aiims.antenatalcare.portal.entity.Visit;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long>{

}
