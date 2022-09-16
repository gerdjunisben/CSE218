package p4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Demo extends Application {
	public static BorderPane root;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			//--module-path "C:\Program Files\Java\Javafx-sdk-17.0.1\lib" --add-modules=javafx.controls,javafx.fxml
			
			
			
			
			
			root = new BorderPane();
			Scene scene = new Scene(root,400,300);
			primaryStage.setScene(scene);
			setView(ButtonView.getView());
			primaryStage.show();
			
		
			
			
		}
		
		public static void setView(Pane pane)
		{
			root.setCenter(pane);
		}

}

