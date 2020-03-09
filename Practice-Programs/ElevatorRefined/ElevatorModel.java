package com.ynap.assessment;

public class ElevatorModel {
	
	private int currentFloor;
	private String direction;
	
	public ElevatorModel(int currentFloor, String direction) {
		this.currentFloor = currentFloor;
		this.direction = direction;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
}
