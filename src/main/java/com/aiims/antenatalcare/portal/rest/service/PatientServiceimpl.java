package com.aiims.antenatalcare.portal.rest.service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import com.aiims.antenatalcare.portal.assembler.*;
import com.aiims.antenatalcare.portal.dto.*;
import com.aiims.antenatalcare.portal.entity.*;
import com.aiims.antenatalcare.portal.exception.ResourceNotFoundException;
import com.aiims.antenatalcare.portal.repository.*;
import com.aiims.antenatalcare.portal.util.ApplicationConstants;
import org.hibernate.ObjectNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aiims.antenatalcare.portal.util.DateUtil;

@Service
public class PatientServiceimpl implements PatientService {

	Logger logger = LoggerFactory.getLogger(PatientServiceimpl.class);
	@Autowired
	private PatientRepository patientRepository;
	@Autowired

	private PastHistoryRepository pastHistoryRepository;


	private PastHistoryRepository historyRepository;

	@Autowired
	private InvestigationsRepository investigationsRepository;
	@Autowired
	private DiabetesscreeningRepository diabetesRepository;
	@Autowired
	private DiabetesscreeningAssembler diabetesscreeningAssembler;
	@Autowired
	private PastHistoryAssembler pastHistoryAssembler;
	@Autowired
	private PatientAssembler patientAssembler;
	@Autowired
	private InvestigationsAssembler investigationsAssembler;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private VisitRepository visitRepository;

	@Autowired
	private SignificantHistoryAssembler significantHistoryAssembler;

	@Autowired
	private SignificantHistoryRepository significantHistoryRepository;

	@Autowired
    private DiabetesscreeningRepository diabetesscreeningRepository;


	/*
	 * @Override
	 * 
	 * @Transactional public RequestDto createPatient1(RequestDto requestDto) {
	 * 
	 * RequestDto savedRequestDto = new RequestDto();
	 * 
	 * try { PastHistoryDto historyDto = requestDto.getPatientHistory();
	 * 
	 * PatientDto patientDto = requestDto.getPatient();
	 * 
	 * InvestigationsDto investigationsDto = requestDto.getInvestigations();
	 * 
	 * DiabetesscreeningDto diabetesscreeningDto =
	 * requestDto.getDiabetesscreening();
	 * 
	 * Patients patients = this.patientAssembler.toEntity(patientDto);
	 * 
	 * PastHistory pastHistory = this.pastHistoryAssembler.toEntity(historyDto);
	 * 
	 * Investigations investigations =
	 * this.investigationsAssembler.toEntity(investigationsDto);
	 * 
	 * Diabetesscreening diabetesscreening =
	 * this.diabetesscreeningAssembler.toEntity(diabetesscreeningDto);
	 * 
	 * String rawPassword = passwordGenerator();
	 * 
	 * String password = this.passwordEncoder.encode(rawPassword);
	 * 
	 * patients.setPassword(password);
	 * 
	 * Patients savedPatients = this.patientRepository.save(patients);
	 * 
	 * pastHistory.setId(savedPatients.getId());
	 * 
	 * PastHistory savedPastHistory = this.historyRepository.save(pastHistory);
	 * 
	 * investigations.setId(savedPatients.getId());
	 * 
	 * Investigations savedInvestigations =
	 * this.investigationsRepository.save(investigations);
	 * 
	 * diabetesscreening.setId(savedPatients.getId());
	 * 
	 * Diabetesscreening savedDiabetesscreening =
	 * this.diabetesRepository.save(diabetesscreening);
	 * 
	 * savedRequestDto.setPatient(patientAssembler.toDto(savedPatients));
	 * savedRequestDto.setInvestigations(investigationsAssembler.toDto(
	 * savedInvestigations));
	 * savedRequestDto.setDiabetesscreening(diabetesscreeningAssembler.toDto(
	 * savedDiabetesscreening));
	 * savedRequestDto.setPatientHistory(pastHistoryAssembler.toDto(savedPastHistory
	 * ));
	 * 
	 * savedRequestDto.setMessage("inserted Successfully");
	 * 
	 * savedRequestDto.setSuccess(true);
	 * 
	 * savedRequestDto.setUsername(savedPatients.getPhoneNumber());
	 * 
	 * savedRequestDto.setPassword(rawPassword);
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * return savedRequestDto;
	 * 
	 * }
	 */

	@Autowired
    private  PatientVisitAssembler patientVisitAssembler;

	@Autowired
	private  PatientVisitRepository patientVisitRepository;


	@Override
	public ResponseDto getPatient(long id) {

		Optional<Patients> patient = patientRepository.findById(id);
		PatientDto dto = patientAssembler.toDto(patient.get());

		return new ResponseDto(dto, "Patient", HttpStatus.OK);
	}

	// @Override
	public ResponseDto getPatientOld(long id) {

		RequestDto requestDto = new RequestDto();

		try {
			Optional<Patients> patients = this.patientRepository.findById(id);

			Optional<PastHistory> pasthistory = this.historyRepository.findById(id);

			Optional<Investigations> investigations = this.investigationsRepository.findById(id);

			Optional<Diabetesscreening> diabetesscreening = this.diabetesRepository.findById(id);

			PatientDto patientDto = this.patientAssembler.toDto(patients.get());

			InvestigationsDto investigationsDto = this.investigationsAssembler.toDto(investigations.get());

			DiabetesscreeningDto diabetesscreeningDto = this.diabetesscreeningAssembler.toDto(diabetesscreening.get());

			PastHistoryDto pastHistoryDto = this.pastHistoryAssembler.toDto(pasthistory.get());

			requestDto.setDiabetesscreening(diabetesscreeningDto);
			requestDto.setInvestigations(investigationsDto);
			requestDto.setPatient(patientDto);
			requestDto.setPatientHistory(pastHistoryDto);
			requestDto.setSuccess(true);
			requestDto.setMessage("patients details");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ResponseDto createPatient(PatientDto patientDto) {

		Patients newPatient = patientAssembler.toEntity(patientDto);
		
		String password = this.generatePassword();
		newPatient.setPassword(passwordEncoder.encode(password));
		
		try {
			patientRepository.save(newPatient);
		} catch (Exception e) {
			// throw new Exception();
		}
		PatientDto dto = patientAssembler.toDto(newPatient);
		dto.setPassword(password);

		return new ResponseDto(dto, "Patient created", HttpStatus.CREATED);

	}

	@Override
	public ResponseDto createPatientPastHistory(PastHistoryDto patient) {
		PastHistory patientHistory = pastHistoryAssembler.toEntity(patient);
		
		try {
			pastHistoryRepository.save(patientHistory);	
		}catch(Exception e) {
			
		}
		PastHistoryDto dto = pastHistoryAssembler.toDto(patientHistory);

		return new ResponseDto(dto, "Patinet past history created", HttpStatus.CREATED);

	}
  /*
	@Override
	public ResponseDto createPatientPastHistory(PastHistoryDto dto) {

		PastHistory pastHistory = pastHistoryAssembler.toEntity(dto);
		try {
			historyRepository.save(pastHistory);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
		dto = pastHistoryAssembler.toDto(pastHistory);

		return new ResponseDto(dto, "Patient past history created", HttpStatus.CREATED);

	}*/

	@Override
	public ResponseDto createPatientInvestigation(InvestigationsDto dto) {

		Investigations investigation = investigationsAssembler.toEntity(dto);

		try {
			investigationsRepository.save(investigation);
		} catch (Exception ex) {

		}
		dto = investigationsAssembler.toDto(investigation);

		return new ResponseDto(dto, "Patinet investigation created", HttpStatus.CREATED);
	}

	@Override
	public ResponseDto updatePatientOtherInfo(PatientDto dto) {

		Patients patient = patientRepository.findById(dto.getId()).orElseThrow();

		if (null != dto.getEducation()) {
			patient.setEducation(dto.getEducation());
		}
		if (null != dto.getSeStatus()) {
			patient.setSeStatus(dto.getSeStatus());
		}
		if (null != dto.getLmp() && !dto.getLmp().isBlank() && !dto.getLmp().isEmpty()) {
			patient.setLmp(DateUtil.stringToDate(dto.getLmp()));
		}
		if (null != dto.getEdd() && !dto.getEdd().isBlank() && !dto.getEdd().isEmpty()) {
			patient.setEdd(DateUtil.stringToDate(dto.getEdd()));
		}

		if (null != dto.getPog()) {
			patient.setPog(dto.getPog());
		}

		try {
			Map<String, LocalDate> visitDates = null;
			if (null != patient.getLmp()) {
				visitDates = getVisits(patient.getLmp());

			}
			if (null != visitDates && visitDates.containsKey(ApplicationConstants.NEXT_VISIT)) {
				patient.setNextVisit(visitDates.get(ApplicationConstants.NEXT_VISIT));
			}
			visitDates.remove(ApplicationConstants.NEXT_VISIT);
			patientRepository.save(patient);
			createVisit(patient.getId(), visitDates);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}

		dto = patientAssembler.toDto(patient);

		return new ResponseDto(dto, "Patient updated", HttpStatus.OK);
	}

	private Boolean createVisit(Long patinetId, Map<String, LocalDate> visitDates) {

		ArrayList<Visit> vistList = new ArrayList<>();
		LocalDate today = LocalDate.now();
		visitDates.forEach((k, v) -> {
			Visit visit = new Visit();
			visit.setPatId(patinetId);
			visit.setWeeks(k);
			visit.setVisitDate(v);
			visit.setToday(today);
			vistList.add(visit);
		});

		try {
			visitRepository.saveAll(vistList);
		} catch (Exception e) {

		}

		return null;
	}

	private Map<String, LocalDate> getVisits(LocalDate lmp) {
		LocalDate nextVisit = null;
		Map<String, LocalDate> visits = new HashMap<>();
		LocalDate today = LocalDate.now();

		LocalDate week13 = lmp.plusDays(91);
		visits.put("13", week13);
		LocalDate week20 = lmp.plusDays(140);
		visits.put("20", week20);
		LocalDate week26 = lmp.plusDays(182);
		visits.put("26", week26);
		LocalDate week30 = lmp.plusDays(210);
		visits.put("30", week30);
		LocalDate week34 = lmp.plusDays(238);
		visits.put("34", week34);
		LocalDate week36 = lmp.plusDays(252);
		visits.put("36", week36);
		LocalDate week38 = lmp.plusDays(266);
		visits.put("38", week38);
		LocalDate week40 = lmp.plusDays(280);
		visits.put("40", week40);

		if (today.isBefore(week13)) {
			nextVisit = week13;
		} else if ((today.isEqual(week13) || today.isAfter(week13)) && today.isBefore(week20)) {
			nextVisit = week20;
		} else if ((today.isEqual(week20) || today.isAfter(week20)) && today.isBefore(week26)) {
			nextVisit = week26;
		} else if ((today.isEqual(week26) || today.isAfter(week26)) && today.isBefore(week30)) {
			nextVisit = week30;
		} else if ((today.isEqual(week30) || today.isAfter(week30)) && today.isBefore(week34)) {
			nextVisit = week34;
		} else if ((today.isEqual(week34) || today.isAfter(week34)) && today.isBefore(week36)) {
			nextVisit = week36;
		} else if ((today.isEqual(week36) || today.isAfter(week36)) && today.isBefore(week38)) {
			nextVisit = week38;
		} else if ((today.isEqual(week38) || today.isAfter(week38)) && today.isBefore(week40)) {
			nextVisit = week40;
		} else {
			nextVisit = week40;
		}
		visits.put(ApplicationConstants.NEXT_VISIT, nextVisit);
		return visits;
	}


	private String generatePassword() {
		String baseString = "AIIMS";
		StringBuilder result = new StringBuilder(baseString);
		 Random rand = new Random();
		for (int i = 0; i < 4; i++) {
			
			result.append(rand.nextInt(9));
			
		}
		return result.toString();

	}

	@Override
	public ResponseDto getPatients() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    User user = (User) authentication.getPrincipal();
		
		return null;
	}
	@Override
	public ResponseDto getMyPatients(int page,int pageSize) {

		Pageable pageRequest = PageRequest.of(page,pageSize);
		List patientList = null;
		if(null !=getCurrentUserRole()  && getCurrentUserRole().equals(ApplicationConstants.ASHA_ROLE)){
			 patientList = patientRepository.findAllByAshaId(getCurrentUserId().toString(),pageRequest).toList();
		}else if(null !=getCurrentUserRole()  && getCurrentUserRole().equals(ApplicationConstants.DOCTOR_ROLE)){
			 patientList = patientRepository.findAllByDoctorId(getCurrentUserId().toString(),pageRequest).toList();
		}else if(null !=getCurrentUserRole() && getCurrentUserRole().equals(ApplicationConstants.ADMIN_ROLE )){
			patientList = patientRepository.findAll(pageRequest).toList();
		}
		Object patientDtoList = patientList.stream().map(patient -> {
			return patientAssembler.toDtoList((Patients) patient);
		}).collect(Collectors.toList());

		return new ResponseDto(patientDtoList, "My Patient List", HttpStatus.OK);
	}

	@Override
	public ResponseDto getMyPendingPatientList(int page, int pageSize) {
		Pageable pageRequest = PageRequest.of(page,pageSize);
		List patientList = null;
		LocalDate endDate  = LocalDate.now();
		LocalDate startDate= endDate.minusDays(30);
		if(null !=getCurrentUserRole()  && getCurrentUserRole().equals(ApplicationConstants.ASHA_ROLE)){

			patientList = patientRepository.findAllByAshaIdAndNextVisitBetween(getCurrentUserId().toString(),startDate,endDate,pageRequest).toList();
		}else if(null !=getCurrentUserRole()  && getCurrentUserRole().equals(ApplicationConstants.DOCTOR_ROLE)){
			patientList = patientRepository.findAllByDoctorIdAndNextVisitBetween(getCurrentUserId().toString(),startDate,endDate,pageRequest).toList();
		}else if(null !=getCurrentUserRole() && getCurrentUserRole().equals(ApplicationConstants.ADMIN_ROLE )){
			patientList = patientRepository.findAllByNextVisitBetween(startDate,endDate,pageRequest).toList();
		}
		Object patientDtoList = patientList.stream().map(patient -> {
			return patientAssembler.toDtoList((Patients) patient);
		}).collect(Collectors.toList());

		return new ResponseDto(patientDtoList, "My Patient List", HttpStatus.OK);
	}

	@Override
	public ResponseDto getMyTodayPatientList(int page, int pageSize) {
		Pageable pageRequest = PageRequest.of(page,pageSize);
		List patientList = null;
		LocalDate endDate  = LocalDate.now();
		LocalDate startDate= endDate.minusDays(100);
		if(null !=getCurrentUserRole()  && getCurrentUserRole().equals(ApplicationConstants.ASHA_ROLE)){

			patientList = patientRepository.findAllByAshaIdAndNextVisitBetween(getCurrentUserId().toString(),startDate,endDate,pageRequest).toList();
		}else if(null !=getCurrentUserRole()  && getCurrentUserRole().equals(ApplicationConstants.DOCTOR_ROLE)){
			patientList = patientRepository.findAllByDoctorIdAndNextVisitBetween(getCurrentUserId().toString(),startDate,endDate,pageRequest).toList();
		}else if(null !=getCurrentUserRole() && getCurrentUserRole().equals(ApplicationConstants.ADMIN_ROLE )){
			patientList = patientRepository.findAllByNextVisitBetween(startDate,endDate,pageRequest).toList();
		}
		Object patientDtoList = patientList.stream().map(patient -> {
			return patientAssembler.toDtoList((Patients) patient);
		}).collect(Collectors.toList());
		return new ResponseDto(null, "My today patient list", HttpStatus.OK);
	}

	@Override
	public ResponseDto createPatientVisit(SignificantHistoryDto dto) {



		SignificantHistory history = significantHistoryAssembler.toEntity(dto);
		Diabetesscreening diabetes = diabetesRepository.findById(dto.getId()).orElseThrow();

		diabetes.setbSugar(dto.getbSugar());
		diabetes.setbFasting(dto.getbFasting().toString());
		diabetes.setbPp(dto.getbPp().toString());
		diabetes.setGttGlucose(dto.getGttGlucose());
		diabetes.setGttFasting(dto.getGttFasting().toString());
		diabetes.setGtt1Hr(dto.getGtt1hr().toString());
		diabetes.setGtt2Hr(dto.getGtt2hr().toString());
		diabetes.setTsh(dto.getTsh());
		diabetes.setTshValue(dto.getTshValue().toString());
		diabetes.setTshRefer(dto.getTshRefer());
		diabetes.setHiv(dto.getHiv());
		diabetes.setHivRefer(dto.getHivRefer());
		diabetes.setHbsag(dto.getHbsag());
		diabetes.setHbsagRefer(dto.getHbsagRefer());
		diabetes.setVdrl(dto.getVdrl());
		diabetes.setVdrlRefer(dto.getVdrlRefer());
		diabetes.setUrineRm(dto.getUrinerm());
		diabetes.setUrineCs(dto.getUrinecs());
		diabetes.setUrineCsRefer(dto.getUrinecsRefer());
		diabetes.setUrineRmRefer(dto.getUrinermRefer());
		diabetes.setNtNbScan(dto.getNtNbScan());
		diabetes.setNtNbCentile(dto.getNtNbCentile());
		diabetes.setNtNbNt(dto.getNtNbNt());
		diabetes.setNtNbCrl(dto.getNtNbCrl());
		diabetes.setNtNbOthers(dto.getNtNbOthers());
		diabetes.setNtNbScanRefer(dto.getNtNbScanRefer());
		diabetes.setDualRefer(dto.getDualRefer());
		diabetes.setDualPapp(dto.getDualPapp());
		diabetes.setDualBhcg(dto.getDualBhcg());
		diabetes.setDualScreen(dto.getDualScreen());
		diabetes.setHeight(dto.getHeight());


		Investigations investigation = investigationsRepository.findById(dto.getId()).orElseThrow();
		investigation.setWomanBloodGroup(dto.getWomanBloodGroup());
		investigation.setwBGroup(dto.getwBGroup());
		investigation.setHusbandBGroup(dto.getHusBGroup());
		investigation.setHusbandBloodGroup(dto.getHusBloodGroup());
		investigation.setAboRh(dto.getAboRh());
		investigation.setIct(dto.getIct());
		investigation.setIctValue(dto.getIctValue());
		investigation.setHemogram(dto.getHemogram());
		investigation.setHb(dto.getHb());
		investigation.setHbValue(dto.getHbValue());


	try{
			history  = significantHistoryRepository.save(history);
		}catch (Exception ex){
  		 logger.error(ex.getMessage());
		}
		dto = significantHistoryAssembler.toDto(history);
		return new ResponseDto(dto, "My today patient list", HttpStatus.OK);

	}

	@Override
	public ResponseDto createPatientVisits(PatientVisitDto dto){
		PatientVisit patinetVisit = patientVisitAssembler.toEntity(dto);
		Diabetesscreening diabetes = diabetesRepository.findById(dto.getId()).orElseThrow();

		diabetes.setbSugar(dto.getbSugar());
		diabetes.setbFasting(dto.getbFasting().toString());
		diabetes.setbPp(dto.getbPp().toString());
		diabetes.setGttGlucose(dto.getGttGlucose());
		diabetes.setGttFasting(dto.getGttFasting().toString());
		diabetes.setGtt1Hr(dto.getGtt1hr().toString());
		diabetes.setGtt2Hr(dto.getGtt2hr().toString());
		diabetes.setTsh(dto.getTsh());
		diabetes.setTshValue(dto.getTshValue().toString());
		diabetes.setTshRefer(dto.getTshRefer());
		diabetes.setHiv(dto.getHiv());
		diabetes.setHivRefer(dto.getHivRefer());
		diabetes.setHbsag(dto.getHbsag());
		diabetes.setHbsagRefer(dto.getHbsagRefer());
		diabetes.setVdrl(dto.getVdrl());
		diabetes.setVdrlRefer(dto.getVdrlRefer());
		diabetes.setUrineRm(dto.getUrinerm());
		diabetes.setUrineCs(dto.getUrinecs());
		diabetes.setUrineCsRefer(dto.getUrinecsRefer());
		diabetes.setUrineRmRefer(dto.getUrinermRefer());
		diabetes.setNtNbScan(dto.getNtNbScan());
		diabetes.setNtNbCentile(dto.getNtNbCentile());
		diabetes.setNtNbNt(dto.getNtNbNt());
		diabetes.setNtNbCrl(dto.getNtNbCrl());
		diabetes.setNtNbOthers(dto.getNtNbOthers());
		diabetes.setNtNbScanRefer(dto.getNtNbScanRefer());
		diabetes.setDualRefer(dto.getDualRefer());
		diabetes.setDualPapp(dto.getDualPapp());
		diabetes.setDualBhcg(dto.getDualBhcg());
		diabetes.setDualScreen(dto.getDualScreen());
		diabetes.setHeight(dto.getHeight());


		Investigations investigation = investigationsRepository.findById(dto.getId()).orElseThrow();
		investigation.setWomanBloodGroup(dto.getWomanBloodGroup());
		investigation.setwBGroup(dto.getwBGroup());
		investigation.setHusbandBGroup(dto.getHusBGroup());
		investigation.setHusbandBloodGroup(dto.getHusBloodGroup());
		investigation.setAboRh(dto.getAboRh());
		investigation.setIct(dto.getIct());
		investigation.setIctValue(dto.getIctValue());
		investigation.setHemogram(dto.getHemogram());
		investigation.setHb(dto.getHb());
		investigation.setHbValue(dto.getHbValue());


		try{
			patinetVisit  = patientVisitRepository.save(patinetVisit);
		}catch (Exception ex){
			logger.error(ex.getMessage());
		}
		dto = patientVisitAssembler.toDto(patinetVisit);
		return new ResponseDto(dto, "My today patient list", HttpStatus.OK);

	}

	private Long getCurrentUserId(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(null == authentication){
			return null;
		}
		Admin user = (Admin) authentication.getPrincipal();
		return user.getAdminId();
	}
	private String getCurrentUserRole(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(null == authentication){
			return null;
		}
		Admin user = (Admin) authentication.getPrincipal();
		return user.getRole();
	}


}
