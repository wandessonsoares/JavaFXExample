package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ChatController {
	
	private StringBuffer msgs = new StringBuffer();
	
	@FXML
    private TextArea txChat;

    @FXML
    private Button btEnviar;

    @FXML
    private AnchorPane apChat;

    @FXML
    private AnchorPane apOnline;

    @FXML
    private TextField txMensagem;

    @FXML
    private Button btPrivado;
    
    @FXML
    private ImageView imgAtualizar;

    @FXML
    void atualizar(MouseEvent event) {
    	System.out.println("Clicou na imagem.");
    }
    
    @FXML
    void enviarMsgEnter(ActionEvent event) {
    	msgs.append("Olá! \n");
    	
    	txChat.setText(msgs.toString());
    }

    @FXML
    void enviarMsg(ActionEvent event) {
    	msgs.append("E ae meu brother blz? Tudo ok contigo?"
    			+ "conta as novidades! \n");
    	
    	txChat.setText(msgs.toString());
    }
    
    public void initialize(URL url, ResourceBundle rb){
    	txChat.setEditable(false);
    	txChat.setDisable(true);
    }

}

