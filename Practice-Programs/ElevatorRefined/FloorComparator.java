package com.ynap.assessment;

import java.util.Comparator;
import static com.ynap.assessment.ElevatorConstants.ELEVATOR_UPWARD_DIRECTION;

public class FloorComparator implements Comparator<Integer>{
	
	private ElevatorModel elevator;
	
	FloorComparator(ElevatorModel elevator) {
		this.elevator = elevator;
	}
	
	@Override
	public int compare(Integer e1, Integer e2) {
		
		if(elevator.getDirection().equalsIgnoreCase(ELEVATOR_UPWARD_DIRECTION)) {
			return e1.compareTo(e2);
		} else {
			return e2.compareTo(e1);
		}
	}
}
