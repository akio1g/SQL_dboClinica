package gui;

import static application.Main.mudarTela;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CRUDMedicoController {
	@FXML
	TextField tfCodigo = new TextField();

	@FXML
	TextField tfNome = new TextField();

	@FXML
	TextField tfLogradouro = new TextField();

	@FXML
	TextField tfNumLogradouro = new TextField();

	@FXML
	TextField tfCep = new TextField();

	@FXML
	TextField tfComplemento = new TextField();

	@FXML
	TextField tfTelefone = new TextField();
	
	@FXML
	ComboBox cbEspecialidade = new ComboBox();

	@FXML
	Button btProcurar = new Button();

	@FXML
	Button btSalvar = new Button();

	@FXML
	Button btExcluir = new Button();

	@FXML
	Button btVoltar = new Button();

	@FXML
	public void BotaoVoltar() {
		mudarTela(0);
	}
}
