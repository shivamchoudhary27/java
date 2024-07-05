package com.aiims.antenatalcare.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diabetesscreening")
public class Diabetesscreening {
	@Id
	private Integer id;
	
	@Column(name = "dia_screen")
	private String diaScreen;
	
	@Column(name = "reg_visit")
	private String regVisit;
	
	@Column(name = "high_risk_dia")
	private String highRiskDia;
	
	@Column(name = "dia_yes")
	private String diaYes;
	
	@Column(name = "dia_no")
	private String diaNo;
	
	@Column(name = "reg_visit_refer")
	private String regVisitRefer;
	
	@Column(name = "tsh")
	private String tsh;
	
	@Column(name = "tsh_value")
	private String tshValue;
	
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
	
	@Column(name = "his_mellitus")
	private String hisMellitus;
	
	@Column(name = "his_malformation")
	private String hisMalformation;
	
	@Column(name = "his_famdia")
	private String hisFamDia;
	
	@Column(name = "his_stillbirth")
	private String hisStillbirth;
	
	@Column(name = "his_polyhydra")
	private String hisPolyhydra;
	
	@Column(name = "his_bmi")
	private Integer hisBmi;
	
	@Column(name = "his_f")
	private String hisF;
	
	@Column(name = "his_p")
	private String hisP;
	
	@Column(name = "his_advisegtt")
	private String hisAdviseGtt;
	
	@Column(name = "dual_screen")
	private String dualScreen;
	
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
	
	@Column(name = "dual_papp")
	private String dualPapp;
	
	@Column(name = "dual_refer")
	private String dualRefer;
	
	@Column(name = "dual_bhcg")
	private String dualBhcg;
	
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
	private String gtt1Hr;
	
	@Column(name = "gtt_2hr")
	private String gtt2Hr;
	
	@Column(name = "height")
	private Integer height;
	
	@Column(name = "gttyes_no")
	private String gttYesNo;
	
	@Column(name = "gtt_res")
	private String gttRes;
	
	@Column(name = "gttvalue")
	private String gttValue;

	public Integer getId() {
		return id;
	}

	public String getDiaScreen() {
		return diaScreen;
	}

	public String getRegVisit() {
		return regVisit;
	}

	public String getHighRiskDia() {
		return highRiskDia;
	}

	public String getDiaYes() {
		return diaYes;
	}

	public String getDiaNo() {
		return diaNo;
	}

	public String getRegVisitRefer() {
		return regVisitRefer;
	}

	public String getTsh() {
		return tsh;
	}

	public String getTshValue() {
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
		return urinerm;
	}

	public String getUrineRmRefer() {
		return urinermRefer;
	}

	public String getUrineCs() {
		return urinecs;
	}

	public String getUrineCsRefer() {
		return urinecsRefer;
	}

	public String getHisMellitus() {
		return hisMellitus;
	}

	public String getHisMalformation() {
		return hisMalformation;
	}

	public String getHisFamDia() {
		return hisFamDia;
	}

	public String getHisStillbirth() {
		return hisStillbirth;
	}

	public String getHisPolyhydra() {
		return hisPolyhydra;
	}

	public Integer getHisBmi() {
		return hisBmi;
	}

	public String getHisF() {
		return hisF;
	}

	public String getHisP() {
		return hisP;
	}

	public String getHisAdviseGtt() {
		return hisAdviseGtt;
	}

	public String getDualScreen() {
		return dualScreen;
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

	public String getDualPapp() {
		return dualPapp;
	}

	public String getDualRefer() {
		return dualRefer;
	}

	public String getDualBhcg() {
		return dualBhcg;
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

	public String getGtt1Hr() {
		return gtt1Hr;
	}

	public String getGtt2Hr() {
		return gtt2Hr;
	}

	public Integer getHeight() {
		return height;
	}

	public String getGttYesNo() {
		return gttYesNo;
	}

	public String getGttRes() {
		return gttRes;
	}

	public String getGttValue() {
		return gttValue;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDiaScreen(String diaScreen) {
		this.diaScreen = diaScreen;
	}

	public void setRegVisit(String regVisit) {
		this.regVisit = regVisit;
	}

	public void setHighRiskDia(String highRiskDia) {
		this.highRiskDia = highRiskDia;
	}

	public void setDiaYes(String diaYes) {
		this.diaYes = diaYes;
	}

	public void setDiaNo(String diaNo) {
		this.diaNo = diaNo;
	}

	public void setRegVisitRefer(String regVisitRefer) {
		this.regVisitRefer = regVisitRefer;
	}

	public void setTsh(String tsh) {
		this.tsh = tsh;
	}

	public void setTshValue(String tshValue) {
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
		this.urinerm = urineRm;
	}

	public void setUrineRmRefer(String urineRmRefer) {
		this.urinermRefer = urineRmRefer;
	}

	public void setUrineCs(String urineCs) {
		this.urinecs = urineCs;
	}

	public void setUrineCsRefer(String urineCsRefer) {
		this.urinecsRefer = urineCsRefer;
	}

	public void setHisMellitus(String hisMellitus) {
		this.hisMellitus = hisMellitus;
	}

	public void setHisMalformation(String hisMalformation) {
		this.hisMalformation = hisMalformation;
	}

	public void setHisFamDia(String hisFamDia) {
		this.hisFamDia = hisFamDia;
	}

	public void setHisStillbirth(String hisStillbirth) {
		this.hisStillbirth = hisStillbirth;
	}

	public void setHisPolyhydra(String hisPolyhydra) {
		this.hisPolyhydra = hisPolyhydra;
	}

	public void setHisBmi(Integer hisBmi) {
		this.hisBmi = hisBmi;
	}

	public void setHisF(String hisF) {
		this.hisF = hisF;
	}

	public void setHisP(String hisP) {
		this.hisP = hisP;
	}

	public void setHisAdviseGtt(String hisAdviseGtt) {
		this.hisAdviseGtt = hisAdviseGtt;
	}

	public void setDualScreen(String dualScreen) {
		this.dualScreen = dualScreen;
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

	public void setDualPapp(String dualPapp) {
		this.dualPapp = dualPapp;
	}

	public void setDualRefer(String dualRefer) {
		this.dualRefer = dualRefer;
	}

	public void setDualBhcg(String dualBhcg) {
		this.dualBhcg = dualBhcg;
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

	public void setGtt1Hr(String gtt1Hr) {
		this.gtt1Hr = gtt1Hr;
	}

	public void setGtt2Hr(String gtt2Hr) {
		this.gtt2Hr = gtt2Hr;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public void setGttYesNo(String gttYesNo) {
		this.gttYesNo = gttYesNo;
	}

	public void setGttRes(String gttRes) {
		this.gttRes = gttRes;
	}

	public void setGttValue(String gttValue) {
		this.gttValue = gttValue;
	}

	public Diabetesscreening(Integer id, String diaScreen, String regVisit, String highRiskDia, String diaYes,
			String diaNo, String regVisitRefer, String tsh, String tshValue, String tshRefer, String hiv,
			String hivRefer, String hbsag, String hbsagRefer, String vdrl, String vdrlRefer, String urinerm,
			String urinermRefer, String urinecs, String urinecsRefer, String hisMellitus, String hisMalformation,
			String hisFamDia, String hisStillbirth, String hisPolyhydra, Integer hisBmi, String hisF, String hisP,
			String hisAdviseGtt, String dualScreen, String ntNbScan, String ntNbCrl, String ntNbNt, String ntNbCentile,
			String ntNbOthers, String ntNbScanRefer, String dualPapp, String dualRefer, String dualBhcg, String bSugar,
			String bFasting, String bPp, String gttGlucose, String gttFasting, String gtt1Hr, String gtt2Hr,
			Integer height, String gttYesNo, String gttRes, String gttValue) {
		super();
		this.id = id;
		this.diaScreen = diaScreen;
		this.regVisit = regVisit;
		this.highRiskDia = highRiskDia;
		this.diaYes = diaYes;
		this.diaNo = diaNo;
		this.regVisitRefer = regVisitRefer;
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
		this.hisMellitus = hisMellitus;
		this.hisMalformation = hisMalformation;
		this.hisFamDia = hisFamDia;
		this.hisStillbirth = hisStillbirth;
		this.hisPolyhydra = hisPolyhydra;
		this.hisBmi = hisBmi;
		this.hisF = hisF;
		this.hisP = hisP;
		this.hisAdviseGtt = hisAdviseGtt;
		this.dualScreen = dualScreen;
		this.ntNbScan = ntNbScan;
		this.ntNbCrl = ntNbCrl;
		this.ntNbNt = ntNbNt;
		this.ntNbCentile = ntNbCentile;
		this.ntNbOthers = ntNbOthers;
		this.ntNbScanRefer = ntNbScanRefer;
		this.dualPapp = dualPapp;
		this.dualRefer = dualRefer;
		this.dualBhcg = dualBhcg;
		this.bSugar = bSugar;
		this.bFasting = bFasting;
		this.bPp = bPp;
		this.gttGlucose = gttGlucose;
		this.gttFasting = gttFasting;
		this.gtt1Hr = gtt1Hr;
		this.gtt2Hr = gtt2Hr;
		this.height = height;
		this.gttYesNo = gttYesNo;
		this.gttRes = gttRes;
		this.gttValue = gttValue;
	}

	public Diabetesscreening() {
		super();
		// TODO Auto-generated constructor stub
	}

}
