package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "advice")
public class Advice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "patid")
	private Integer patId;

	@Column(name = "women_blood_group")
	private String womenBloodGroup;

	@Column(name = "hemogram")
	private String hemogram;

	@Column(name = "tsh")
	private String tsh;

	@Column(name = "hiv")
	private String hiv;

	@Column(name = "hbsag")
	private String hbsag;

	@Column(name = "vdrl")
	private String vdrl;

	@Column(name = "urinerm")
	private String urineRm;

	@Column(name = "urinecs")
	private String urineCs;

	@Column(name = "ict_refer")
	private String ictRefer;

	@Column(name = "hb_refer")
	private String hbRefer;

	@Column(name = "tsh_refer")
	private String tshRefer;

	@Column(name = "vdrl_refer")
	private String vdrlRefer;

	@Column(name = "urinerm_refer")
	private String urineRmRefer;

	@Column(name = "urinecs_refer")
	private String urineCsRefer;

	@Column(name = "nt_nb_scan")
	private String ntNbScan;

	@Column(name = "lmp")
	@Temporal(TemporalType.DATE)
	private Date lmp;

	@Column(name = "pog")
	private Integer pog;

	@Column(name = "today")
	@Temporal(TemporalType.DATE)
	private Date today;

	public int getId() {
		return id;
	}

	public int getPatid() {
		return patId;
	}

	public String getWomenBloodGroup() {
		return womenBloodGroup;
	}

	public String getHemogram() {
		return hemogram;
	}

	public String getTsh() {
		return tsh;
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
		return urineRm;
	}

	public String getUrinecs() {
		return urineCs;
	}

	public String getIctRefer() {
		return ictRefer;
	}

	public String getHbRefer() {
		return hbRefer;
	}

	public String getTshRefer() {
		return tshRefer;
	}

	public String getVdrlRefer() {
		return vdrlRefer;
	}

	public String getUrinermRefer() {
		return urineRmRefer;
	}

	public String getUrinecsRefer() {
		return urineCsRefer;
	}

	public String getNtNbScan() {
		return ntNbScan;
	}

	public Date getLmp() {
		return lmp;
	}

	public Integer getPog() {
		return pog;
	}

	public Date getToday() {
		return today;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPatid(int patid) {
		this.patId = patid;
	}

	public void setWomenBloodGroup(String womenBloodGroup) {
		this.womenBloodGroup = womenBloodGroup;
	}

	public void setHemogram(String hemogram) {
		this.hemogram = hemogram;
	}

	public void setTsh(String tsh) {
		this.tsh = tsh;
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
		this.urineRm = urinerm;
	}

	public void setUrinecs(String urinecs) {
		this.urineCs = urinecs;
	}

	public void setIctRefer(String ictRefer) {
		this.ictRefer = ictRefer;
	}

	public void setHbRefer(String hbRefer) {
		this.hbRefer = hbRefer;
	}

	public void setTshRefer(String tshRefer) {
		this.tshRefer = tshRefer;
	}

	public void setVdrlRefer(String vdrlRefer) {
		this.vdrlRefer = vdrlRefer;
	}

	public void setUrinermRefer(String urinermRefer) {
		this.urineRmRefer = urinermRefer;
	}

	public void setUrinecsRefer(String urinecsRefer) {
		this.urineCsRefer = urinecsRefer;
	}

	public void setNtNbScan(String ntNbScan) {
		this.ntNbScan = ntNbScan;
	}

	public void setLmp(Date lmp) {
		this.lmp = lmp;
	}

	public void setPog(Integer pog) {
		this.pog = pog;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public Advice(int id, int patid, String womenBloodGroup, String hemogram, String tsh, String hiv, String hbsag,
			String vdrl, String urinerm, String urinecs, String ictRefer, String hbRefer, String tshRefer,
			String vdrlRefer, String urinermRefer, String urinecsRefer, String ntNbScan, Date lmp, Integer pog,
			Date today) {
		super();
		this.id = id;
		this.patId = patid;
		this.womenBloodGroup = womenBloodGroup;
		this.hemogram = hemogram;
		this.tsh = tsh;
		this.hiv = hiv;
		this.hbsag = hbsag;
		this.vdrl = vdrl;
		this.urineRm = urinerm;
		this.urineCs = urinecs;
		this.ictRefer = ictRefer;
		this.hbRefer = hbRefer;
		this.tshRefer = tshRefer;
		this.vdrlRefer = vdrlRefer;
		this.urineRmRefer = urinermRefer;
		this.urineCsRefer = urinecsRefer;
		this.ntNbScan = ntNbScan;
		this.lmp = lmp;
		this.pog = pog;
		this.today = today;
	}

	public Advice() {
		super();
		// TODO Auto-generated constructor stub
	}

}