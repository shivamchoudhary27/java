package com.aiims.antenatalcare.portal.repository;

import com.aiims.antenatalcare.portal.entity.Docpatientappointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocpatientappointmentsRepository extends JpaRepository<Docpatientappointments, Long> {
}
