package com.aiims.antenatalcare.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_settings")
public class TblSettings {

	@Id
	@Column(name = "intsettingsid")
	private int settingsId;

	@Column(name = "website")
	private String website;

	@Column(name = "varemail")
	private String email;

	@Column(name = "varrow")
	private String row;

	@Column(name = "varrowsfront")
	private String rowsFront;

	@Column(name = "varAdmtitle")
	private String adminTitle;

	@Column(name = "metatagkeyword")
	private String metaTagKeyword;

	@Column(name = "varFortitle")
	private String forTitle;

	@Column(name = "metatagdesc")
	private String metaTagDescription;

	@Column(name = "vardate")
	private String date;

	public TblSettings(int settingsId, String website, String email, String row, String rowsFront, String adminTitle,
			String metaTagKeyword, String forTitle, String metaTagDescription, String date) {
		super();
		this.settingsId = settingsId;
		this.website = website;
		this.email = email;
		this.row = row;
		this.rowsFront = rowsFront;
		this.adminTitle = adminTitle;
		this.metaTagKeyword = metaTagKeyword;
		this.forTitle = forTitle;
		this.metaTagDescription = metaTagDescription;
		this.date = date;
	}

	public int getSettingsId() {
		return settingsId;
	}

	public String getWebsite() {
		return website;
	}

	public String getEmail() {
		return email;
	}

	public String getRow() {
		return row;
	}

	public String getRowsFront() {
		return rowsFront;
	}

	public String getAdminTitle() {
		return adminTitle;
	}

	public String getMetaTagKeyword() {
		return metaTagKeyword;
	}

	public String getForTitle() {
		return forTitle;
	}

	public String getMetaTagDescription() {
		return metaTagDescription;
	}

	public String getDate() {
		return date;
	}

	public void setSettingsId(int settingsId) {
		this.settingsId = settingsId;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public void setRowsFront(String rowsFront) {
		this.rowsFront = rowsFront;
	}

	public void setAdminTitle(String adminTitle) {
		this.adminTitle = adminTitle;
	}

	public void setMetaTagKeyword(String metaTagKeyword) {
		this.metaTagKeyword = metaTagKeyword;
	}

	public void setForTitle(String forTitle) {
		this.forTitle = forTitle;
	}

	public void setMetaTagDescription(String metaTagDescription) {
		this.metaTagDescription = metaTagDescription;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public TblSettings() {
		super();
		// TODO Auto-generated constructor stub
	}

}
