// +++++++++++++++++++++++++++++++++++++++++++++
// In dieser Klasse teste ich mal ein bisschen
// JavaFx und werde nach und nach die GUI
// für unser viergewinnt basteln - Ruben
// +++++++++++++++++++++++++++++++++++++++++++++


//Import von JavaFX
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class guiMain extends Application {

	@Override
	public void start(Stage playboard) {
		
	// +++++++++++++++++++++++++++++++++++++++++++++
    // Layout des Spielbretts definieren
    // +++++++++++++++++++++++++++++++++++++++++++++
		
		//Raster festlegen
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER); //Inhalt wird zentriert
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		//Headline
		Text headline = new Text("viergewinnt // scream");
		headline.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(headline, 0, 0, 2, 1);
		
		//Layout in Scene implementieren
		Scene scene = new Scene(grid);
		
		
		
	// +++++++++++++++++++++++++++++++++++++++++++++
    // Eigenschaften der Anzeige (Stage) definieren
    // +++++++++++++++++++++++++++++++++++++++++++++
		
		//Größe des Fensters festlegen
		playboard.setWidth(1024);
		playboard.setHeight(768);
		playboard.setFullScreen(true); //gleich in Vollblildmodus springen
		playboard.setResizable(true); //Benutzer erlauben die Größe des Fensters anzupassen
		
		//Titel des Fensters definieren
		playboard.setTitle("viergewinnt - scream");
		
		//Spielbrett setzen
		playboard.setScene(scene); 
		playboard.sizeToScene(); //Größe des Spielbretts an die Stage anpassen
		
		//Spielbrett anzeigen
		playboard.show();
	}
	
	//Die Main-Klasse die letztendlich den Start-Befehl gibt
	public static void main(String[] args) {
		launch(args);
	}
}
