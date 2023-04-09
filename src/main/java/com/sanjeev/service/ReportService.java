package com.sanjeev.service;

import java.util.List;

import com.sanjeev.entity.CitizenPlan;
import com.sanjeev.request.SearchRequest;

public interface ReportService {

	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
	
	
	
	
}
