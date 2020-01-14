package controller;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import model.GridModel;

public class SimulationController {

	private BorderPane	mainContainer;
	private VBox		settingsPanel;
	private GridModel	simulationGrid;
	
	public SimulationController() {
		this.mainContainer = new BorderPane();
		this.settingsPanel = new VBox(5);
		this.simulationGrid = new GridModel(20, 20);
	}

}
