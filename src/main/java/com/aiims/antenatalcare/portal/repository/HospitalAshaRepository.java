package com.aiims.antenatalcare.portal.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aiims.antenatalcare.portal.entity.HospitalAsha;
@Repository
public interface HospitalAshaRepository extends JpaRepository<HospitalAsha, Long> {

	@Query("SELECT h FROM HospitalAsha h WHERE h.firstName LIKE %:keyword% OR h.lastName LIKE %:keyword% OR h.emailId LIKE %:keyword% OR h.mobileNumber LIKE %:keyword% OR h.dateOfBirth LIKE %:keyword% OR h.status LIKE %:keyword% OR h.address LIKE %:keyword%")
    Page<HospitalAsha> searchProviders(@Param("keyword") String keyword,Pageable pageable);
	
	@Query("SELECT COUNT(h) FROM HospitalAsha h WHERE h.status = true")
    long countActiveProviders();
}
