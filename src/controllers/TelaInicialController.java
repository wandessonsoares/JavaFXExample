package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import views.Chat;
import views.TelaInicial;

public class TelaInicialController {

    @FXML
    private Button btEntrar;

    @FXML
    private TextField txIpServidor;

    @FXML
    private TextField txNome;

    @FXML
    void entrar(ActionEvent event) {
    	try {
			new Chat().start(new Stage());
			TelaInicial.STAGE.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void enter(ActionEvent event) {
    	System.out.println("enter");
    }

}