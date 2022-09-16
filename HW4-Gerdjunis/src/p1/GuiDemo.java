package p1;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class GuiDemo extends Application {

	public static BorderPane root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//--module-path "C:\Program Files\Java\Javafx-sdk-17.0.1\lib" --add-modules=javafx.controls,javafx.fxml
		
		
		
		FileHolder.file = new File("output");
		MenuItem mi = new MenuItem("Set Output File");
		MenuBar mb = new MenuBar();
		Menu m = new Menu("File");
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
		mi.setOnAction(e->{
			FileHolder.file = fileChooser.showOpenDialog(primaryStage);
		});
		m.getItems().add(mi);
		mb.getMenus().add(m);
		root = new BorderPane();
		root.setTop(mb);
		Scene scene = new Scene(root,500,300);
		primaryStage.setScene(scene);
		setView(View.getView());
		primaryStage.show();
		
	
		
		
	}
	
	public static void setView(Pane pane)
	{
		root.setCenter(pane);
	}


}
