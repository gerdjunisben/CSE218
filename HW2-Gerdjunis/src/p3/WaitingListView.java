package p3;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class WaitingListView {
private HBox root;
private static Pane waitingListView;
	public WaitingListView() throws Exception
	{
		
		TextArea showArea = new TextArea();
		showArea.setMaxSize(200, 200);
		TextArea showArea2 = new TextArea();
		showArea2.setMaxSize(200, 200);
		

		HBox showBox = new HBox(47);
		showBox.setAlignment(Pos.CENTER);
		showBox.getChildren().add(showArea);
		showBox.getChildren().add(showArea2);
		
		Button okButton = new Button("a button");
		okButton.setMaxSize(60, 60);
		
		
		okButton.setOnAction((e)->{
			String str1 = "Accepted List \n";
			String str2 = "Waiting List \n";
			int count = 0;
			
			while(!QueueHolder.queue.isEmpty())
			{
				if(count < 5)
				{
					str1 +=QueueHolder.queue.remove().toString() + "\n";
				}
				else
				{
					str2 += QueueHolder.queue.remove().toString() + "\n";
				}
				count++;
			}
			
			showArea.appendText(str1);
			showArea2.appendText(str2);
			});
		
	
		root = new HBox(47);
		root.setAlignment(Pos.CENTER);
		root.getChildren().add(showBox);

		root.getChildren().add(okButton);
		waitingListView = new Pane(root);
	}
		
		
		public static Pane getView() throws Exception
		{
			if(waitingListView !=null)
				return waitingListView ;
			else
			{
				new WaitingListView();
				return waitingListView ;
			}
		}
}
