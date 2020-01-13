package application;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/Sample.fxml"));
			Scene scene = new Scene(root,1200,600);
			scene.getStylesheets().add(getClass().getResource("../view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
			BorderPane root = new BorderPane();
			root.setPadding(new Insets(15, 20, 10, 10));
			
			// LEFT
			//Button btnLeft = new Button("Left");
			Pane paneLeft = new Pane();
			//btnLeft.setPadding(new Insets(5, 5, 5, 5));
			paneLeft.setStyle("-fx-background-color: #000000");
			//root.setLeft(btnLeft);
			root.setLeft(paneLeft);
			//BorderPane.setMargin(btnLeft, new Insets(10, 10, 10, 10));
			BorderPane.setMargin(paneLeft, new Insets(10, 10, 10, 10));
			
			// CENTER
		    Button btnCenter = new Button("Center");
		    btnCenter.setPadding(new Insets(5, 5, 5, 5));
		    root.setCenter(btnCenter);
		    BorderPane.setAlignment(btnCenter, Pos.BOTTOM_CENTER);
		    
		    Scene scene = new Scene(root, 1200, 600);
		    primaryStage.setTitle("BorderPane Layout Demo");
		    primaryStage.setScene(scene);
		    primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}



/*public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("../view/Sample.fxml"));
			//Scene scene = new Scene(root,1200,600);
			//scene.getStylesheets().add(getClass().getResource("../view/application.css").toExternalForm());
			//primaryStage.setScene(scene);
			//primaryStage.show();
			GridPane grid = new GridPane();
			Scanner sc = new Scanner(System.in);
			System.out.println("Saisissez la taille du plateau (entrez une valeur puisque cela sera un carré) : ");
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			for (int row = 0; row < (i + 1); row++) {
				for (int col = 0; col < (j + 1); col++) {
					if (row != i) {
						Rectangle rec = new Rectangle();
						rec.setWidth(10);
						rec.setHeight(10);
						if ((row % 2 == 0 && col % 2 == 0) || (row % 2 != 0 && col % 2 != 0)) {
							rec.setFill(Color.RED);
						} else {
							rec.setFill(Color.GREEN);
					}
						GridPane.setRowIndex(rec, row);
						GridPane.setColumnIndex(rec, col);
						grid.getChildren().addAll(rec);
					}
				}
			}

			Scene scene = new Scene(grid, (i+1)*10, (i+1)*10);

			primaryStage.setTitle("Jeu de foret");
			primaryStage.setScene(scene);

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}*/