package com.aiims.antenatalcare.portal.repository;

import com.aiims.antenatalcare.portal.entity.PatientVisit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientVisitRepository extends CrudRepository<PatientVisit, Long> {
}
