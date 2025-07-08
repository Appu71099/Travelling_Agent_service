package com.travelling.travel_planner.dto;

import java.util.List;

import lombok.Data;

@Data
public class DayPlan {
	 private String day;
	    private String date;
	    private String location;
	    private String about;
	    private List<String> activities;
	    private Accommodation accommodation;
	    private CostDetails costs;
}
