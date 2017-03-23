/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopizzeriav1.pkg0;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    private Label label11;
    @FXML
    private Label tipoMasa11;
    @FXML
    private Label tipoMasa111;
    @FXML
    private RadioButton original;
    @FXML
    private RadioButton pan;
    @FXML
    private RadioButton finizzima;
    @FXML
    private RadioButton dominosroll;
    @FXML
    private RadioButton cabraroll;
    @FXML
    private TextArea DescripcionMasa1;
    @FXML
    private ImageView DominosPizza;
    @FXML
    private ComboBox<?> desplegableTamaño;
    @FXML
    private Label labelPersonas;
    @FXML
    private TextField nombrePedido;
    @FXML
    private Label labelMasa;
    @FXML
    private Label MasaElegida;
    @FXML
    private Label tipoPizza;
    @FXML
    private Label labelIngredientes;
    @FXML
    private Label labelTamaño;
    @FXML
    private Label pizzaElegida;
    @FXML
    private TextArea seleccionIngredientes;
    @FXML
    private Label tamañoElegido;
    @FXML
    private Label labelTotal;
    @FXML
    private Label precioMasa;
    @FXML
    private Label precioPizza;
    @FXML
    private Label precioIngredientes;
    @FXML
    private Label precioTamaño;
    @FXML
    private Label precioTotal;
    @FXML
    private Button calcularPedido;
    @FXML
    private Label label2;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void TipoDeMasa(ActionEvent event) {
    }

    @FXML
    private void seleccionPizza(ActionEvent event) {
    }

    @FXML
    private void botonCalcularPedido(ActionEvent event) {
    }
    
}
