package net.snortum.javafx.multiscene.controller;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import net.snortum.javafx.multiscene.Main;
import net.snortum.javafx.multiscene.model.SceneName;

/**
 * Pressing a button displays the different scenes.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class MainController {

	private Stage stage;
	
	/** Inject the stage from {@link Main} */
	public MainController(Stage stage) {
		this.stage = stage;
	}

	/** Display the first scene */
	public void handleOnPressButton1(MouseEvent event) {
		stage.setScene(Main.getScenes().get(SceneName.SCENE1));
	}
	
	/** Display the second scene */
	public void handleOnPressButton2(MouseEvent event) {
		stage.setScene(Main.getScenes().get(SceneName.SCENE2));
	}
	
	/** Display the third scene */
	public void handleOnPressButton3(MouseEvent event) {
		stage.setScene(Main.getScenes().get(SceneName.SCENE3));
	}
}
