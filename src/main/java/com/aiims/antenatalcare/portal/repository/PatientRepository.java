package com.aiims.antenatalcare.portal.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aiims.antenatalcare.portal.entity.Patients;

@Repository
public interface PatientRepository extends CrudRepository<Patients, Long> {

	List<Patients> findByAshaId(String string);

	List<Patients> findByDoctorId(String doctorId);

	@Query("SELECT e.id FROM Patients e WHERE e.ashaId = :ashaId")
	List<Integer> findIdWhereAshaId(String ashaId);

	@Query("SELECT e.id FROM Patients e WHERE e.doctorId = :doctorId")
	List<Integer> findIdWhereDoctorId(String doctorId);

	Page findAllByDoctorId(String doctorId,Pageable pageable);

	Page findAllByAshaId(String ashaId,Pageable  pageable);

	Page findAllByAshaIdAndNextVisitBetween(String ashaId, LocalDate startDate,LocalDate endDate,Pageable  pageable);
	Page findAllByDoctorIdAndNextVisitBetween(String doctorId, LocalDate startDate,LocalDate endDate,Pageable  pageable);

	Page findAll(Pageable  pageable);

	Page findAllByNextVisitBetween(LocalDate startDate,LocalDate endDate,Pageable  pageable);

}
