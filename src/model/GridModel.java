package model;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class GridModel extends GridPane {

	private int				width;
	private int				height;
	private CellModel[][]	cells;

	public GridModel(int width, int height) {
		this.width = width;
		this.height = height;
		this.cells = new CellModel[width][height];

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				cells[i][j] = new CellModel();
				cells[i][j].setWidth(10);
				cells[i][j].setHeight(10);
				cells[i][j].setFill(Color.AQUA); // test
			}
		}
	}

	/**
	 * @return the cells
	 */
	public CellModel[][] getCells() {
		return cells;
	}

	/**
	 * @param cells the cells to set
	 */
	public void setCells(CellModel[][] cells) {
		this.cells = cells;
	}

}
