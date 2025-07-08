package com.travelling.travel_planner.dto;

import java.util.List;

import lombok.Data;

@Data
public class TravelPlanDto {

	private String city;
    private String country;
    private String description;
    private String currency;
    private TotalCost totalCost;
    private List<DayPlan> days;
}
