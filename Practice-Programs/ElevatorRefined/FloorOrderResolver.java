package com.ynap.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import static com.ynap.assessment.ElevatorConstants.ELEVATOR_DOWNWARD_DIRECTION;
import static com.ynap.assessment.ElevatorConstants.ELEVATOR_UPWARD_DIRECTION;
import static com.ynap.assessment.ElevatorConstants.TOP_FLOOR;
import static com.ynap.assessment.ElevatorConstants.LOWEST_FLOOR;

/**
 * 
 * @author h.sinha
 *
 */
public class FloorOrderResolver {
	
	private ElevatorModel elevator;
	private Set<Integer> floors;
	
	public FloorOrderResolver(ElevatorModel elevator, Set<Integer> floors) {
		this.elevator = elevator;
		this.floors = floors;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Integer> getFloorsInOrder() {
		
		List<Integer> sequence = new ArrayList<>(floors);
		
		if(elevator.getDirection().equalsIgnoreCase(ELEVATOR_UPWARD_DIRECTION)) {
			
			if(elevator.getCurrentFloor() == LOWEST_FLOOR) {
				return sequence.subList(1, sequence.size());
			} else {
				sequence = getReorderedFloors(sequence,ELEVATOR_DOWNWARD_DIRECTION);
			}
			
		} else if(elevator.getDirection().equalsIgnoreCase(ELEVATOR_DOWNWARD_DIRECTION)) {
			
			if(elevator.getCurrentFloor() == TOP_FLOOR) {
				return sequence.subList(1, sequence.size());
			} else {
				sequence = getReorderedFloors(sequence,ELEVATOR_UPWARD_DIRECTION);
			}
		}
		
		return sequence;
	}
	
	/**
	 * 
	 * @param sequence
	 * @param returnDirection
	 * @return
	 */
	private List<Integer> getReorderedFloors(List<Integer> sequence, String returnDirection) {
		
		List<Integer> subList1 = sequence.subList(sequence.indexOf(elevator.getCurrentFloor())+1, 
								sequence.size());
		
		elevator.setDirection(returnDirection);
		
		Set<Integer> subSet = new TreeSet<Integer>(new FloorComparator(elevator));
		
		for(Integer number : sequence) {
			
			if(number.intValue() == elevator.getCurrentFloor()) {
				break;
			}
			subSet.add(number);	
		}
		
		subList1.addAll(subSet);
		return subList1;
	}
}
