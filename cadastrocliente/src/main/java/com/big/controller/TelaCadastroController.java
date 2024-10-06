package com.big.controller;

import java.text.ParseException;

import com.big.model.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class TelaCadastroController {

    @FXML
    private Button btnCadastrar;

    @FXML
    private DatePicker datePickerClient;

    @FXML
    private TextField textFieldClientCPF;

    @FXML
    private TextField textFieldClientEmail;

    @FXML
    private TextField textFieldClientName;

    @FXML
    private TextField textFieldClientPhone;

    @FXML
    void btnOnAction(ActionEvent event) throws ParseException {
        Client cliente = new Client(textFieldClientCPF.getText(), datePickerClient.getValue(),textFieldClientEmail.getText()
        , textFieldClientName.getText(),textFieldClientPhone.getText());
        System.out.println(cliente.toString());

    }

}
