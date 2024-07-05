package com.aiims.antenatalcare.portal.assembler;

import org.springframework.stereotype.Component;

import com.aiims.antenatalcare.portal.dto.InvestigationsDto;
import com.aiims.antenatalcare.portal.entity.Investigations;

@Component
public class InvestigationsAssembler implements BaseAssembler<Investigations, InvestigationsDto> {

	@Override
	public Investigations toEntity(InvestigationsDto investigationsDto) {
		Investigations investigations = new Investigations();
		investigations.setId(investigationsDto.getPatientId());
		investigations.setWomanBloodGroup(investigationsDto.getWomanBloodGroup());
		investigations.setwBGroup(investigationsDto.getwBGroup());
		investigations.setAboRh(investigationsDto.getAboRh());
		investigations.setHusbandBGroup(investigationsDto.getHusbandBGroup());
		investigations.setHusbandBloodGroup(investigationsDto.getHusbandBloodGroup());
		investigations.setIct(investigationsDto.getIct());
		investigations.setIctValue(investigationsDto.getIctValue());
		investigations.setHemogram(investigationsDto.getHemogram());
		investigations.setHb(investigationsDto.getHb());
		investigations.setHbValue(investigationsDto.getHbValue());

		return investigations;
	}

	@Override
	public InvestigationsDto toDto(Investigations investigations) {
		InvestigationsDto investigationsDto = new InvestigationsDto();
		investigationsDto.setPatientId(investigations.getId());
		investigationsDto.setWomanBloodGroup(investigations.getWomanBloodGroup());
		investigationsDto.setwBGroup(investigations.getwBGroup());
		investigationsDto.setAboRh(investigations.getAboRh());
		investigationsDto.setHusbandBGroup(investigations.getHusbandBGroup());
		investigationsDto.setHusbandBloodGroup(investigations.getHusbandBloodGroup());
		investigationsDto.setIct(investigations.getIct());
		investigationsDto.setIctValue(investigations.getIctValue());
		investigationsDto.setHemogram(investigations.getHemogram());
		investigationsDto.setHb(investigations.getHb());
		investigationsDto.setHbValue(investigations.getHbValue());

		return investigationsDto;

	}

}