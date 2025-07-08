package com.travelling.travel_planner.dto;

import java.util.List;

import lombok.Data;

@Data

public class TravelRequest {

	private String destination;
    private int days;
    private List<String> interests;
}
