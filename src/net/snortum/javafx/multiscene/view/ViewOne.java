package net.snortum.javafx.multiscene.view;

import javafx.stage.Stage;

import net.snortum.javafx.multiscene.controller.ViewOneController;

/**
 * Creates and returns the scene for the first view.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class ViewOne extends ViewBase {

	/** Must inject a stage */
	public ViewOne(Stage stage) {
		super(stage, "This is scene 1", e -> new ViewOneController(stage).handleMousePress(e));
	}

}
