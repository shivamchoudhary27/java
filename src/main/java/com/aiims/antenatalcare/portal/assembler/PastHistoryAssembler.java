package com.aiims.antenatalcare.portal.assembler;

import org.springframework.stereotype.Component;

import com.aiims.antenatalcare.portal.dto.PastHistoryDto;
import com.aiims.antenatalcare.portal.entity.PastHistory;

@Component
public class PastHistoryAssembler implements BaseAssembler<PastHistory, PastHistoryDto> {

	@Override
	public PastHistoryDto toDto(PastHistory pastHistory) {
		PastHistoryDto responseDTO = new PastHistoryDto();
		responseDTO.setId(pastHistory.getId());
		responseDTO.setDiabetes(pastHistory.getDiabetes());
		responseDTO.setDiabetesType(pastHistory.getDiabetesType());
		responseDTO.setHypertension(pastHistory.getHypertension());
		responseDTO.setHypothyroidism(pastHistory.getHypothyroidism());
		responseDTO.setHypothyroidismValue(pastHistory.getHypothyroidismValue());
		responseDTO.setHeartDisease(pastHistory.getHeartDisease());
		responseDTO.setRheumaticHeart(pastHistory.getRheumaticHeart());
		responseDTO.setAcyanoticHeart(pastHistory.getAcyanoticHeart());
		responseDTO.setCyanoticHeart(pastHistory.getCyanoticHeart());

		responseDTO.setOthers(pastHistory.getOthers());
		responseDTO.setAsthma(pastHistory.getAsthma());
		responseDTO.setTuberculosis(pastHistory.getTuberculosis());
		responseDTO.setEpilepsy(pastHistory.getEpilepsy());
		responseDTO.setLiverDisease(pastHistory.getLiverDisease());
		responseDTO.setItp(pastHistory.getItp());
		responseDTO.setSle(pastHistory.getSle());
		responseDTO.setKidneyDisease(pastHistory.getKidneyDisease());
		responseDTO.setKidneyDisease(pastHistory.getKidneyDisease());
		responseDTO.setHistoryOfSurgery(pastHistory.getHistoryOfSurgery());
		responseDTO.setHistoryOfSurgeryValue(pastHistory.getHistoryOfSurgeryValue());
		responseDTO.setHistoryOfPastPregnancies(pastHistory.getHistoryOfPastPregnancies());
		responseDTO.setHistoryOfPastPregnanciesValue(pastHistory.getHistoryOfPastPregnanciesValue());
		responseDTO.setHistoryOfBloodTransfusions(pastHistory.getHistoryOfBloodTransfusions());
		responseDTO.setHistoryOfBloodTransfusionsValue(pastHistory.getHistoryOfBloodTransfusionsValue());
		responseDTO.setObstetricHistory(pastHistory.getObstetricHistory());
		responseDTO.setGravida(pastHistory.getGravida());
		responseDTO.setAbortions(pastHistory.getAbortions());
		responseDTO.setLivingIssues(pastHistory.getLivingIssues());
		responseDTO.setPreviousAbortion(pastHistory.getPreviousAbortions());
		responseDTO.setPreviousPregnancyValue(pastHistory.getPreviousPregnancyValue());
		responseDTO.setFamilyValue(pastHistory.getFamilyValue());
		responseDTO.setNoAbort(pastHistory.getNoAbort());
		responseDTO.setPreviousAbortions(pastHistory.getPreviousAbortions());
		responseDTO.setOtherHeartConditions(pastHistory.getOtherHeartConditions());
		responseDTO.setOtherChronicConditions(pastHistory.getOtherChronicConditions());
		responseDTO.setNoAbortFD(pastHistory.getNoAbortFD());
		responseDTO.setNoAbortIUD(pastHistory.getNoAbortIUD());
		responseDTO.setOtherChronicConditionsValue(pastHistory.getOtherChronicConditionsValue());
		responseDTO.setRheumaticHeartValue(pastHistory.getRheumaticHeartValue());
		responseDTO.setAcyanoticHeartValue(pastHistory.getAcyanoticHeartValue());
		responseDTO.setCyanoticHeartValue(pastHistory.getCyanoticHeartValue());
		responseDTO.setParity(pastHistory.getParity());

		return responseDTO;
	}

	@Override
	public PastHistory toEntity(PastHistoryDto pastHistoryRequestDTO) {
		PastHistory pastHistory = new PastHistory();
		pastHistory.setId(pastHistoryRequestDTO.getId());
		pastHistory.setDiabetes(pastHistoryRequestDTO.getDiabetes());
		pastHistory.setDiabetesType(pastHistoryRequestDTO.getDiabetesType());
		pastHistory.setHypertension(pastHistoryRequestDTO.getHypertension());
		pastHistory.setHypothyroidism(pastHistoryRequestDTO.getHypothyroidism());
		pastHistory.setHypothyroidismValue(pastHistoryRequestDTO.getHypothyroidismValue());
		pastHistory.setHeartDisease(pastHistoryRequestDTO.getHeartDisease());
		pastHistory.setRheumaticHeart(pastHistoryRequestDTO.getRheumaticHeart());
		pastHistory.setAcyanoticHeart(pastHistoryRequestDTO.getAcyanoticHeart());
		pastHistory.setCyanoticHeart(pastHistoryRequestDTO.getCyanoticHeart());
		pastHistory.setOthers(pastHistoryRequestDTO.getOthers());
		pastHistory.setAsthma(pastHistoryRequestDTO.getAsthma());
		pastHistory.setTuberculosis(pastHistoryRequestDTO.getTuberculosis());
		pastHistory.setEpilepsy(pastHistoryRequestDTO.getEpilepsy());
		pastHistory.setLiverDisease(pastHistoryRequestDTO.getLiverDisease());
		pastHistory.setItp(pastHistoryRequestDTO.getItp());
		pastHistory.setSle(pastHistoryRequestDTO.getSle());
		pastHistory.setKidneyDisease(pastHistoryRequestDTO.getKidneyDisease());
		pastHistory.setKidneyDisease(pastHistoryRequestDTO.getKidneyDisease());
		pastHistory.setHistoryOfSurgery(pastHistoryRequestDTO.getHistoryOfSurgery());
		pastHistory.setHistoryOfSurgeryValue(pastHistoryRequestDTO.getHistoryOfSurgeryValue());
		pastHistory.setHistoryOfPastPregnancies(pastHistoryRequestDTO.getHistoryOfPastPregnancies());
		pastHistory.setHistoryOfPastPregnanciesValue(pastHistoryRequestDTO.getHistoryOfPastPregnanciesValue());
		pastHistory.setHistoryOfBloodTransfusions(pastHistoryRequestDTO.getHistoryOfBloodTransfusions());
		pastHistory.setHistoryOfBloodTransfusionsValue(pastHistoryRequestDTO.getHistoryOfBloodTransfusionsValue());
		pastHistory.setObstetricHistory(pastHistoryRequestDTO.getObstetricHistory());
		pastHistory.setGravida(pastHistoryRequestDTO.getGravida());
		pastHistory.setAbortions(pastHistoryRequestDTO.getAbortions());
		pastHistory.setLivingIssues(pastHistoryRequestDTO.getLivingIssues());
		pastHistory.setPreviousAbortion(pastHistoryRequestDTO.getPreviousAbortions());
		pastHistory.setPreviousPregnancyValue(pastHistoryRequestDTO.getPreviousPregnancyValue());
		pastHistory.setFamilyValue(pastHistoryRequestDTO.getFamilyValue());
		pastHistory.setNoAbort(pastHistoryRequestDTO.getNoAbort());
		pastHistory.setPreviousAbortions(pastHistoryRequestDTO.getPreviousAbortions());
		pastHistory.setOtherHeartConditions(pastHistoryRequestDTO.getOtherHeartConditions());
		pastHistory.setOtherChronicConditions(pastHistoryRequestDTO.getOtherChronicConditions());
		pastHistory.setNoAbortFD(pastHistoryRequestDTO.getNoAbortFD());
		pastHistory.setNoAbortIUD(pastHistoryRequestDTO.getNoAbortIUD());
		pastHistory.setOtherChronicConditionsValue(pastHistoryRequestDTO.getOtherChronicConditionsValue());
		pastHistory.setRheumaticHeartValue(pastHistoryRequestDTO.getRheumaticHeartValue());
		pastHistory.setAcyanoticHeartValue(pastHistoryRequestDTO.getAcyanoticHeartValue());
		pastHistory.setCyanoticHeartValue(pastHistoryRequestDTO.getCyanoticHeartValue());
		pastHistory.setParity(pastHistoryRequestDTO.getParity());
		return pastHistory;

	}
	}

