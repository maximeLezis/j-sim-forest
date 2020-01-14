package model;

import javafx.scene.shape.Rectangle;

public class CellModel extends Rectangle {

	private int age = 0;

	private enum cellStates {
		EMPTY(0), YOUNG_SHOOT(1), SHRUB(2), TREE(3), ON_FIRE(4), ASHES(5), INFECTED(6);

		private int state;

		public int getState() {
			return this.state;
		}

		private cellStates(int state) {
			this.state = state;
		}
	}

}
