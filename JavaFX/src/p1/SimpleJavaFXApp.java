package p1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("Hello World!");
		Button button = new Button("Button");
		HBox pane = new HBox(30);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(button,label);
		Scene scene = new Scene(pane, 300, 80);
		primaryStage.setScene(scene);
		primaryStage.setTitle("My First Window");
		primaryStage.show();
	}

}
