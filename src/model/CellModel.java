package model;

import javafx.scene.shape.Rectangle;

public class CellModel extends Rectangle {
	
	private int age = 0;
	private enum cellStates {
		EMPTY,
		YOUNG_SHOOT,
		SHRUB,
		TREE,
		ON_FIRE,
		ASHES,
		INFECTED
	}

}
