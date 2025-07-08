package com.travelling.travel_planner.dto;

import lombok.Data;

@Data
public class TotalCost {
	 private int travel;
	    private int accommodation;
	    private int food;
	    private int totalPerPerson;
}
