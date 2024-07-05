package com.aiims.antenatalcare.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiims.antenatalcare.portal.entity.PastHistory;

public interface PastHistoryRepository extends JpaRepository<PastHistory, Long> {

	List<PastHistory> findByIdIn(List<Integer> id);

}
