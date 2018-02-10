package application;
	
import controls.WindowResizeButton;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;



public class Main extends Application {
	
	private WindowResizeButton windowResizeButton;
	private Scene scene;
	@Override
	public void start(Stage primaryStage) {
	
		try {
			/*StackPane layerPane = new StackPane();
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
	        scene.setFill(Color.AQUAMARINE);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
			Connection connection = new Connection();
			String test = connection.connect();
			
			
			// show stage
	        //stage.setScene(scene);
	       // stage.show();
			
			primaryStage.setTitle("Hello World");
	        Group root = new Group();
	        Scene scene = new Scene(root, 300, 250, Color.LIGHTGREEN);
	        Button btn = new Button();
	        btn.setLayoutX(100);
	        btn.setLayoutY(80);
	        btn.setText("Hello World");
	        btn.setOnAction(new EventHandler<ActionEvent>() {

	            public void handle(ActionEvent event) {
	                System.out.println(test);
	            }
	        });
	        root.getChildren().add(btn);        
	        primaryStage.setScene(scene);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
