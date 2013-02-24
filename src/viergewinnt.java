/*-
 * Datei: viergwinnt.java
 * Thema: 4 gewinnt
 * Autor: Martin Eberle
 * Datum: 22.02.2013
 */ 

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Demo to show standard event handling. 
 * A light that can be switched on and off.
 */
public class viergewinnt extends Application
{	@Override
	public void start(Stage stage) throws Exception
	{	Pane root = new  Pane();
		
		Font font = Font.font("Futura", FontWeight.NORMAL, 40);
		
		Label lbAppName = new Label("4 gewinnt");
		lbAppName.setFont(font);
		lbAppName.relocate(110, 10);
		root.getChildren().add(lbAppName);
		
		final Circle light = new Circle();
		light.setRadius(40);
		light.setFill(Color.YELLOW);
		light.setStroke(Color.BLACK);
		light.setStrokeWidth(3);
		light.relocate(155, 80);
		root.getChildren().add(light);		
		
		Button btSwitchOn = new Button("Ein");
		btSwitchOn.setFont(font);
		btSwitchOn.setMinWidth(70);
		btSwitchOn.relocate(60, 200);
		btSwitchOn.setFocusTraversable(false);
		root.getChildren().add(btSwitchOn);
			
		Button btSwitchOff = new Button("Aus");
		btSwitchOff.setFont(font);
		btSwitchOff.setMinWidth(70);
		btSwitchOff.relocate(210, 200);
		btSwitchOff.setFocusTraversable(false);
		root.getChildren().add(btSwitchOff);
		
		Button btExit = new Button("Beenden");
		btExit.setFont(font);
		btExit.setMinWidth(280);
		btExit.relocate(60, 300);
		btExit.setFocusTraversable(false);		
		root.getChildren().add(btExit);
		
		//btExit.setOnAction(new viergewinntEventHandler()); 
		
		btSwitchOn.setOnAction(new EventHandler<ActionEvent>() 
		{	@Override
			public void handle(ActionEvent e) 
			{	light.setFill(Color.YELLOW);
			}
		});
			
		btSwitchOff.setOnAction(new EventHandler<ActionEvent>() 
		{	@Override
			public void handle(ActionEvent e) 
			{	light.setFill(Color.BLACK);
			}
		});
		
		Scene scene = new Scene(root, 400, 400);
		stage.setX(640);
		stage.setY(300);
		stage.setScene(scene);
		stage.show();		
	}

	public static void main(String[] args)
	{	Application.launch(args);
	}
}