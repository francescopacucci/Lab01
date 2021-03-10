/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.parole;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	Parole elenco;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader
    
    @FXML
    private TextArea txtTempi;


    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML
    void doInsert(ActionEvent event) {
         String s = txtParola.getText();
         elenco.addParola(s);
         String sa = "";
         String t ="";
         for(String sx : elenco.getElenco()) {
        	 sa = sa + sx + "\n";
        	 t=t+System.nanoTime()+"\n"; 
         }
         
         txtResult.setText(sa);
         txtTempi.setText(t);
    }
    
    @FXML // fx:id="btnRemove"
    private Button btnRemove; // Value injected by FXMLLoader
  

    @FXML
    void doReset(ActionEvent event) {
        elenco.reset();
        txtResult.setText("");
    }
    
    @FXML
    void angelo(ActionEvent event) {
    	String s = txtParola.getText();
    	elenco.removeParola(s);
    	String sa = "";
        for(String sx : elenco.getElenco())
       	 sa = sa + sx + "\n";
    	txtResult.setText(sa);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco =new Parole();
    }
}
