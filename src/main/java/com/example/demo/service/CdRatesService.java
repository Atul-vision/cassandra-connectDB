package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CdHistoryRatesDTO;
import com.example.demo.model.CdManagerHistoryRatesDTO;
import com.example.demo.model.CdManagerRatesDTO;
import com.example.demo.model.CdRatesDTO;

public interface CdRatesService {
	
	public List<CdRatesDTO> getData(int zipCode);

	List<CdManagerRatesDTO> getManagerData(int zipCode);

	List<CdHistoryRatesDTO> getHistoryData(int zipCode);

	List<CdManagerHistoryRatesDTO> getManagerHistoryData(int zipCode);

}
