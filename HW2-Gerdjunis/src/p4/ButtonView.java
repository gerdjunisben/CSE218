package p4;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ButtonView {
	private HBox root;
	private static Pane buttonView;
	private MyStack stack = new MyStack(9);
	private boolean[] clicked = new boolean[9];
		
		public ButtonView() throws Exception
		{
		
			
			
			
			
			Button[] buttons = new Button[9];
			VBox buttonBox = new VBox(47);
			buttonBox.setAlignment(Pos.CENTER);
			HBox[] horizontalBoxes = new HBox[3];
			horizontalBoxes[0] = new HBox(47);
			horizontalBoxes[1] = new HBox(47);
			horizontalBoxes[2] = new HBox(47);
			
			for(int x =0;x<buttons.length;x++)
			{
				buttons[x] = new Button();
				buttons[x].setMinSize(60, 60);

				buttons[x].setStyle("-fx-background-color: #000000");
				
				
				if(x<3)
					horizontalBoxes[0].getChildren().add(buttons[x]);
				else if(x<6)
					horizontalBoxes[1].getChildren().add(buttons[x]);
				else
					horizontalBoxes[2].getChildren().add(buttons[x]);
			}
			
			Button backTrackButton = new Button("BackTrack");
			backTrackButton.setMinSize(60, 60);
			
			horizontalBoxes[0].getChildren().add(backTrackButton);
			
			buttonBox.getChildren().addAll(horizontalBoxes[0],horizontalBoxes[1],horizontalBoxes[2]);
			
			
			buttons[0].setOnAction((e)->{
				if(!clicked[0])
				{
					buttons[0].setStyle("-fx-background-color: #ff0000");
					stack.push(0);
					clicked[0] = true;
				}
			});
			
			buttons[1].setOnAction((e)->{
				if(!clicked[1])
				{
					buttons[1].setStyle("-fx-background-color: #ff0000");
					stack.push(1);
					clicked[1] = true;
				}
			});
			
			buttons[2].setOnAction((e)->{
				if(!clicked[2])
				{
					buttons[2].setStyle("-fx-background-color: #ff0000");
					stack.push(2);
					clicked[2] = true;
				}
			});
			
			buttons[3].setOnAction((e)->{
				if(!clicked[3])
				{
					buttons[3].setStyle("-fx-background-color: #ff0000");
					stack.push(3);
					clicked[3] = true;
				}
			});
			
			buttons[4].setOnAction((e)->{
				if(!clicked[4])
				{
					buttons[4].setStyle("-fx-background-color: #ff0000");
					stack.push(4);
					clicked[4] = true;
				}
			});
			
			buttons[5].setOnAction((e)->{
				if(!clicked[5])
				{
					buttons[5].setStyle("-fx-background-color: #ff0000");
					stack.push(5);
					clicked[5] = true;
				}
			});
			
			buttons[6].setOnAction((e)->{
				if(!clicked[6])
				{
					buttons[6].setStyle("-fx-background-color: #ff0000");
					stack.push(6);
					clicked[6] = true;
				}
			});
			
			buttons[7].setOnAction((e)->{
				if(!clicked[7])
				{
					buttons[7].setStyle("-fx-background-color: #ff0000");
					stack.push(7);
					clicked[7] = true;
				}
			});
			
			buttons[8].setOnAction((e)->{
				if(!clicked[8])
				{
					buttons[8].setStyle("-fx-background-color: #ff0000");
					stack.push(8);
					clicked[8] = true;
				}
			});
			
			backTrackButton.setOnAction((e)->{
				int i = stack.pop();
				if(i == -1)
				{
					backTrackButton.setText("No more red");
				}
				else
				{
					backTrackButton.setText("BackTrack");
					buttons[i].setStyle("-fx-background-color: #000000");
					clicked[i] = false;
				}
			});
			
			
		
			
			
			
			
			
			
		
			
		
			root = new HBox(47);
			root.setAlignment(Pos.CENTER);
			root.getChildren().add(buttonBox);
			buttonView = new Pane(root);
		}
		
		
		public static Pane getView() throws Exception
		{
			if(buttonView!=null)
				return buttonView;
			else
			{
				new ButtonView();
				return buttonView;
			}
		}
}
