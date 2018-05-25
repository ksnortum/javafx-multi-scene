package net.snortum.javafx.multiscene.view;

import javafx.scene.Scene;

/** Guarantees that the method {@link #getScene()} is present */ 
public interface ViewMaker {
	
	/**
	 * Build and return a scene for this view
	 * 
	 * @return the Scene for this view
	 */
	Scene getScene();
}
