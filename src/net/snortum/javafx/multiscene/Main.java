package net.snortum.javafx.multiscene;

import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import net.snortum.javafx.multiscene.model.SceneName;
import net.snortum.javafx.multiscene.view.MainView;
import net.snortum.javafx.multiscene.view.ViewOne;
import net.snortum.javafx.multiscene.view.ViewThree;
import net.snortum.javafx.multiscene.view.ViewTwo;

/**
 * Builds all scenes and display the main one.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class Main extends Application {
	
	/** Holds the various scenes to switch between */
	private static Map<SceneName, Scene> scenes = new HashMap<>();
	
	@Override
	public void start(Stage stage) {
		
		// Create and store all scenes up front
		scenes.put(SceneName.MAIN, new MainView(stage).getScene());
		scenes.put(SceneName.SCENE1, new ViewOne(stage).getScene());
		scenes.put(SceneName.SCENE2, new ViewTwo(stage).getScene());
		scenes.put(SceneName.SCENE3, new ViewThree(stage).getScene());
		
		// Start with the main scene
		stage.setScene(scenes.get(SceneName.MAIN));
		stage.setTitle("Multi-Scene Demo");
		stage.show();
	}

	/** Returns a Map of the scenes by {@link SceneName} */
	public static Map<SceneName, Scene> getScenes() {
		return scenes;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
