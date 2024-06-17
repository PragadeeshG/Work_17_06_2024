package com.test1;

public class AdminEffectiveness {
	private long viableCode;
	private String routineViable;
	private String dailyRemarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AdminEffectiveness() {

	}

	public AdminEffectiveness(long viableCode, String routineViable, String dailyRemarks, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.viableCode = viableCode;
		this.routineViable = routineViable;
		this.dailyRemarks = dailyRemarks;
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

	public String getRoutineViable() {
		return routineViable;
	}

	public void setRoutineViable(String routineViable) {
		this.routineViable = routineViable;
	}

	public String getDailyRemarks() {
		return dailyRemarks;
	}

	public void setDailyRemarks(String dailyRemarks) {
		this.dailyRemarks = dailyRemarks;
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
