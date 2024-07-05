package com.aiims.antenatalcare.portal.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "significant_history")
public class SignificantHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="history_id")
    private Long historyId;

	@Column(name = "id")
	private Long patientId;

	@Column(name = "lmp")
	private LocalDate lmp;

	@Column(name = "pog")
	private Integer pog;

	@Column(name = "fever")
	private Integer fever;

	@Column(name = "rash")
	private Integer rash;

	@Column(name = "bleeding")
	private Integer bleeding;

	@Column(name = "pain_abdomen")
	private Integer painAbdomen;

	@Column(name = "drug_intake")
	private Integer drugIntake;

	@Column(name = "details")
	private String details;

	@Column(name = "smoking")
	private Integer smoking;

	@Column(name = "alcohol")
	private Integer alcohol;

	@Column(name = "tobacco_intake")
	private Integer tobaccoIntake;

	@Column(name = "caffine_intake")
	private Integer caffineIntake;

	@Column(name = "initmate_partner")
	private Integer intimatePartner;

	@Column(name = "vomiting")
	private Integer vomiting;

	@Column(name = "violence")
	private Integer violence;

	@Column(name = "pedal_edema")
	private String pedalEdema;

	@Column(name = "edema")
	private Integer edema;

	@Column(name = "other_details")
	private String otherDetails;

	@Column(name = "pallor")
	private String pallor;

	@Column(name = "icterus")
	private String icterus;

	@Column(name = "clubbing")
	private String clubbing;

	@Column(name = "cyanosis")
	private String cyanosis;

	@Column(name = "lymphadenpathy")
	private String lymphadenpathy;

	@Column(name = "height")
	private Integer height;

	@Column(name = "weight")
	private Integer weight;

	@Column(name = "bmi")
	private Integer bmi;

	@Column(name = "pulse_rate")
	private Integer pulseRate;

	@Column(name = "systolic")
	private Integer systolic;

	@Column(name = "diastolic")
	private Integer diastolic;

	@Column(name = "mean")
	private Integer mean;

	@Column(name = "rr")
	private Integer rr;

	@Column(name = "temperature")
	private Integer temperature;

	@Column(name = "proteinuria")
	private String proteinuria;

	@Column(name = "chestcvs")
	private String chestcvs;

	@Column(name = "pa")
	private Integer pa;

	@Column(name = "others_d")
	private String othersD;

	@Column(name = "woman_blood_group")
	private String womanBloodGroup;

	@Column(name = "w_b_group")
	private String wBGroup;

	@Column(name = "abo_rh")
	private String aboRh;

	@Column(name = "hus_bld_group")
	private String husBloodGroup;

	@Column(name = "hus_b_group")
	private String husBGroup;

	@Column(name = "ict")
	private String ict;

	@Column(name = "ict_value")
	private String ictValue;

	@Column(name = "hemogram")
	private String hemogram;

	@Column(name = "hb")
	private Integer hb;

	@Column(name = "hb_value")
	private String hbValue;

	@Column(name = "tsh")
	private String tsh;

	@Column(name = "tsh_value")
	private Integer tshValue;

	@Column(name = "tsh_refer")
	private String tshRefer;

	@Column(name = "hiv")
	private String hiv;

	@Column(name = "hiv_refer")
	private String hivRefer;

	@Column(name = "hbsag")
	private String hbsag;

	@Column(name = "hbsag_refer")
	private String hbsagRefer;

	@Column(name = "vdrl")
	private String vdrl;

	@Column(name = "vdrl_refer")
	private String vdrlRefer;

	@Column(name = "urinerm")
	private String urinerm;

	@Column(name = "urinerm_refer")
	private String urinermRefer;

	@Column(name = "urinecs")
	private String urinecs;

	@Column(name = "urinecs_refer")
	private String urinecsRefer;

	@Column(name = "nt_nb_scan")
	private String ntNbScan;

	@Column(name = "nt_nb_crl")
	private String ntNbCrl;

	@Column(name = "nt_nb_nt")
	private String ntNbNt;

	@Column(name = "nt_nb_centile")
	private String ntNbCentile;

	@Column(name = "nt_nb_others")
	private String ntNbOthers;

	@Column(name = "nt_nb_scan_refer")
	private String ntNbScanRefer;

	@Column(name = "dual_screen")
	private String dualScreen;

	@Column(name = "dual_refer")
	private String dualRefer;

	@Column(name = "dual_papp")
	private String dualPapp;

	@Column(name = "dual_bhcg")
	private String dualBhcg;

	@Column(name = "gen_advice")
	private String genAdvice;

	@Column(name = "general")
	private String general;

	@Column(name = "nutrition")
	private String nutrition;

	@Column(name = "adv_medicine")
	private String advMedicine;

	@Column(name = "b_sugar")
	private String bSugar;

	@Column(name = "b_fasting")
	private Integer bFasting;

	@Column(name = "b_pp")
	private Integer bPp;

	@Column(name = "gtt_glucose")
	private String gttGlucose;

	@Column(name = "gtt_fasting")
	private Integer gttFasting;

	@Column(name = "gtt_1hr")
	private Integer gtt1hr;

	@Column(name = "gtt_2hr")
	private Integer gtt2hr;

	@Column(name = "others_check")
	private Integer othersCheck;

	@Column(name = "heart_burn_value")
	private String heartBurnValue;

	@Column(name = "leg_cramps_value")
	private String legCrampsValue;

	@Column(name = "low_backpain_value")
	private String lowBackpainValue;

	@Column(name = "constipation_value")
	private String constipationValue;

	@Column(name = "vv_oedema_value")
	private String vvOedemaValue;

	@Column(name = "n_vomiting_value")
	private String nVomitingValue;

	@Column(name = "leg_cramps")
	private Integer legCramps;

	@Column(name = "heart_burn")
	private Integer heartBurn;

	@Column(name = "low_backpain")
	private Integer lowBackpain;

	@Column(name = "constipation")
	private Integer constipation;

	@Column(name = "vv_oedema")
	private Integer vvOedema;

	@Column(name = "n_vomiting")
	private Integer nVomiting;

	@Column(name = "advice")
	private String advice;

	@Column(name = "nutritional_advice")
	private String nutritionalAdvice;

	@Column(name = "next_visit")
	private LocalDate nextVisit;

	@Column(name = "today")
	private LocalDate today;

	@Column(name = "created_at")
	@UpdateTimestamp
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public Long getId() {
		return patientId;
	}

	public LocalDate getLmp() {
		return lmp;
	}

	public Integer getPog() {
		return pog;
	}

	public Integer getFever() {
		return fever;
	}

	public Integer getRash() {
		return rash;
	}

	public Integer getBleeding() {
		return bleeding;
	}

	public Integer getPainAbdomen() {
		return painAbdomen;
	}

	public Integer getDrugIntake() {
		return drugIntake;
	}

	public String getDetails() {
		return details;
	}

	public Integer getSmoking() {
		return smoking;
	}

	public Integer getAlcohol() {
		return alcohol;
	}

	public Integer getTobaccoIntake() {
		return tobaccoIntake;
	}

	public Integer getCaffineIntake() {
		return caffineIntake;
	}

	public Integer getIntimatePartner() {
		return intimatePartner;
	}

	public Integer getVomiting() {
		return vomiting;
	}

	public Integer getViolence() {
		return violence;
	}

	public String getPedalEdema() {
		return pedalEdema;
	}

	public Integer getEdema() {
		return edema;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public String getPallor() {
		return pallor;
	}

	public String getIcterus() {
		return icterus;
	}

	public String getClubbing() {
		return clubbing;
	}

	public String getCyanosis() {
		return cyanosis;
	}

	public String getLymphadenpathy() {
		return lymphadenpathy;
	}

	public Integer getHeight() {
		return height;
	}

	public Integer getWeight() {
		return weight;
	}

	public Integer getBmi() {
		return bmi;
	}

	public Integer getPulseRate() {
		return pulseRate;
	}

	public Integer getSystolic() {
		return systolic;
	}

	public Integer getDiastolic() {
		return diastolic;
	}

	public Integer getMean() {
		return mean;
	}

	public Integer getRr() {
		return rr;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public String getProteinuria() {
		return proteinuria;
	}

	public String getChestcvs() {
		return chestcvs;
	}

	public Integer getPa() {
		return pa;
	}

	public String getOthersD() {
		return othersD;
	}

	public String getWomanBloodGroup() {
		return womanBloodGroup;
	}

	public String getwBGroup() {
		return wBGroup;
	}

	public String getAboRh() {
		return aboRh;
	}

	public String getHusBloodGroup() {
		return husBloodGroup;
	}

	public String getHusBGroup() {
		return husBGroup;
	}

	public String getIct() {
		return ict;
	}

	public String getIctValue() {
		return ictValue;
	}

	public String getHemogram() {
		return hemogram;
	}

	public Integer getHb() {
		return hb;
	}

	public String getHbValue() {
		return hbValue;
	}

	public String getTsh() {
		return tsh;
	}

	public Integer getTshValue() {
		return tshValue;
	}

	public String getTshRefer() {
		return tshRefer;
	}

	public String getHiv() {
		return hiv;
	}

	public String getHivRefer() {
		return hivRefer;
	}

	public String getHbsag() {
		return hbsag;
	}

	public String getHbsagRefer() {
		return hbsagRefer;
	}

	public String getVdrl() {
		return vdrl;
	}

	public String getVdrlRefer() {
		return vdrlRefer;
	}

	public String getUrinerm() {
		return urinerm;
	}

	public String getUrinermRefer() {
		return urinermRefer;
	}

	public String getUrinecs() {
		return urinecs;
	}

	public String getUrinecsRefer() {
		return urinecsRefer;
	}

	public String getNtNbScan() {
		return ntNbScan;
	}

	public String getNtNbCrl() {
		return ntNbCrl;
	}

	public String getNtNbNt() {
		return ntNbNt;
	}

	public String getNtNbCentile() {
		return ntNbCentile;
	}

	public String getNtNbOthers() {
		return ntNbOthers;
	}

	public String getNtNbScanRefer() {
		return ntNbScanRefer;
	}

	public String getDualScreen() {
		return dualScreen;
	}

	public String getDualRefer() {
		return dualRefer;
	}

	public String getDualPapp() {
		return dualPapp;
	}

	public String getDualBhcg() {
		return dualBhcg;
	}

	public String getGenAdvice() {
		return genAdvice;
	}

	public String getGeneral() {
		return general;
	}

	public String getNutrition() {
		return nutrition;
	}

	public String getAdvMedicine() {
		return advMedicine;
	}

	public String getbSugar() {
		return bSugar;
	}

	public Integer getbFasting() {
		return bFasting;
	}

	public Integer getbPp() {
		return bPp;
	}

	public String getGttGlucose() {
		return gttGlucose;
	}

	public Integer getGttFasting() {
		return gttFasting;
	}

	public Integer getGtt1hr() {
		return gtt1hr;
	}

	public Integer getGtt2hr() {
		return gtt2hr;
	}

	public Integer getOthersCheck() {
		return othersCheck;
	}

	public String getHeartBurnValue() {
		return heartBurnValue;
	}

	public String getLegCrampsValue() {
		return legCrampsValue;
	}

	public String getLowBackpainValue() {
		return lowBackpainValue;
	}

	public String getConstipationValue() {
		return constipationValue;
	}

	public String getVvOedemaValue() {
		return vvOedemaValue;
	}

	public String getnVomitingValue() {
		return nVomitingValue;
	}

	public Integer getLegCramps() {
		return legCramps;
	}

	public Integer getHeartBurn() {
		return heartBurn;
	}

	public Integer getLowBackpain() {
		return lowBackpain;
	}

	public Integer getConstipation() {
		return constipation;
	}

	public Integer getVvOedema() {
		return vvOedema;
	}

	public Integer getnVomiting() {
		return nVomiting;
	}

	public String getAdvice() {
		return advice;
	}

	public String getNutritionalAdvice() {
		return nutritionalAdvice;
	}

	public LocalDate getNextVisit() {
		return nextVisit;
	}

	public LocalDate getToday() {
		return today;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setId(Long id) {
		this.patientId = id;
	}

	public void setLmp(LocalDate lmp) {
		this.lmp = lmp;
	}

	public void setPog(Integer pog) {
		this.pog = pog;
	}

	public void setFever(Integer fever) {
		this.fever = fever;
	}

	public void setRash(Integer rash) {
		this.rash = rash;
	}

	public void setBleeding(Integer bleeding) {
		this.bleeding = bleeding;
	}

	public void setPainAbdomen(Integer painAbdomen) {
		this.painAbdomen = painAbdomen;
	}

	public void setDrugIntake(Integer drugIntake) {
		this.drugIntake = drugIntake;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setSmoking(Integer smoking) {
		this.smoking = smoking;
	}

	public void setAlcohol(Integer alcohol) {
		this.alcohol = alcohol;
	}

	public void setTobaccoIntake(Integer tobaccoIntake) {
		this.tobaccoIntake = tobaccoIntake;
	}

	public void setCaffineIntake(Integer caffineIntake) {
		this.caffineIntake = caffineIntake;
	}

	public void setIntimatePartner(Integer intimatePartner) {
		this.intimatePartner = intimatePartner;
	}

	public void setVomiting(Integer vomiting) {
		this.vomiting = vomiting;
	}

	public void setViolence(Integer violence) {
		this.violence = violence;
	}

	public void setPedalEdema(String pedalEdema) {
		this.pedalEdema = pedalEdema;
	}

	public void setEdema(Integer edema) {
		this.edema = edema;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public void setPallor(String pallor) {
		this.pallor = pallor;
	}

	public void setIcterus(String icterus) {
		this.icterus = icterus;
	}

	public void setClubbing(String clubbing) {
		this.clubbing = clubbing;
	}

	public void setCyanosis(String cyanosis) {
		this.cyanosis = cyanosis;
	}

	public void setLymphadenpathy(String lymphadenpathy) {
		this.lymphadenpathy = lymphadenpathy;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public void setBmi(Integer bmi) {
		this.bmi = bmi;
	}

	public void setPulseRate(Integer pulseRate) {
		this.pulseRate = pulseRate;
	}

	public void setSystolic(Integer systolic) {
		this.systolic = systolic;
	}

	public void setDiastolic(Integer diastolic) {
		this.diastolic = diastolic;
	}

	public void setMean(Integer mean) {
		this.mean = mean;
	}

	public void setRr(Integer rr) {
		this.rr = rr;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public void setProteinuria(String proteinuria) {
		this.proteinuria = proteinuria;
	}

	public void setChestcvs(String chestcvs) {
		this.chestcvs = chestcvs;
	}

	public void setPa(Integer pa) {
		this.pa = pa;
	}

	public void setOthersD(String othersD) {
		this.othersD = othersD;
	}

	public void setWomanBloodGroup(String womanBloodGroup) {
		this.womanBloodGroup = womanBloodGroup;
	}

	public void setwBGroup(String wBGroup) {
		this.wBGroup = wBGroup;
	}

	public void setAboRh(String aboRh) {
		this.aboRh = aboRh;
	}

	public void setHusBloodGroup(String husBloodGroup) {
		this.husBloodGroup = husBloodGroup;
	}

	public void setHusBGroup(String husBGroup) {
		this.husBGroup = husBGroup;
	}

	public void setIct(String ict) {
		this.ict = ict;
	}

	public void setIctValue(String ictValue) {
		this.ictValue = ictValue;
	}

	public void setHemogram(String hemogram) {
		this.hemogram = hemogram;
	}

	public void setHb(Integer hb) {
		this.hb = hb;
	}

	public void setHbValue(String hbValue) {
		this.hbValue = hbValue;
	}

	public void setTsh(String tsh) {
		this.tsh = tsh;
	}

	public void setTshValue(Integer tshValue) {
		this.tshValue = tshValue;
	}

	public void setTshRefer(String tshRefer) {
		this.tshRefer = tshRefer;
	}

	public void setHiv(String hiv) {
		this.hiv = hiv;
	}

	public void setHivRefer(String hivRefer) {
		this.hivRefer = hivRefer;
	}

	public void setHbsag(String hbsag) {
		this.hbsag = hbsag;
	}

	public void setHbsagRefer(String hbsagRefer) {
		this.hbsagRefer = hbsagRefer;
	}

	public void setVdrl(String vdrl) {
		this.vdrl = vdrl;
	}

	public void setVdrlRefer(String vdrlRefer) {
		this.vdrlRefer = vdrlRefer;
	}

	public void setUrinerm(String urinerm) {
		this.urinerm = urinerm;
	}

	public void setUrinermRefer(String urinermRefer) {
		this.urinermRefer = urinermRefer;
	}

	public void setUrinecs(String urinecs) {
		this.urinecs = urinecs;
	}

	public void setUrinecsRefer(String urinecsRefer) {
		this.urinecsRefer = urinecsRefer;
	}

	public void setNtNbScan(String ntNbScan) {
		this.ntNbScan = ntNbScan;
	}

	public void setNtNbCrl(String ntNbCrl) {
		this.ntNbCrl = ntNbCrl;
	}

	public void setNtNbNt(String ntNbNt) {
		this.ntNbNt = ntNbNt;
	}

	public void setNtNbCentile(String ntNbCentile) {
		this.ntNbCentile = ntNbCentile;
	}

	public void setNtNbOthers(String ntNbOthers) {
		this.ntNbOthers = ntNbOthers;
	}

	public void setNtNbScanRefer(String ntNbScanRefer) {
		this.ntNbScanRefer = ntNbScanRefer;
	}

	public void setDualScreen(String dualScreen) {
		this.dualScreen = dualScreen;
	}

	public void setDualRefer(String dualRefer) {
		this.dualRefer = dualRefer;
	}

	public void setDualPapp(String dualPapp) {
		this.dualPapp = dualPapp;
	}

	public void setDualBhcg(String dualBhcg) {
		this.dualBhcg = dualBhcg;
	}

	public void setGenAdvice(String genAdvice) {
		this.genAdvice = genAdvice;
	}

	public void setGeneral(String general) {
		this.general = general;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public void setAdvMedicine(String advMedicine) {
		this.advMedicine = advMedicine;
	}

	public void setbSugar(String bSugar) {
		this.bSugar = bSugar;
	}

	public void setbFasting(Integer bFasting) {
		this.bFasting = bFasting;
	}

	public void setbPp(Integer bPp) {
		this.bPp = bPp;
	}

	public void setGttGlucose(String gttGlucose) {
		this.gttGlucose = gttGlucose;
	}

	public void setGttFasting(Integer gttFasting) {
		this.gttFasting = gttFasting;
	}

	public void setGtt1hr(Integer gtt1hr) {
		this.gtt1hr = gtt1hr;
	}

	public void setGtt2hr(Integer gtt2hr) {
		this.gtt2hr = gtt2hr;
	}

	public void setOthersCheck(Integer othersCheck) {
		this.othersCheck = othersCheck;
	}

	public void setHeartBurnValue(String heartBurnValue) {
		this.heartBurnValue = heartBurnValue;
	}

	public void setLegCrampsValue(String legCrampsValue) {
		this.legCrampsValue = legCrampsValue;
	}

	public void setLowBackpainValue(String lowBackpainValue) {
		this.lowBackpainValue = lowBackpainValue;
	}

	public void setConstipationValue(String constipationValue) {
		this.constipationValue = constipationValue;
	}

	public void setVvOedemaValue(String vvOedemaValue) {
		this.vvOedemaValue = vvOedemaValue;
	}

	public void setnVomitingValue(String nVomitingValue) {
		this.nVomitingValue = nVomitingValue;
	}

	public void setLegCramps(Integer legCramps) {
		this.legCramps = legCramps;
	}

	public void setHeartBurn(Integer heartBurn) {
		this.heartBurn = heartBurn;
	}

	public void setLowBackpain(Integer lowBackpain) {
		this.lowBackpain = lowBackpain;
	}

	public void setConstipation(Integer constipation) {
		this.constipation = constipation;
	}

	public void setVvOedema(Integer vvOedema) {
		this.vvOedema = vvOedema;
	}

	public void setnVomiting(Integer nVomiting) {
		this.nVomiting = nVomiting;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public void setNutritionalAdvice(String nutritionalAdvice) {
		this.nutritionalAdvice = nutritionalAdvice;
	}

	public void setNextVisit(LocalDate nextVisit) {
		this.nextVisit = nextVisit;
	}

	public void setToday(LocalDate today) {
		this.today = today;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getHistoryId() {
		return historyId;
	}

	public void setHistoryId(Long historyId) {
		this.historyId = historyId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
}
