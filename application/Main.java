package application;
	

import java.io.FileInputStream;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label greetingLabel = new Label("Hello World!");
			Label cs400 = new Label("CS400 MyFirstJavaFX");
			ObservableList<String> options = FXCollections.observableArrayList("Option 1", "Option 2", "Option 3");
			final ComboBox comboBox = new ComboBox(options);
			Image image = new Image(new FileInputStream("CNTowerPortrait.jpg"));
			ImageView imageView = new ImageView(image);
			Button button = new Button("Done");
			ObservableList<String> choices = FXCollections.observableArrayList("Choice 1", "Choice 2", "Choice 3");
			final ComboBox comboBox2 = new ComboBox(choices);
			
			BorderPane root = new BorderPane();
			root.setTop(greetingLabel);
			root.setTop(cs400);
			root.setLeft(comboBox);
			root.setRight(comboBox2);
			root.setCenter(imageView);
			root.setBottom(button);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Colin's First JavaFX program");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
