package com.example.demo.model;

public class CdManagerRatesDTO {
	
	private Integer termLength;
	private Double managerIntrstRate;
	private Integer minDepositOpen;
	private Integer maxDepositPermit;
	public Integer getTermLength() {
		return termLength;
	}
	public void setTermLength(Integer termLength) {
		this.termLength = termLength;
	}
	public Double getManagerIntrstRate() {
		return managerIntrstRate;
	}
	public void setManagerIntrstRate(Double managerIntrstRate) {
		this.managerIntrstRate = managerIntrstRate;
	}
	public Integer getMinDepositOpen() {
		return minDepositOpen;
	}
	public void setMinDepositOpen(Integer minDepositOpen) {
		this.minDepositOpen = minDepositOpen;
	}
	public Integer getMaxDepositPermit() {
		return maxDepositPermit;
	}
	public void setMaxDepositPermit(Integer maxDepositPermit) {
		this.maxDepositPermit = maxDepositPermit;
	}
	@Override
	public String toString() {
		return "CdManagerRatesDTO [termLength=" + termLength + ", managerIntrstRate=" + managerIntrstRate
				+ ", minDepositOpen=" + minDepositOpen + ", maxDepositPermit=" + maxDepositPermit + "]";
	}

}
