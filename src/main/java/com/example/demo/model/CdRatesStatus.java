package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CD_RATES_STATUS")
public class CdRatesStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long amtCltd;
	private Long maa;
	private Long totalCDs;
	private Long ads;
	private Date startDate;
	private Date endDate;
	private String createdBy;
	private String updatedBy;

	public CdRatesStatus() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAmtCltd() {
		return amtCltd;
	}

	public void setAmtCltd(Long amtCltd) {
		this.amtCltd = amtCltd;
	}

	public Long getMaa() {
		return maa;
	}

	public void setMaa(Long maa) {
		this.maa = maa;
	}

	public Long getTotalCDs() {
		return totalCDs;
	}

	public void setTotalCDs(Long totalCDs) {
		this.totalCDs = totalCDs;
	}

	public Long getAds() {
		return ads;
	}

	public void setAds(Long ads) {
		this.ads = ads;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "CdRatesStatus [id=" + id + ", amtCltd=" + amtCltd + ", maa=" + maa + ", totalCDs=" + totalCDs + ", ads="
				+ ads + ", startDate=" + startDate + ", endDate=" + endDate + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + "]";
	}

}
