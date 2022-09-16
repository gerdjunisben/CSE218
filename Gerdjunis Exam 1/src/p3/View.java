package p3;

import java.io.PrintWriter;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class View {
private HBox root;
private static Pane view;
private LinkedLinkedLists list;
	
	public View() throws Exception
	{
	
		list  = new LinkedLinkedLists();
		list.readFile(FileHolder.inputFile);
		
		Label label = new Label("(format:word size)");
		
		TextField sizeField = new TextField();
		sizeField.setPromptText("ENTER WORD and SIZE (format:word size)");
		
		Button okButton = new Button("ok");
		okButton.setMaxSize(60, 60);
		
		TextArea tb = new TextArea();
		
		
		okButton.setOnAction((e)->{
			tb.clear();
			String str = sizeField.getText();
			String word = str.substring(0,str.indexOf(' '));
			int number = Integer.parseInt(str.substring(str.indexOf(' ') + 1));
			String text = list.generate(number,word);
			tb.appendText(text);
			try
			{
				PrintWriter pw = new PrintWriter(FileHolder.outputFile);
				pw.println(text);
				pw.close();
			}
			catch(Exception c)
			{
				c.printStackTrace();
			}
		});
		
		VBox box = new VBox(47);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(label,sizeField,okButton,tb);
		
		
		
		
		
	
		
	
		root = new HBox(47);
		root.setAlignment(Pos.CENTER);
		root.getChildren().add(box);
		view = new Pane(root);
	}
	
	
	public static Pane getView() throws Exception
	{
		if(view!=null)
			return view;
		else
		{
			new View();
			return view;
		}
	}
}

