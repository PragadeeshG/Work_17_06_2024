package com.test1;

public class Effectiveness {
	private long viableCode;
	private String viableName;
	private String viableDesc;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Effectiveness() {

	}

	public Effectiveness(long viableCode, String viableName, String viableDesc, String remarks, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.viableCode = viableCode;
		this.viableName = viableName;
		this.viableDesc = viableDesc;
		this.remarks = remarks;
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

	public String getViableName() {
		return viableName;
	}

	public void setViableName(String viableName) {
		this.viableName = viableName;
	}

	public String getViableDesc() {
		return viableDesc;
	}

	public void setViableDesc(String viableDesc) {
		this.viableDesc = viableDesc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
