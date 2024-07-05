package com.aiims.antenatalcare.portal.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aiims.antenatalcare.portal.entity.HospitalDoctors;

@Repository
public interface DoctorsRepository extends JpaRepository<HospitalDoctors, Long>{
	@Query("SELECT d FROM HospitalDoctors d WHERE d.firstName LIKE %:keyword% OR d.lastName LIKE %:keyword% OR d.emailId LIKE %:keyword% OR d.mobileNumber LIKE %:keyword% OR d.dateOfBirth LIKE %:keyword% OR d.status LIKE %:keyword% OR d.address LIKE %:keyword%")
    Page<HospitalDoctors> searchProviders(@Param("keyword") String keyword,Pageable pageable);
	
	 //@Query("SELECT COUNT(d) FROM HospitalDoctors d WHERE d.status = true")
	    long countByStatus(Boolean status);
	    
	    Boolean existsByEmailId(String mail);
	 
	
}
