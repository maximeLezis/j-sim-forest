package model;

public class GridModel {
	
	private int width;
	private int height;
	private CellModel[][] cells;
	
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
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
