package com.aiims.antenatalcare.portal.assembler;

import com.aiims.antenatalcare.portal.dto.AppointmentDto;
import com.aiims.antenatalcare.portal.entity.Diabetesscreening;
import com.aiims.antenatalcare.portal.entity.Docpatientappointments;
import com.aiims.antenatalcare.portal.util.DateUtil;
import org.springframework.stereotype.Component;

@Component
public class AppointmentAssembler implements BaseAssembler<Docpatientappointments, AppointmentDto>  {
    @Override
    public AppointmentDto toDto(Docpatientappointments entity) {
        AppointmentDto dto = new AppointmentDto();
        dto.setAshaId(entity.getDocScheduleId());
        dto.setPatientName(entity.getPatientName());
        dto.setPatientStatus(entity.getPatientStatus());
        dto.setScheduleTime(entity.getAppointmentTime().toString());
        return dto;
    }

    @Override
    public Docpatientappointments toEntity(AppointmentDto dto) {
        Docpatientappointments entity = new Docpatientappointments();
        entity.setDoctorId(dto.getDocId());
        entity.setPatientId(dto.getPatientId());
        entity.setPatientName(dto.getPatientName());
        entity.setPatientStatus(dto.getPatientStatus());
        entity.setDoctorStatus("Booked");
        entity.setAppointmentLength("30");
        entity.setDocScheduleId(dto.getAshaId());
        if(null != dto.getScheduleDate()){
            entity.setAppointmentDate(DateUtil.stringToDate(dto.getScheduleDate()));
        }
        if(null != dto.getScheduleTime()){
           // entity.setAppointmentTime(DateUtil.stringToTime(dto.getScheduleTime()));
        }



        return entity;
    }
}
