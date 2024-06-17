package com.test1;

public class DataEffectiveness {
	private long viableCode;
	private String modularData;
	private String dataReqion;
	private String viableTeam;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataEffectiveness() {

	}

	public DataEffectiveness(long viableCode, String modularData, String dataReqion, String viableTeam, String contact,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.viableCode = viableCode;
		this.modularData = modularData;
		this.dataReqion = dataReqion;
		this.viableTeam = viableTeam;
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

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
	}

	public String getDataReqion() {
		return dataReqion;
	}

	public void setDataReqion(String dataReqion) {
		this.dataReqion = dataReqion;
	}

	public String getViableTeam() {
		return viableTeam;
	}

	public void setViableTeam(String viableTeam) {
		this.viableTeam = viableTeam;
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
