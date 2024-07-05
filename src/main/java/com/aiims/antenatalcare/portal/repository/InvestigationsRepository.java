package com.aiims.antenatalcare.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiims.antenatalcare.portal.entity.Investigations;

public interface InvestigationsRepository extends JpaRepository<Investigations, Long> {

	List<Investigations> findByIdIn(List<Integer> id);

}
