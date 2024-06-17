package com.test1;

public class NonAdminEffectiveness {
	private long viableCode;
	private String viableRegion;
	private String viableLevel;
	private String remarks;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public NonAdminEffectiveness() {

	}

	public NonAdminEffectiveness(long viableCode, String viableRegion, String viableLevel, String remarks,
			String contact, String creationDate, String modifiedDate, String entityState) {
		super();
		this.viableCode = viableCode;
		this.viableRegion = viableRegion;
		this.viableLevel = viableLevel;
		this.remarks = remarks;
		this.contact = contact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getViableCode() {
		return viableCode;
	}

	public void setViableCode(long viableCode) {
		this.viableCode = viableCode;
	}

	public String getViableRegion() {
		return viableRegion;
	}

	public void setViableRegion(String viableRegion) {
		this.viableRegion = viableRegion;
	}

	public String getViableLevel() {
		return viableLevel;
	}

	public void setViableLevel(String viableLevel) {
		this.viableLevel = viableLevel;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
