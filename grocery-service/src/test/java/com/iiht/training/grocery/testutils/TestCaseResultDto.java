package com.iiht.training.grocery.testutils;

public class TestCaseResultDto {

	private String methodName;
	private String methodType;
	private int actualScore;
	private int earnedScore;
	private String status;
	private Boolean isMandatory;
	private String errorMessage;

	
	
	public TestCaseResultDto(String methodName, String methodType, int actualScore, int earnedScore, String status,
			Boolean isMandatory, String errorMessage) {
		super();
		this.methodName = methodName;
		this.methodType = methodType;
		this.actualScore = actualScore;
		this.earnedScore = earnedScore;
		this.status = status;
		this.isMandatory = isMandatory;
		this.errorMessage = errorMessage;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public int getActualScore() {
		return actualScore;
	}

	public void setActualScore(int actualScore) {
		this.actualScore = actualScore;
	}

	public int getEarnedScore() {
		return earnedScore;
	}

	public void setEarnedScore(int earnedScore) {
		this.earnedScore = earnedScore;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
