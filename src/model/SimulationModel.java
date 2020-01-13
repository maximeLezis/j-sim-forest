package model;

import javafx.scene.layout.BorderPane;

public class SimulationModel extends BorderPane {
	
	private GridModel grid;
	private int numberOfSteps;
	private int speed;
	
	/**
	 * @return the grid
	 */
	public GridModel getGrid() {
		return grid;
	}
	
	/**
	 * @param grid the grid to set
	 */
	public void setGrid(GridModel grid) {
		this.grid = grid;
	}
	
	/**
	 * @return the numberOfSteps
	 */
	public int getNumberOfSteps() {
		return numberOfSteps;
	}
	
	/**
	 * @param numberOfSteps the numberOfSteps to set
	 */
	public void setNumberOfSteps(int numberOfSteps) {
		this.numberOfSteps = numberOfSteps;
	}
	
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
