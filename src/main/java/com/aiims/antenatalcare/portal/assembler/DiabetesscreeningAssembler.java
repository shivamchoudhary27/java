package com.aiims.antenatalcare.portal.assembler;

import org.springframework.stereotype.Component;

import com.aiims.antenatalcare.portal.dto.DiabetesscreeningDto;
import com.aiims.antenatalcare.portal.entity.Diabetesscreening;

@Component
public class DiabetesscreeningAssembler implements BaseAssembler<Diabetesscreening, DiabetesscreeningDto> {

	@Override
	public DiabetesscreeningDto toDto(Diabetesscreening diabetesscreening) {
		DiabetesscreeningDto diabetesscreeningDto = new DiabetesscreeningDto();
		diabetesscreeningDto.setId(diabetesscreening.getId());
		diabetesscreeningDto.setDiaScreen(diabetesscreening.getDiaScreen());
		diabetesscreeningDto.setRegVisit(diabetesscreening.getRegVisit());
		diabetesscreeningDto.setHighRiskDia(diabetesscreening.getHighRiskDia());
		diabetesscreeningDto.setDiaYes(diabetesscreening.getDiaYes());
		diabetesscreeningDto.setDiaNo(diabetesscreening.getDiaNo());
		diabetesscreeningDto.setRegVisitRefer(diabetesscreening.getRegVisitRefer());
		diabetesscreeningDto.setTsh(diabetesscreening.getTsh());
		diabetesscreeningDto.setTshValue(diabetesscreening.getTshValue());
		diabetesscreeningDto.setTshRefer(diabetesscreening.getTshRefer());
		diabetesscreeningDto.setHiv(diabetesscreening.getHiv());

		diabetesscreeningDto.setHivRefer(diabetesscreening.getHivRefer());
		diabetesscreeningDto.setHbsag(diabetesscreening.getHbsag());
		diabetesscreeningDto.setHbsagRefer(diabetesscreening.getHbsagRefer());
		diabetesscreeningDto.setVdrl(diabetesscreening.getVdrl());
		diabetesscreeningDto.setVdrlRefer(diabetesscreening.getVdrlRefer());
		diabetesscreeningDto.setUrineRm(diabetesscreening.getUrineRm());
		diabetesscreeningDto.setUrineRmRefer(diabetesscreening.getUrineCsRefer());
		diabetesscreeningDto.setUrineCs(diabetesscreening.getUrineCs());
		diabetesscreeningDto.setUrineCsRefer(diabetesscreening.getUrineCsRefer());
		diabetesscreeningDto.setHisMellitus(diabetesscreening.getHisMellitus());
		diabetesscreeningDto.setHisMalformation(diabetesscreening.getHisMalformation());
		diabetesscreeningDto.setHisFamDia(diabetesscreening.getHisFamDia());
		diabetesscreeningDto.setHisStillbirth(diabetesscreening.getHisStillbirth());
		diabetesscreeningDto.setHisPolyhydra(diabetesscreening.getHisPolyhydra());
		diabetesscreeningDto.setHisBmi(diabetesscreening.getHisBmi());
		diabetesscreeningDto.setHisF(diabetesscreening.getHisF());
		diabetesscreeningDto.setHisP(diabetesscreening.getHisP());
		diabetesscreeningDto.setHisAdviseGtt(diabetesscreening.getHisAdviseGtt());
		diabetesscreeningDto.setDualScreen(diabetesscreening.getDualScreen());
		diabetesscreeningDto.setNtNbScan(diabetesscreening.getNtNbScan());
		diabetesscreeningDto.setNtNbCrl(diabetesscreening.getNtNbCrl());
		diabetesscreeningDto.setNtNbNt(diabetesscreening.getNtNbNt());
		diabetesscreeningDto.setNtNbCentile(diabetesscreening.getNtNbCentile());
		diabetesscreeningDto.setNtNbOthers(diabetesscreening.getNtNbOthers());
		diabetesscreeningDto.setNtNbScanRefer(diabetesscreening.getNtNbScanRefer());
		diabetesscreeningDto.setDualPapp(diabetesscreening.getDualPapp());
		diabetesscreeningDto.setDualRefer(diabetesscreening.getDualRefer());
		diabetesscreeningDto.setDualBhcg(diabetesscreening.getDualBhcg());
		diabetesscreeningDto.setbFasting(diabetesscreening.getbFasting());
		diabetesscreeningDto.setbPp(diabetesscreening.getbPp());
		diabetesscreeningDto.setGttGlucose(diabetesscreening.getGttGlucose());
		diabetesscreeningDto.setGttFasting(diabetesscreening.getGttFasting());
		diabetesscreeningDto.setGtt1Hr(diabetesscreening.getGtt1Hr());
		diabetesscreeningDto.setGtt2Hr(diabetesscreening.getGtt2Hr());
		diabetesscreeningDto.setHeight(diabetesscreening.getHeight());
		diabetesscreeningDto.setGttYesNo(diabetesscreening.getGttYesNo());
		diabetesscreeningDto.setGttRes(diabetesscreening.getGttRes());
		diabetesscreeningDto.setGttValue(diabetesscreening.getGttValue());

		return diabetesscreeningDto;

	}

	@Override
	public Diabetesscreening toEntity(DiabetesscreeningDto diabetesscreeningDto) {
		Diabetesscreening diabetesscreening = new Diabetesscreening();

		diabetesscreening.setDiaScreen(diabetesscreeningDto.getDiaScreen());
		diabetesscreening.setRegVisit(diabetesscreeningDto.getRegVisit());
		diabetesscreening.setHighRiskDia(diabetesscreeningDto.getHighRiskDia());
		diabetesscreening.setDiaYes(diabetesscreeningDto.getDiaYes());
		diabetesscreening.setDiaNo(diabetesscreeningDto.getDiaNo());
		diabetesscreening.setRegVisitRefer(diabetesscreeningDto.getRegVisitRefer());
		diabetesscreening.setTsh(diabetesscreeningDto.getTsh());
		diabetesscreening.setTshValue(diabetesscreeningDto.getTshValue());
		diabetesscreening.setTshRefer(diabetesscreeningDto.getTshRefer());
		diabetesscreening.setHiv(diabetesscreeningDto.getHiv());
		diabetesscreening.setHivRefer(diabetesscreeningDto.getHivRefer());
		diabetesscreening.setHbsag(diabetesscreeningDto.getHbsag());
		diabetesscreening.setHbsagRefer(diabetesscreeningDto.getHbsagRefer());
		diabetesscreening.setVdrl(diabetesscreeningDto.getVdrl());
		diabetesscreening.setVdrlRefer(diabetesscreeningDto.getVdrlRefer());
		diabetesscreening.setUrineRm(diabetesscreeningDto.getUrineRm());
		diabetesscreening.setUrineRmRefer(diabetesscreeningDto.getUrineCsRefer());
		diabetesscreening.setUrineCs(diabetesscreeningDto.getUrineCs());
		diabetesscreening.setUrineCsRefer(diabetesscreeningDto.getUrineCsRefer());
		diabetesscreening.setHisMellitus(diabetesscreeningDto.getHisMellitus());
		diabetesscreening.setHisMalformation(diabetesscreeningDto.getHisMalformation());
		diabetesscreening.setHisFamDia(diabetesscreeningDto.getHisFamDia());
		diabetesscreening.setHisStillbirth(diabetesscreeningDto.getHisStillbirth());
		diabetesscreening.setHisPolyhydra(diabetesscreeningDto.getHisPolyhydra());
		diabetesscreening.setHisBmi(diabetesscreeningDto.getHisBmi());
		diabetesscreening.setHisF(diabetesscreeningDto.getHisF());
		diabetesscreening.setHisP(diabetesscreeningDto.getHisP());
		diabetesscreening.setHisAdviseGtt(diabetesscreeningDto.getHisAdviseGtt());
		diabetesscreening.setDualScreen(diabetesscreeningDto.getDualScreen());
		diabetesscreening.setNtNbScan(diabetesscreeningDto.getNtNbScan());
		diabetesscreening.setNtNbCrl(diabetesscreeningDto.getNtNbCrl());
		diabetesscreening.setNtNbNt(diabetesscreeningDto.getNtNbNt());
		diabetesscreening.setNtNbCentile(diabetesscreeningDto.getNtNbCentile());
		diabetesscreening.setNtNbOthers(diabetesscreeningDto.getNtNbOthers());
		diabetesscreening.setNtNbScanRefer(diabetesscreeningDto.getNtNbScanRefer());
		diabetesscreening.setDualPapp(diabetesscreeningDto.getDualPapp());
		diabetesscreening.setDualRefer(diabetesscreeningDto.getDualRefer());
		diabetesscreening.setDualBhcg(diabetesscreeningDto.getDualBhcg());
		diabetesscreening.setbFasting(diabetesscreeningDto.getbFasting());
		diabetesscreening.setbPp(diabetesscreeningDto.getbPp());
		diabetesscreening.setGttGlucose(diabetesscreeningDto.getGttGlucose());
		diabetesscreening.setGttFasting(diabetesscreeningDto.getGttFasting());
		diabetesscreening.setGtt1Hr(diabetesscreeningDto.getGtt1Hr());
		diabetesscreening.setGtt2Hr(diabetesscreeningDto.getGtt2Hr());
		diabetesscreening.setHeight(diabetesscreeningDto.getHeight());
		diabetesscreening.setGttYesNo(diabetesscreeningDto.getGttYesNo());
		diabetesscreening.setGttRes(diabetesscreeningDto.getGttRes());
		diabetesscreening.setGttValue(diabetesscreeningDto.getGttValue());

		return diabetesscreening;
	}

}