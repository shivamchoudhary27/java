package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "highrisk")
public class HighRisk {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "patid")
	private Integer patid;

	@Column(name = "today")
	private Date today;

	@Column(name = "visit_date")
	private String visitDate;

	@Column(name = "pog")
	private String pog;

	@Column(name = "diabetes")
	private String diabetes;

	@Column(name = "dia_type")
	private String diaType;

	@Column(name = "hypertension")
	private String hypertension;

	@Column(name = "hypothyroidism")
	private String hypothyroidism;

	@Column(name = "hypothyroidism_value")
	private String hypothyroidismValue;

	@Column(name = "heart_disease")
	private String heartDisease;

	@Column(name = "rheu_heart")
	private String rheuHeart;

	@Column(name = "acya_heart")
	private String acyaHeart;

	@Column(name = "cya_heart")
	private String cyaHeart;

	@Column(name = "others")
	private String others;

	@Column(name = "asthma")
	private String asthma;

	@Column(name = "tuberculosis")
	private String tuberculosis;

	@Column(name = "epilepsy")
	private String epilepsy;

	@Column(name = "lever_dis")
	private String leverDis;

	@Column(name = "itp")
	private String itp;

	@Column(name = "sle")
	private String sle;

	@Column(name = "kidney_dis")
	private String kidneyDis;

	@Column(name = "ict")
	private String ict;

	@Column(name = "hemogram")
	private String hemogram;

	@Column(name = "hiv")
	private String hiv;

	@Column(name = "hbsag")
	private String hbsag;

	@Column(name = "vdrl")
	private String vdrl;

	@Column(name = "urinerm")
	private String urinerm;

	@Column(name = "tsh")
	private String tsh;

	@Column(name = "urinecs")
	private String urinecs;

	@Column(name = "gtt")
	private String gtt;

	@Column(name = "o_heart")
	private String oHeart;

	@Column(name = "o_chronic")
	private String oChronic;

	@Column(name = "o_chronic_value")
	private String oChronicValue;

	@Column(name = "rheu_heart_value")
	private String rheuHeartValue;

	@Column(name = "acya_heart_value")
	private String acyaHeartValue;

	@Column(name = "cya_heart_value")
	private String cyaHeartValue;

	@Column(name = "fever")
	private String fever;

	@Column(name = "rash")
	private String rash;

	@Column(name = "bleeding")
	private String bleeding;

	@Column(name = "pain_abdomen")
	private String painAbdomen;

	@Column(name = "drug_intake")
	private String drugIntake;

	@Column(name = "smoking")
	private String smoking;

	@Column(name = "alcohol")
	private String alcohol;

	@Column(name = "tobacco_intake")
	private String tobaccoIntake;

	@Column(name = "caffine_intake")
	private String caffeineIntake;

	@Column(name = "initmate_partner")
	private String intimatePartner;

	@Column(name = "vomiting")
	private String vomiting;

	@Column(name = "violence")
	private String violence;

	@Column(name = "other_details")
	private String otherDetails;

	@Column(name = "dual_screen")
	private String dualScreen;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	
	public Integer getId() {
		return id;
	}

	public Integer getPatid() {
		return patid;
	}

	public Date getToday() {
		return today;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public String getPog() {
		return pog;
	}

	public String getDiabetes() {
		return diabetes;
	}

	public String getDiaType() {
		return diaType;
	}

	public String getHypertension() {
		return hypertension;
	}

	public String getHypothyroidism() {
		return hypothyroidism;
	}

	public String getHypothyroidismValue() {
		return hypothyroidismValue;
	}

	public String getHeartDisease() {
		return heartDisease;
	}

	public String getRheuHeart() {
		return rheuHeart;
	}

	public String getAcyaHeart() {
		return acyaHeart;
	}

	public String getCyaHeart() {
		return cyaHeart;
	}

	public String getOthers() {
		return others;
	}

	public String getAsthma() {
		return asthma;
	}

	public String getTuberculosis() {
		return tuberculosis;
	}

	public String getEpilepsy() {
		return epilepsy;
	}

	public String getLeverDis() {
		return leverDis;
	}

	public String getItp() {
		return itp;
	}

	public String getSle() {
		return sle;
	}

	public String getKidneyDis() {
		return kidneyDis;
	}

	public String getIct() {
		return ict;
	}

	public String getHemogram() {
		return hemogram;
	}

	public String getHiv() {
		return hiv;
	}

	public String getHbsag() {
		return hbsag;
	}

	public String getVdrl() {
		return vdrl;
	}

	public String getUrinerm() {
		return urinerm;
	}

	public String getTsh() {
		return tsh;
	}

	public String getUrinecs() {
		return urinecs;
	}

	public String getGtt() {
		return gtt;
	}

	public String getoHeart() {
		return oHeart;
	}

	public String getoChronic() {
		return oChronic;
	}

	public String getoChronicValue() {
		return oChronicValue;
	}

	public String getRheuHeartValue() {
		return rheuHeartValue;
	}

	public String getAcyaHeartValue() {
		return acyaHeartValue;
	}

	public String getCyaHeartValue() {
		return cyaHeartValue;
	}

	public String getFever() {
		return fever;
	}

	public String getRash() {
		return rash;
	}

	public String getBleeding() {
		return bleeding;
	}

	public String getPainAbdomen() {
		return painAbdomen;
	}

	public String getDrugIntake() {
		return drugIntake;
	}

	public String getSmoking() {
		return smoking;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public String getTobaccoIntake() {
		return tobaccoIntake;
	}

	public String getCaffeineIntake() {
		return caffeineIntake;
	}

	public String getIntimatePartner() {
		return intimatePartner;
	}

	public String getVomiting() {
		return vomiting;
	}

	public String getViolence() {
		return violence;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public String getDualScreen() {
		return dualScreen;
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

	public void setPatid(Integer patid) {
		this.patid = patid;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

	public void setPog(String pog) {
		this.pog = pog;
	}

	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}

	public void setDiaType(String diaType) {
		this.diaType = diaType;
	}

	public void setHypertension(String hypertension) {
		this.hypertension = hypertension;
	}

	public void setHypothyroidism(String hypothyroidism) {
		this.hypothyroidism = hypothyroidism;
	}

	public void setHypothyroidismValue(String hypothyroidismValue) {
		this.hypothyroidismValue = hypothyroidismValue;
	}

	public void setHeartDisease(String heartDisease) {
		this.heartDisease = heartDisease;
	}

	public void setRheuHeart(String rheuHeart) {
		this.rheuHeart = rheuHeart;
	}

	public void setAcyaHeart(String acyaHeart) {
		this.acyaHeart = acyaHeart;
	}

	public void setCyaHeart(String cyaHeart) {
		this.cyaHeart = cyaHeart;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public void setAsthma(String asthma) {
		this.asthma = asthma;
	}

	public void setTuberculosis(String tuberculosis) {
		this.tuberculosis = tuberculosis;
	}

	public void setEpilepsy(String epilepsy) {
		this.epilepsy = epilepsy;
	}

	public void setLeverDis(String leverDis) {
		this.leverDis = leverDis;
	}

	public void setItp(String itp) {
		this.itp = itp;
	}

	public void setSle(String sle) {
		this.sle = sle;
	}

	public void setKidneyDis(String kidneyDis) {
		this.kidneyDis = kidneyDis;
	}

	public void setIct(String ict) {
		this.ict = ict;
	}

	public void setHemogram(String hemogram) {
		this.hemogram = hemogram;
	}

	public void setHiv(String hiv) {
		this.hiv = hiv;
	}

	public void setHbsag(String hbsag) {
		this.hbsag = hbsag;
	}

	public void setVdrl(String vdrl) {
		this.vdrl = vdrl;
	}

	public void setUrinerm(String urinerm) {
		this.urinerm = urinerm;
	}

	public void setTsh(String tsh) {
		this.tsh = tsh;
	}

	public void setUrinecs(String urinecs) {
		this.urinecs = urinecs;
	}

	public void setGtt(String gtt) {
		this.gtt = gtt;
	}

	public void setoHeart(String oHeart) {
		this.oHeart = oHeart;
	}

	public void setoChronic(String oChronic) {
		this.oChronic = oChronic;
	}

	public void setoChronicValue(String oChronicValue) {
		this.oChronicValue = oChronicValue;
	}

	public void setRheuHeartValue(String rheuHeartValue) {
		this.rheuHeartValue = rheuHeartValue;
	}

	public void setAcyaHeartValue(String acyaHeartValue) {
		this.acyaHeartValue = acyaHeartValue;
	}

	public void setCyaHeartValue(String cyaHeartValue) {
		this.cyaHeartValue = cyaHeartValue;
	}

	public void setFever(String fever) {
		this.fever = fever;
	}

	public void setRash(String rash) {
		this.rash = rash;
	}

	public void setBleeding(String bleeding) {
		this.bleeding = bleeding;
	}

	public void setPainAbdomen(String painAbdomen) {
		this.painAbdomen = painAbdomen;
	}

	public void setDrugIntake(String drugIntake) {
		this.drugIntake = drugIntake;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public void setTobaccoIntake(String tobaccoIntake) {
		this.tobaccoIntake = tobaccoIntake;
	}

	public void setCaffeineIntake(String caffeineIntake) {
		this.caffeineIntake = caffeineIntake;
	}

	public void setIntimatePartner(String intimatePartner) {
		this.intimatePartner = intimatePartner;
	}

	public void setVomiting(String vomiting) {
		this.vomiting = vomiting;
	}

	public void setViolence(String violence) {
		this.violence = violence;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public void setDualScreen(String dualScreen) {
		this.dualScreen = dualScreen;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	
	
	public HighRisk(Integer id, Integer patid, Date today, String visitDate, String pog, String diabetes,
			String diaType, String hypertension, String hypothyroidism, String hypothyroidismValue, String heartDisease,
			String rheuHeart, String acyaHeart, String cyaHeart, String others, String asthma, String tuberculosis,
			String epilepsy, String leverDis, String itp, String sle, String kidneyDis, String ict, String hemogram,
			String hiv, String hbsag, String vdrl, String urinerm, String tsh, String urinecs, String gtt,
			String oHeart, String oChronic, String oChronicValue, String rheuHeartValue, String acyaHeartValue,
			String cyaHeartValue, String fever, String rash, String bleeding, String painAbdomen, String drugIntake,
			String smoking, String alcohol, String tobaccoIntake, String caffeineIntake, String intimatePartner,
			String vomiting, String violence, String otherDetails, String dualScreen, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.patid = patid;
		this.today = today;
		this.visitDate = visitDate;
		this.pog = pog;
		this.diabetes = diabetes;
		this.diaType = diaType;
		this.hypertension = hypertension;
		this.hypothyroidism = hypothyroidism;
		this.hypothyroidismValue = hypothyroidismValue;
		this.heartDisease = heartDisease;
		this.rheuHeart = rheuHeart;
		this.acyaHeart = acyaHeart;
		this.cyaHeart = cyaHeart;
		this.others = others;
		this.asthma = asthma;
		this.tuberculosis = tuberculosis;
		this.epilepsy = epilepsy;
		this.leverDis = leverDis;
		this.itp = itp;
		this.sle = sle;
		this.kidneyDis = kidneyDis;
		this.ict = ict;
		this.hemogram = hemogram;
		this.hiv = hiv;
		this.hbsag = hbsag;
		this.vdrl = vdrl;
		this.urinerm = urinerm;
		this.tsh = tsh;
		this.urinecs = urinecs;
		this.gtt = gtt;
		this.oHeart = oHeart;
		this.oChronic = oChronic;
		this.oChronicValue = oChronicValue;
		this.rheuHeartValue = rheuHeartValue;
		this.acyaHeartValue = acyaHeartValue;
		this.cyaHeartValue = cyaHeartValue;
		this.fever = fever;
		this.rash = rash;
		this.bleeding = bleeding;
		this.painAbdomen = painAbdomen;
		this.drugIntake = drugIntake;
		this.smoking = smoking;
		this.alcohol = alcohol;
		this.tobaccoIntake = tobaccoIntake;
		this.caffeineIntake = caffeineIntake;
		this.intimatePartner = intimatePartner;
		this.vomiting = vomiting;
		this.violence = violence;
		this.otherDetails = otherDetails;
		this.dualScreen = dualScreen;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public HighRisk() {
		super();
		// TODO Auto-generated constructor stub
	}

}
