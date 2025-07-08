package com.travelling.travel_planner.dto;

import lombok.Data;

@Data
public class Accommodation {
	private String hotelName;
    private String type;
    private String address;
    private String checkInTime;
    private String checkOutTime;
}
