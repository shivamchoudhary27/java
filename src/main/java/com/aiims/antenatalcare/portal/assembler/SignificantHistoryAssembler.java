package com.aiims.antenatalcare.portal.assembler;

import com.aiims.antenatalcare.portal.dto.SignificantHistoryDto;
import com.aiims.antenatalcare.portal.entity.SignificantHistory;
import com.aiims.antenatalcare.portal.util.DateUtil;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SignificantHistoryAssembler implements BaseAssembler<SignificantHistory, SignificantHistoryDto> {
    @Override
    public SignificantHistoryDto toDto(SignificantHistory entity) {
        SignificantHistoryDto dto = new SignificantHistoryDto();
        dto.setId(entity.getId());
        dto.setHistoryId(entity.getHistoryId());

        return dto;
    }

    @Override
    public SignificantHistory toEntity(SignificantHistoryDto dto) {
        SignificantHistory entity = new SignificantHistory();
        entity.setId(dto.getId());

        if(null != dto.getLmp() && !dto.getLmp().isEmpty() && !dto.getLmp().isBlank()){
            entity.setLmp(DateUtil.stringToDate(dto.getLmp()));
        }

        entity.setPog(dto.getPog());
        entity.setFever(dto.getFever());
        entity.setRash(dto.getRash());
        entity.setAdvice(dto.getAdvice());
        entity.setBleeding(dto.getBleeding());
        entity.setPainAbdomen(dto.getPainAbdomen());
        entity.setDrugIntake(dto.getDrugIntake());
        entity.setSmoking(dto.getSmoking());
        entity.setAlcohol(dto.getAlcohol());
        entity.setTobaccoIntake(dto.getTobaccoIntake());
        entity.setCaffineIntake(dto.getTobaccoIntake());
        entity.setIntimatePartner(dto.getIntimatePartner());
        entity.setVomiting(dto.getVomiting());
        entity.setNutrition(dto.getNutrition());
        entity.setNutritionalAdvice(dto.getNutritionalAdvice());
        entity.setPedalEdema(dto.getPedalEdema());
        entity.setLegCramps(dto.getLegCramps());
        entity.setHeartBurn(dto.getHeartBurn());
        entity.setOtherDetails(dto.getOtherDetails());
        entity.setIcterus(dto.getIcterus());
        entity.setIctValue(dto.getIctValue());
        entity.setPallor(dto.getPallor());
        entity.setEdema(dto.getEdema());
        entity.setClubbing(dto.getClubbing());
        entity.setCyanosis(dto.getCyanosis());
        entity.setLymphadenpathy(dto.getLymphadenpathy());
        entity.setHeight(dto.getHeight());
        entity.setBmi(dto.getBmi());
        entity.setHeight(dto.getHeight());
        entity.setSystolic(dto.getSystolic());
        entity.setDiastolic(dto.getDiastolic());
        entity.setMean(dto.getMean());
        entity.setDetails(dto.getDetails());
        entity.setTemperature(dto.getTemperature());
        entity.setRr(dto.getRr());
        entity.setProteinuria(dto.getProteinuria());
        entity.setChestcvs(dto.getChestcvs());
        entity.setPa(dto.getPa());
        entity.setWomanBloodGroup(dto.getWomanBloodGroup());
        entity.setLymphadenpathy(dto.getLymphadenpathy());
        entity.setOthersD(dto.getOthersD());
        entity.setwBGroup(dto.getwBGroup());
        entity.setAboRh(dto.getAboRh());
        entity.setHemogram(dto.getHemogram());
        entity.setHusBGroup(dto.getHusBGroup());
        entity.setPedalEdema(dto.getPedalEdema());
        entity.setHusBloodGroup(dto.getHusBloodGroup());
        entity.setIct(dto.getIct());
        entity.setIctValue (dto.getIctValue());
        entity.setHb(dto.getHb());
        entity.setHbValue(dto.getHbValue());
        entity.setTsh(dto.getTsh());
        entity.setTshValue(dto.getTshValue());
        entity.setTshRefer(dto.getTshRefer());
        entity.setHiv(dto.getHiv());
        entity.setHivRefer(dto.getHivRefer());
        entity.setHbsag(dto.getHbsag());
        entity.setHbValue(dto.getHbValue());
        entity.setHbsagRefer(dto.getHbsagRefer());
        entity.setVdrl(dto.getVdrl());
        entity.setVdrlRefer(dto.getVdrlRefer());
        entity.setUrinerm(dto.getUrinerm());
        entity.setUrinermRefer(dto.getDualRefer());
        entity.setUrinecs(dto.getUrinecs());
        entity.setUrinecsRefer(dto.getUrinecsRefer());
        entity.setNtNbNt(dto.getNtNbNt());
        entity.setNtNbScan(dto.getNtNbScan());
        entity.setNtNbCrl(dto.getNtNbCrl());
        entity.setNtNbCentile(dto.getNtNbCentile());
        entity.setNtNbOthers(dto.getNtNbOthers());
        entity.setNtNbScanRefer(dto.getNtNbScanRefer());
        entity.setDualScreen(dto.getDualScreen());
        entity.setViolence(dto.getViolence());
        entity.setConstipation(dto.getConstipation());
        entity.setConstipationValue(dto.getConstipationValue());
        entity.setOthersCheck(dto.getOthersCheck());
        entity.setHeartBurn(dto.getHeartBurn());
        entity.setHeartBurnValue(dto.getHeartBurnValue());

        entity.setLegCrampsValue(dto.getLegCrampsValue());
        entity.setLowBackpain(dto.getLowBackpain());
        entity.setLowBackpainValue(dto.getLowBackpainValue());
        entity.setnVomitingValue(dto.getnVomitingValue());
        entity.setnVomiting(dto.getnVomiting());
        entity.setVvOedemaValue(dto.getVvOedemaValue());
        entity.setDualBhcg(dto.getDualBhcg());
        entity.setDualPapp(dto.getDualPapp());
        entity.setDualRefer(dto.getDualRefer());
        entity.setGeneral(dto.getGeneral());
        entity.setGenAdvice(dto.getGenAdvice());
        entity.setAdvMedicine(dto.getAdvMedicine());
        entity.setLowBackpain(dto.getLowBackpain());
        entity.setLowBackpainValue(dto.getLowBackpainValue());
        entity.setVvOedema(dto.getVvOedema());
        entity.setbSugar(dto.getbSugar());
        entity.setbFasting(dto.getbFasting());
        entity.setbPp(dto.getbPp());
        entity.setGttGlucose(dto.getGttGlucose());
        entity.setGttFasting(dto.getGttFasting());
        entity.setGtt1hr(dto.getGtt1hr());
        entity.setGtt2hr(dto.getGtt2hr());
        entity.setToday(LocalDate.now());
        entity.setPulseRate(dto.getPulseRate());
        entity.setWeight(dto.getWeight());



        return entity;
    }
}
