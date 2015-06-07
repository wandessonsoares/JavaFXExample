package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Chat extends Application{
	public static Stage STAGE_CHAT;
	
	@Override
	public void start(Stage stage) throws Exception {
		STAGE_CHAT = stage;
		
		stage.setTitle("IFPB Messenger - Chat");
		
		Parent root = 
				FXMLLoader.load(getClass().getResource("chat.fxml"));
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
