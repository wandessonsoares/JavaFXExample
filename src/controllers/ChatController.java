package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import models.TableModel;

public class ChatController implements Initializable{
	
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
    private TableView<TableModel> tbOnline;
    
    @FXML
    private TableColumn tcUsuarios;
    
    @FXML
    private Label lbNome;


    @FXML
    void atualizar(MouseEvent event) {
//    	ObservableList<TableModel> usuarios = FXCollections.observableArrayList();
//    	usuarios.add(new TableModel("wandesson"));
//    	usuarios.add(new TableModel("alex"));
//    	usuarios.add(new TableModel("luciano"));
//    	
//    	tcUsuarios.setCellValueFactory(new PropertyValueFactory("nome"));
//    	
//    	tbOnline.setItems(usuarios);
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
    	ObservableList<TableModel> usuarios = FXCollections.observableArrayList();
    	usuarios.add(new TableModel("wandesson"));
    	usuarios.add(new TableModel("alex"));
    	usuarios.add(new TableModel("luciano"));
    	
    	tcUsuarios.setCellValueFactory(new PropertyValueFactory("nome"));
    	
    	tbOnline.setItems(usuarios);
    }
    
    @FXML
    void editarNome(MouseEvent event) {
    	System.out.println("editar nome");
    }
}

