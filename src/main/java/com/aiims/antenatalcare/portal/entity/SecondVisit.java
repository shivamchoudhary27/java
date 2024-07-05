package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "second_visit")
public class SecondVisit {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "lmp")
	private Date lmp;

	@Column(name = "pog")
	private Integer pog;

	@Column(name = "breath")
	private Integer breath;

	@Column(name = "fatiguability")
	private Integer fatiguability;

	@Column(name = "headache")
	private Integer headache;

	@Column(name = "bleeding")
	private Integer bleeding;

	@Column(name = "micturition")
	private Integer micturition;

	@Column(name = "perceived")
	private Integer perceived;

	@Column(name = "others_check")
	private Integer othersCheck;

	@Column(name = "other_details")
	private String otherDetails;

	@Column(name = "hb")
	private Integer hb;

	@Column(name = "pallor")
	private String pallor;

	@Column(name = "pedal_edema")
	private String pedalEdema;

	@Column(name = "height")
	private Integer height;

	@Column(name = "weight")
	private Integer weight;

	@Column(name = "bmi")
	private String bmi;

	@Column(name = "pulse_rate")
	private Integer pulseRate;

	@Column(name = "systolic")
	private Integer systolic;

	@Column(name = "diastolic")
	private Integer diastolic;

	@Column(name = "mean")
	private Integer mean;

	@Column(name = "pa")
	private Integer pa;

	@Column(name = "others_d")
	private String othersD;

	@Column(name = "quad_ruple")
	private String quadRuple;

	@Column(name = "qr_level_ii")
	private String qrLevelIi;

	@Column(name = "qr_normal")
	private String qrNormal;

	@Column(name = "quad_ruple_others")
	private String quadRupleOthers;

	@Column(name = "fedal_echo")
	private String fedalEcho;

	@Column(name = "fe_others")
	private String feOthers;

	@Column(name = "gen_advice")
	private String genAdvice;

	@Column(name = "general")
	private String general;

	@Column(name = "nutrition")
	private String nutrition;

	@Column(name = "n_vomiting_value")
	private String nVomitingValue;

	@Column(name = "heart_burn")
	private Integer heartBurn;

	@Column(name = "heart_burn_value")
	private String heartBurnValue;

	@Column(name = "leg_cramps")
	private Integer legCramps;

	@Column(name = "leg_cramps_value")
	private String legCrampsValue;

	@Column(name = "low_backpain")
	private Integer lowBackpain;

	@Column(name = "low_backpain_value")
	private String lowBackpainValue;

	@Column(name = "constipation_value")
	private String constipationValue;

	@Column(name = "vv_oedema_value")
	private String vvOedemaValue;

	@Column(name = "adv_medicine")
	private String advMedicine;

	@Column(name = "ca_others")
	private String caOthers;

	@Column(name = "n_vomiting")
	private Integer nVomiting;

	@Column(name = "constipation")
	private Integer constipation;

	@Column(name = "vv_oedema")
	private Integer vvOedema;

	@Column(name = "advice")
	private String advice;

	@Column(name = "nutritional_advice")
	private String nutritionalAdvice;

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

	@Column(name = "dual_screen")
	private String dualScreen;

	@Column(name = "dual_papp")
	private String dualPapp;

	@Column(name = "dual_bhcg")
	private String dualBhcg;

	@Column(name = "dual_refer")
	private String dualRefer;

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

	@Column(name = "b_sugar")
	private String bSugar;

	@Column(name = "b_fasting")
	private String bFasting;

	@Column(name = "b_pp")
	private String bPp;

	@Column(name = "gtt_glucose")
	private String gttGlucose;

	@Column(name = "gtt_fasting")
	private String gttFasting;

	@Column(name = "gtt_1hr")
	private String gtt1hr;

	@Column(name = "gtt_2hr")
	private String gtt2hr;

	@Column(name = "today")
	private Date today;

	@Column(name = "next_visit")
	private Date nextVisit;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	public Integer getId() {
		return id;
	}

	public Date getLmp() {
		return lmp;
	}

	public Integer getPog() {
		return pog;
	}

	public Integer getBreath() {
		return breath;
	}

	public Integer getFatiguability() {
		return fatiguability;
	}

	public Integer getHeadache() {
		return headache;
	}

	public Integer getBleeding() {
		return bleeding;
	}

	public Integer getMicturition() {
		return micturition;
	}

	public Integer getPerceived() {
		return perceived;
	}

	public Integer getOthersCheck() {
		return othersCheck;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public Integer getHb() {
		return hb;
	}

	public String getPallor() {
		return pallor;
	}

	public String getPedalEdema() {
		return pedalEdema;
	}

	public Integer getHeight() {
		return height;
	}

	public Integer getWeight() {
		return weight;
	}

	public String getBmi() {
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

	public Integer getPa() {
		return pa;
	}

	public String getOthersD() {
		return othersD;
	}

	public String getQuadRuple() {
		return quadRuple;
	}

	public String getQrLevelIi() {
		return qrLevelIi;
	}

	public String getQrNormal() {
		return qrNormal;
	}

	public String getQuadRupleOthers() {
		return quadRupleOthers;
	}

	public String getFedalEcho() {
		return fedalEcho;
	}

	public String getFeOthers() {
		return feOthers;
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

	public String getnVomitingValue() {
		return nVomitingValue;
	}

	public Integer getHeartBurn() {
		return heartBurn;
	}

	public String getHeartBurnValue() {
		return heartBurnValue;
	}

	public Integer getLegCramps() {
		return legCramps;
	}

	public String getLegCrampsValue() {
		return legCrampsValue;
	}

	public Integer getLowBackpain() {
		return lowBackpain;
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

	public String getAdvMedicine() {
		return advMedicine;
	}

	public String getCaOthers() {
		return caOthers;
	}

	public Integer getnVomiting() {
		return nVomiting;
	}

	public Integer getConstipation() {
		return constipation;
	}

	public Integer getVvOedema() {
		return vvOedema;
	}

	public String getAdvice() {
		return advice;
	}

	public String getNutritionalAdvice() {
		return nutritionalAdvice;
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

	public String getDualScreen() {
		return dualScreen;
	}

	public String getDualPapp() {
		return dualPapp;
	}

	public String getDualBhcg() {
		return dualBhcg;
	}

	public String getDualRefer() {
		return dualRefer;
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

	public String getbSugar() {
		return bSugar;
	}

	public String getbFasting() {
		return bFasting;
	}

	public String getbPp() {
		return bPp;
	}

	public String getGttGlucose() {
		return gttGlucose;
	}

	public String getGttFasting() {
		return gttFasting;
	}

	public String getGtt1hr() {
		return gtt1hr;
	}

	public String getGtt2hr() {
		return gtt2hr;
	}

	public Date getToday() {
		return today;
	}

	public Date getNextVisit() {
		return nextVisit;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLmp(Date lmp) {
		this.lmp = lmp;
	}

	public void setPog(Integer pog) {
		this.pog = pog;
	}

	public void setBreath(Integer breath) {
		this.breath = breath;
	}

	public void setFatiguability(Integer fatiguability) {
		this.fatiguability = fatiguability;
	}

	public void setHeadache(Integer headache) {
		this.headache = headache;
	}

	public void setBleeding(Integer bleeding) {
		this.bleeding = bleeding;
	}

	public void setMicturition(Integer micturition) {
		this.micturition = micturition;
	}

	public void setPerceived(Integer perceived) {
		this.perceived = perceived;
	}

	public void setOthersCheck(Integer othersCheck) {
		this.othersCheck = othersCheck;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public void setHb(Integer hb) {
		this.hb = hb;
	}

	public void setPallor(String pallor) {
		this.pallor = pallor;
	}

	public void setPedalEdema(String pedalEdema) {
		this.pedalEdema = pedalEdema;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public void setBmi(String bmi) {
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

	public void setPa(Integer pa) {
		this.pa = pa;
	}

	public void setOthersD(String othersD) {
		this.othersD = othersD;
	}

	public void setQuadRuple(String quadRuple) {
		this.quadRuple = quadRuple;
	}

	public void setQrLevelIi(String qrLevelIi) {
		this.qrLevelIi = qrLevelIi;
	}

	public void setQrNormal(String qrNormal) {
		this.qrNormal = qrNormal;
	}

	public void setQuadRupleOthers(String quadRupleOthers) {
		this.quadRupleOthers = quadRupleOthers;
	}

	public void setFedalEcho(String fedalEcho) {
		this.fedalEcho = fedalEcho;
	}

	public void setFeOthers(String feOthers) {
		this.feOthers = feOthers;
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

	public void setnVomitingValue(String nVomitingValue) {
		this.nVomitingValue = nVomitingValue;
	}

	public void setHeartBurn(Integer heartBurn) {
		this.heartBurn = heartBurn;
	}

	public void setHeartBurnValue(String heartBurnValue) {
		this.heartBurnValue = heartBurnValue;
	}

	public void setLegCramps(Integer legCramps) {
		this.legCramps = legCramps;
	}

	public void setLegCrampsValue(String legCrampsValue) {
		this.legCrampsValue = legCrampsValue;
	}

	public void setLowBackpain(Integer lowBackpain) {
		this.lowBackpain = lowBackpain;
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

	public void setAdvMedicine(String advMedicine) {
		this.advMedicine = advMedicine;
	}

	public void setCaOthers(String caOthers) {
		this.caOthers = caOthers;
	}

	public void setnVomiting(Integer nVomiting) {
		this.nVomiting = nVomiting;
	}

	public void setConstipation(Integer constipation) {
		this.constipation = constipation;
	}

	public void setVvOedema(Integer vvOedema) {
		this.vvOedema = vvOedema;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public void setNutritionalAdvice(String nutritionalAdvice) {
		this.nutritionalAdvice = nutritionalAdvice;
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

	public void setDualScreen(String dualScreen) {
		this.dualScreen = dualScreen;
	}

	public void setDualPapp(String dualPapp) {
		this.dualPapp = dualPapp;
	}

	public void setDualBhcg(String dualBhcg) {
		this.dualBhcg = dualBhcg;
	}

	public void setDualRefer(String dualRefer) {
		this.dualRefer = dualRefer;
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

	public void setbSugar(String bSugar) {
		this.bSugar = bSugar;
	}

	public void setbFasting(String bFasting) {
		this.bFasting = bFasting;
	}

	public void setbPp(String bPp) {
		this.bPp = bPp;
	}

	public void setGttGlucose(String gttGlucose) {
		this.gttGlucose = gttGlucose;
	}

	public void setGttFasting(String gttFasting) {
		this.gttFasting = gttFasting;
	}

	public void setGtt1hr(String gtt1hr) {
		this.gtt1hr = gtt1hr;
	}

	public void setGtt2hr(String gtt2hr) {
		this.gtt2hr = gtt2hr;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public void setNextVisit(Date nextVisit) {
		this.nextVisit = nextVisit;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public SecondVisit(Integer id, Date lmp, Integer pog, Integer breath, Integer fatiguability, Integer headache,
			Integer bleeding, Integer micturition, Integer perceived, Integer othersCheck, String otherDetails,
			Integer hb, String pallor, String pedalEdema, Integer height, Integer weight, String bmi, Integer pulseRate,
			Integer systolic, Integer diastolic, Integer mean, Integer pa, String othersD, String quadRuple,
			String qrLevelIi, String qrNormal, String quadRupleOthers, String fedalEcho, String feOthers,
			String genAdvice, String general, String nutrition, String nVomitingValue, Integer heartBurn,
			String heartBurnValue, Integer legCramps, String legCrampsValue, Integer lowBackpain,
			String lowBackpainValue, String constipationValue, String vvOedemaValue, String advMedicine,
			String caOthers, Integer nVomiting, Integer constipation, Integer vvOedema, String advice,
			String nutritionalAdvice, String womanBloodGroup, String wBGroup, String aboRh, String husBloodGroup,
			String husBGroup, String ict, String ictValue, String hemogram, String hbValue, String tsh,
			Integer tshValue, String tshRefer, String hiv, String hivRefer, String hbsag, String hbsagRefer,
			String vdrl, String vdrlRefer, String urinerm, String urinermRefer, String urinecs, String urinecsRefer,
			String dualScreen, String dualPapp, String dualBhcg, String dualRefer, String ntNbScan, String ntNbCrl,
			String ntNbNt, String ntNbCentile, String ntNbOthers, String ntNbScanRefer, String bSugar, String bFasting,
			String bPp, String gttGlucose, String gttFasting, String gtt1hr, String gtt2hr, Date today, Date nextVisit,
			Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.lmp = lmp;
		this.pog = pog;
		this.breath = breath;
		this.fatiguability = fatiguability;
		this.headache = headache;
		this.bleeding = bleeding;
		this.micturition = micturition;
		this.perceived = perceived;
		this.othersCheck = othersCheck;
		this.otherDetails = otherDetails;
		this.hb = hb;
		this.pallor = pallor;
		this.pedalEdema = pedalEdema;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.pulseRate = pulseRate;
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.mean = mean;
		this.pa = pa;
		this.othersD = othersD;
		this.quadRuple = quadRuple;
		this.qrLevelIi = qrLevelIi;
		this.qrNormal = qrNormal;
		this.quadRupleOthers = quadRupleOthers;
		this.fedalEcho = fedalEcho;
		this.feOthers = feOthers;
		this.genAdvice = genAdvice;
		this.general = general;
		this.nutrition = nutrition;
		this.nVomitingValue = nVomitingValue;
		this.heartBurn = heartBurn;
		this.heartBurnValue = heartBurnValue;
		this.legCramps = legCramps;
		this.legCrampsValue = legCrampsValue;
		this.lowBackpain = lowBackpain;
		this.lowBackpainValue = lowBackpainValue;
		this.constipationValue = constipationValue;
		this.vvOedemaValue = vvOedemaValue;
		this.advMedicine = advMedicine;
		this.caOthers = caOthers;
		this.nVomiting = nVomiting;
		this.constipation = constipation;
		this.vvOedema = vvOedema;
		this.advice = advice;
		this.nutritionalAdvice = nutritionalAdvice;
		this.womanBloodGroup = womanBloodGroup;
		this.wBGroup = wBGroup;
		this.aboRh = aboRh;
		this.husBloodGroup = husBloodGroup;
		this.husBGroup = husBGroup;
		this.ict = ict;
		this.ictValue = ictValue;
		this.hemogram = hemogram;
		this.hbValue = hbValue;
		this.tsh = tsh;
		this.tshValue = tshValue;
		this.tshRefer = tshRefer;
		this.hiv = hiv;
		this.hivRefer = hivRefer;
		this.hbsag = hbsag;
		this.hbsagRefer = hbsagRefer;
		this.vdrl = vdrl;
		this.vdrlRefer = vdrlRefer;
		this.urinerm = urinerm;
		this.urinermRefer = urinermRefer;
		this.urinecs = urinecs;
		this.urinecsRefer = urinecsRefer;
		this.dualScreen = dualScreen;
		this.dualPapp = dualPapp;
		this.dualBhcg = dualBhcg;
		this.dualRefer = dualRefer;
		this.ntNbScan = ntNbScan;
		this.ntNbCrl = ntNbCrl;
		this.ntNbNt = ntNbNt;
		this.ntNbCentile = ntNbCentile;
		this.ntNbOthers = ntNbOthers;
		this.ntNbScanRefer = ntNbScanRefer;
		this.bSugar = bSugar;
		this.bFasting = bFasting;
		this.bPp = bPp;
		this.gttGlucose = gttGlucose;
		this.gttFasting = gttFasting;
		this.gtt1hr = gtt1hr;
		this.gtt2hr = gtt2hr;
		this.today = today;
		this.nextVisit = nextVisit;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public SecondVisit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
