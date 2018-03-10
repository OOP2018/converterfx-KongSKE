package converter;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/**
 * Main class to run Application.
 * 
 * @author Varit Assavavisidchai
 *
 */
public class Main extends Application {
	
	/**
	 * Run Application
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * for run method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
