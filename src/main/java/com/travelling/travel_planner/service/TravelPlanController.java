package com.travelling.travel_planner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelling.travel_planner.dto.TravelRequest;
import com.travelling.travel_planner.dto.TravelResponse;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api")
public class TravelPlanController {

	@Autowired
	private TravelPlanService travelPlanService;
	
	@Autowired
    private TravellPlanService2 travelPlanService2;

	
//	@PostMapping("/plan")
//    public ResponseEntity<TravelResponse> getPlan(@RequestBody TravelRequest request) {
//        return ResponseEntity.ok(travelPlanService.generatePlan(request));
//    }
	
	
	
//    @PostMapping("/generate")
//    public ResponseEntity<TravelResponse> generateTravelPlan(@RequestBody TravelRequest request) {
//        TravelResponse response = travelPlanService2.generatePlan(request);
//        return ResponseEntity.ok(response);
//    }
    
    
    
    @PostMapping("/travel-plan")
    public ResponseEntity<TravelResponse> getPlan(@RequestBody TravelRequest request) {
        TravelResponse travelPlan = travelPlanService2.generatePlanByJsonNew(request);
        return ResponseEntity.ok(travelPlan);
    }
    
    
    @GetMapping("/get-message")
    public ResponseEntity<String> getData(){
    	return ResponseEntity.ok("This is the Demo data");
    }
    
}
