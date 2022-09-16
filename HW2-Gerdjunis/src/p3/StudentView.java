package p3;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class StudentView {
private HBox root;
private static Pane studentView;
	
	public StudentView() throws Exception
	{
	
		
		TextField nameField = new TextField();
		nameField.setPromptText("ENTER NAME");
		TextField phoneField = new TextField();
		phoneField.setPromptText("ENTER PHONE NUMBER");
		TextField majorField = new TextField();
		majorField.setPromptText("ENTER MAJOR");
		
		VBox fieldBox = new VBox(47);
		fieldBox.setAlignment(Pos.CENTER);
		fieldBox.getChildren().addAll(nameField,phoneField,majorField);
		
		
		Button okButton = new Button("Insert");
		okButton.setMaxSize(60, 60);
		
		
		okButton.setOnAction((e)->{
			QueueHolder.queue.insert(new Student(nameField.getText(), phoneField.getText(), majorField.getText()));
		});
		
		Button nextButton = new Button("Next");
		nextButton.setMaxSize(60, 60);
		
		
		nextButton.setOnAction((e)->{
			try {
				Demo.setView(WaitingListView.getView());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		
		
		
		VBox buttonBox = new VBox(47);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().add(okButton);
		buttonBox.getChildren().add(nextButton);
		
		
	
		
	
		root = new HBox(47);
		root.setAlignment(Pos.CENTER);
		root.getChildren().add(fieldBox);
		root.getChildren().add(buttonBox);
		studentView = new Pane(root);
	}
	
	
	public static Pane getView() throws Exception
	{
		if(studentView!=null)
			return studentView;
		else
		{
			new StudentView();
			return studentView;
		}
	}
}

