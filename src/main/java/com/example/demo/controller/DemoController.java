
package com.example.demo.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cache.annotation.Cacheable;

import org.springframework.graphql.data.method.annotation.Argument;

import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.http.ResponseEntity;

import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.model.CdHistoryRatesDTO;

import com.example.demo.model.CdManagerHistoryRatesDTO;

import com.example.demo.model.CdManagerRatesDTO;

import com.example.demo.model.CdRates;

import com.example.demo.model.CdRatesDTO;

import com.example.demo.service.CdRatesService;
 
import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.media.ArraySchema;

import io.swagger.v3.oas.annotations.media.Content;

import io.swagger.v3.oas.annotations.media.Schema;

import io.swagger.v3.oas.annotations.responses.ApiResponse;

import io.swagger.v3.oas.annotations.responses.ApiResponses;

import io.swagger.v3.oas.annotations.tags.Tag;
 
@Tag(name = "Certified Deposits", description = "Certified Deposits APIs")

@RestController

public class DemoController {
 
	@Autowired

	CdRatesService cdRatesService;
 
	@Operation(summary = "Get a Customer rates", description = "Returns a CD Rates for Customer")

	@ApiResponses({ @ApiResponse(responseCode = "200", content = {

			@Content(array = @ArraySchema(schema = @Schema(implementation = CdRates.class)), mediaType = "application/json") }),

			@ApiResponse(responseCode = "404", description = "Resource Not Avaliable", content = {

					@Content(schema = @Schema()) }),

			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

					@Content(schema = @Schema()) }) })

	// @GetMapping("/customer/viewRates/{zipCode}")

	@QueryMapping("getCustomerRates")

	public List<CdRatesDTO> getCustomerRates(@Argument int zipCode) {

		return cdRatesService.getData(zipCode);
 
	}
 
	@Operation(summary = "Get a Manager rates", description = "Returns a CD Rates for Manager")

	@ApiResponses({ @ApiResponse(responseCode = "200", content = {

			@Content(array = @ArraySchema(schema = @Schema(implementation = CdRates.class)), mediaType = "application/json") }),

			@ApiResponse(responseCode = "404", description = "Resource Not Avaliable", content = {

					@Content(schema = @Schema()) }),

			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

					@Content(schema = @Schema()) }) })

	// @GetMapping("/branchManager/viewRates/{zipCode}")

	@QueryMapping("getManagerRates")

	public List<CdManagerRatesDTO> getManagerRates(@Argument int zipCode) {

		return cdRatesService.getManagerData(zipCode);
 
	}
 
	@Operation(summary = "Get a Customer History rates", description = "Returns a CD History Rates for Customer")

	@ApiResponses({

			@ApiResponse(responseCode = "200", content = {

					@Content(schema = @Schema(implementation = CdRates.class), mediaType = "application/json") }),

			@ApiResponse(responseCode = "404", description = "Zipcode Not Avaliable", content = {

					@Content(schema = @Schema()) }),

			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

					@Content(schema = @Schema()) }) })

	@Cacheable(value = "cusHis", key = "#zipCode")

	// @GetMapping("/customer/viewHistoryRates/{zipCode}")

	@QueryMapping("getCustomerHistoryRates")

	public List<CdHistoryRatesDTO> getCustomerHistoryRates(@Argument int zipCode) {
 
		return cdRatesService.getHistoryData(zipCode);
 
	}
 
	@Operation(summary = "Get a Manager History rates", description = "Returns a CD History Rates for Manager")

	@ApiResponses({

			@ApiResponse(responseCode = "200", content = {

					@Content(schema = @Schema(implementation = CdRates.class), mediaType = "application/json") }),

			@ApiResponse(responseCode = "404", description = "Zipcode Not Avaliable", content = {

					@Content(schema = @Schema()) }),

			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

					@Content(schema = @Schema()) }) })

	@Cacheable(value = "manHis", key = "#zipCode")

	// @GetMapping("/branchManager/viewHistoryRates/{zipCode}")

	@QueryMapping("getManagerHistoryRates")

	public List<CdManagerHistoryRatesDTO> getManagerHistoryRates(@Argument int zipCode) {
 
		return cdRatesService.getManagerHistoryData(zipCode);

	}

}
