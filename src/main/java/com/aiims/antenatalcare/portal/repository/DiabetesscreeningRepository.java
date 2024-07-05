package com.aiims.antenatalcare.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiims.antenatalcare.portal.entity.Diabetesscreening;

public interface DiabetesscreeningRepository extends JpaRepository<Diabetesscreening, Long> {
	List<Diabetesscreening> findByIdIn(List<Integer> id);

}
