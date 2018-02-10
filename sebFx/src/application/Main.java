package application;
	
import controls.WindowResizeButton;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	private WindowResizeButton windowResizeButton;
	private Scene scene;
	@Override
	public void start(Stage stage) {
	
		try {
			StackPane layerPane = new StackPane();
			BorderPane root = new BorderPane();
			 stage.initStyle(StageStyle.UNDECORATED);
	            // create window resize button
	            windowResizeButton = new WindowResizeButton(stage, 1020,700);
	            // create root
	            root = new BorderPane() {
	                @Override protected void layoutChildren() {
	                    super.layoutChildren();
	                    windowResizeButton.autosize();
	                    windowResizeButton.setLayoutX(getWidth() - windowResizeButton.getLayoutBounds().getWidth());
	                    windowResizeButton.setLayoutY(getHeight() - windowResizeButton.getLayoutBounds().getHeight());
	                }
	            };
	            root.getStyleClass().add("application");
	      
	
	        root.setId("root");
	        scene = new Scene(layerPane, 1020, 700, false);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			/*primaryStage.setScene(scene);
			primaryStage.show();*/
			
			// show stage
	        stage.setScene(scene);
	        stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
