package net.snortum.javafx.multiscene.view;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import net.snortum.javafx.multiscene.Main;

/**
 * This is the base for all views.
 * 
 * @author Knute Snortum
 * @version 2018-05-24
 */
public class ViewBase implements ViewMaker {

	private Stage stage;
	private String labelText;
	private EventHandler<? super MouseEvent> handler;

	/**
	 * Construct a view base.
	 * 
	 * @param stage the primary stage from {@link Main}
	 * @param labelText the text for the label
	 * @param handler the "back" button handler
	 */
	public ViewBase(Stage stage, String labelText, EventHandler<? super MouseEvent> handler) {
		if (stage == null) {
			throw new IllegalArgumentException("Stage cannot be null");
		}
		
		if (handler == null) {
			throw new IllegalArgumentException("Handler cannot be null");
		}
		
		this.stage = stage;
		this.labelText = labelText;
		this.handler = handler;
	}

	@Override
	public Scene getScene() {
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(10));
		Label label = new Label(labelText);
		label.setFont(new Font(32));
		root.setCenter(label);
		
		Button backButton = new Button("Back");
		backButton.setOnMousePressed(handler);
		Button closeButton = new Button("Close");
		closeButton.setOnMousePressed(e -> stage.close());
		
		ButtonBar bbar = new ButtonBar();
		bbar.setPadding(new Insets(10, 0, 0, 10));
		bbar.getButtons().addAll(backButton, closeButton);
		root.setBottom(bbar);

		return new Scene(root);
	}
}
