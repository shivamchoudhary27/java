package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="eighth_visit")
public class EighthVisit {

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
	
	@Column(name ="headache")
	private Integer headache;
	
	@Column(name ="bleeding")
	private Integer bleeding;
	
	@Column(name ="micturition")
	private Integer micturition;
	
	@Column(name ="fetal_move")
	private Integer fetalMove;
	
	@Column(name ="itching")
	private Integer itching;
	
	@Column(name ="others_check")
	private Integer othersCheck;
	
	@Column(name ="other_details")
	private String otherDetails;
	
	@Column(name ="pallor")
	private String pallor;
	
	@Column(name ="pedal_edema")
	private String pedalEdema;
	
	@Column(name ="weight")
	private Integer weight;
	
	@Column(name ="height")
	private Integer height;
	
	@Column(name ="bmi")
	private Integer bmi;
	
	@Column(name ="pulse_rate")
	private Integer pulseRate;
	
	@Column(name ="systolic")
	private Integer systolic;
	
	@Column(name ="diastolic")
	private Integer diastolic;
	
	@Column(name ="mean")
	private Integer mean;
	
	@Column(name ="pa")
	private Integer pa;
	
	@Column(name ="others_d")
	private String othersD;
	
	@Column(name ="gen_advice")
	private String genAdvice;
	
	@Column(name ="general")
	private String general;
	
	@Column(name ="nutrition")
	private String nutrition;
	
	@Column(name ="n_vomiting")
	private Integer nVomiting;
	
	@Column(name ="n_vomiting_value")
	private String nVomitingValue;
	
	@Column(name ="heart_burn")
	private Integer heartBurn;
	
	@Column(name ="heart_burn_value")
	private String heartBurnValue;
	
	@Column(name ="leg_cramps")
	private Integer legCramps;
	
	@Column(name ="leg_cramps_value")
	private String legCrampsValue;
	
	@Column(name ="low_backpain")
	private Integer lowBackPain;
	
	@Column(name ="low_backpain_value")
	private String lowBackPainValue;
	
	@Column(name ="constipation")
	private Integer constipation;
	
	@Column(name ="constipation_value")
	private String constipationValue;
	
	@Column(name ="vv_oedema")
	private Integer vvOedema;
	
	@Column(name ="vv_oedema_value")
	private String vvOedemaValue;
	
	@Column(name ="adv_medicine")
	private String advMedicine;
	
	@Column(name ="ca_others")
	private String caOthers;
	
	@Column(name ="woman_blood_group")
	private String womanBloodGroup;
	
	@Column(name ="	w_b_group")
	private String wBGroup;
	
	@Column(name ="abo_rh")
	private String aboRh;
	
	@Column(name ="hus_bld_group")
	private String husBloodGroup;
	
	@Column(name ="hus_b_group")
	private String husBGroup;
	
	@Column(name ="ict")
	private String ict;
	
	@Column(name ="ict_value")
	private String ictValue;
	
	@Column(name ="hemogram")
	private String hemogram;
	
	@Column(name ="hb")
	private Integer hb;
	
	@Column(name ="hb_value")
	private String hbValue;
	
	@Column(name ="tsh")
	private String tsh;
	
	@Column(name ="tsh_value")
	private Integer tshValue;
	
	@Column(name ="tsh_refer")
	private String tshRefer;
	
	@Column(name ="hiv")
	private String hiv;
	
	@Column(name ="hiv_refer")
	private String hivRefer;
	
	@Column(name ="hbsag")
	private String hbsag;
	
	@Column(name ="hbsag_refer")
	private String hbsagRefer;
	
	@Column(name ="vdrl")
	private String vdrl;
	
	@Column(name ="vdrl_refer")
	private String vdrlRefer;
	
	@Column(name ="urinerm")
	private String urineRm;
	
	@Column(name ="urinerm_refer")
	private String urineRmRefer;
	
	@Column(name ="urinecs")
	private String urinecs;
	
	@Column(name ="urinecs_refer")
	private String urinecsRefer;
	
	@Column(name ="next_visit")
	@Temporal(TemporalType.DATE)
	private Date nextVisit;
	
	@Column(name ="today")
	@Temporal(TemporalType.DATE)
	private Date today;
	
	@Column(name ="created_at")
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	
	@Column(name ="updated_at")
	@Temporal(TemporalType.DATE)
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

	public Integer getFetalMove() {
		return fetalMove;
	}

	public Integer getItching() {
		return itching;
	}

	public Integer getOthersCheck() {
		return othersCheck;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public String getPallor() {
		return pallor;
	}

	public String getPedalEdema() {
		return pedalEdema;
	}

	public Integer getWeight() {
		return weight;
	}

	public Integer getHeight() {
		return height;
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

	public Integer getPa() {
		return pa;
	}

	public String getOthersD() {
		return othersD;
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

	public Integer getnVomiting() {
		return nVomiting;
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

	public Integer getLowBackPain() {
		return lowBackPain;
	}

	public String getLowBackPainValue() {
		return lowBackPainValue;
	}

	public Integer getConstipation() {
		return constipation;
	}

	public String getConstipationValue() {
		return constipationValue;
	}

	public Integer getVvOedema() {
		return vvOedema;
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

	public String getUrineRm() {
		return urineRm;
	}

	public String getUrineRmRefer() {
		return urineRmRefer;
	}

	public String getUrineCs() {
		return urinecs;
	}

	public String getUrineCsRefer() {
		return urinecsRefer;
	}

	public Date getNextVisit() {
		return nextVisit;
	}

	public Date getToday() {
		return today;
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

	public void setFetalMove(Integer fetalMove) {
		this.fetalMove = fetalMove;
	}

	public void setItching(Integer itching) {
		this.itching = itching;
	}

	public void setOthersCheck(Integer othersCheck) {
		this.othersCheck = othersCheck;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public void setPallor(String pallor) {
		this.pallor = pallor;
	}

	public void setPedalEdema(String pedalEdema) {
		this.pedalEdema = pedalEdema;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public void setHeight(Integer height) {
		this.height = height;
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

	public void setPa(Integer pa) {
		this.pa = pa;
	}

	public void setOthersD(String othersD) {
		this.othersD = othersD;
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

	public void setnVomiting(Integer nVomiting) {
		this.nVomiting = nVomiting;
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

	public void setLowBackPain(Integer lowBackPain) {
		this.lowBackPain = lowBackPain;
	}

	public void setLowBackPainValue(String lowBackPainValue) {
		this.lowBackPainValue = lowBackPainValue;
	}

	public void setConstipation(Integer constipation) {
		this.constipation = constipation;
	}

	public void setConstipationValue(String constipationValue) {
		this.constipationValue = constipationValue;
	}

	public void setVvOedema(Integer vvOedema) {
		this.vvOedema = vvOedema;
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

	public void setUrineRm(String urineRm) {
		this.urineRm = urineRm;
	}

	public void setUrineRmRefer(String urineRmRefer) {
		this.urineRmRefer = urineRmRefer;
	}

	public void setUrineCs(String urineCs) {
		this.urinecs = urineCs;
	}

	public void setUrineCsRefer(String urineCsRefer) {
		this.urinecsRefer = urineCsRefer;
	}

	public void setNextVisit(Date nextVisit) {
		this.nextVisit = nextVisit;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	
	public EighthVisit(Integer id, Date lmp, Integer pog, Integer breath, Integer fatiguability, Integer headache,
			Integer bleeding, Integer micturition, Integer fetalMove, Integer itching, Integer othersCheck,
			String otherDetails, String pallor, String pedalEdema, Integer weight, Integer height, Integer bmi,
			Integer pulseRate, Integer systolic, Integer diastolic, Integer mean, Integer pa, String othersD,
			String genAdvice, String general, String nutrition, Integer nVomiting, String nVomitingValue,
			Integer heartBurn, String heartBurnValue, Integer legCramps, String legCrampsValue, Integer lowBackPain,
			String lowBackPainValue, Integer constipation, String constipationValue, Integer vvOedema,
			String vvOedemaValue, String advMedicine, String caOthers, String womanBloodGroup, String wBGroup,
			String aboRh, String husBloodGroup, String husBGroup, String ict, String ictValue, String hemogram,
			Integer hb, String hbValue, String tsh, Integer tshValue, String tshRefer, String hiv, String hivRefer,
			String hbsag, String hbsagRefer, String vdrl, String vdrlRefer, String urineRm, String urineRmRefer,
			String urinecs, String urinecsRefer, Date nextVisit, Date today, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.lmp = lmp;
		this.pog = pog;
		this.breath = breath;
		this.fatiguability = fatiguability;
		this.headache = headache;
		this.bleeding = bleeding;
		this.micturition = micturition;
		this.fetalMove = fetalMove;
		this.itching = itching;
		this.othersCheck = othersCheck;
		this.otherDetails = otherDetails;
		this.pallor = pallor;
		this.pedalEdema = pedalEdema;
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;
		this.pulseRate = pulseRate;
		this.systolic = systolic;
		this.diastolic = diastolic;
		this.mean = mean;
		this.pa = pa;
		this.othersD = othersD;
		this.genAdvice = genAdvice;
		this.general = general;
		this.nutrition = nutrition;
		this.nVomiting = nVomiting;
		this.nVomitingValue = nVomitingValue;
		this.heartBurn = heartBurn;
		this.heartBurnValue = heartBurnValue;
		this.legCramps = legCramps;
		this.legCrampsValue = legCrampsValue;
		this.lowBackPain = lowBackPain;
		this.lowBackPainValue = lowBackPainValue;
		this.constipation = constipation;
		this.constipationValue = constipationValue;
		this.vvOedema = vvOedema;
		this.vvOedemaValue = vvOedemaValue;
		this.advMedicine = advMedicine;
		this.caOthers = caOthers;
		this.womanBloodGroup = womanBloodGroup;
		this.wBGroup = wBGroup;
		this.aboRh = aboRh;
		this.husBloodGroup = husBloodGroup;
		this.husBGroup = husBGroup;
		this.ict = ict;
		this.ictValue = ictValue;
		this.hemogram = hemogram;
		this.hb = hb;
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
		this.urineRm = urineRm;
		this.urineRmRefer = urineRmRefer;
		this.urinecs = urinecs;
		this.urinecsRefer = urinecsRefer;
		this.nextVisit = nextVisit;
		this.today = today;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public EighthVisit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
