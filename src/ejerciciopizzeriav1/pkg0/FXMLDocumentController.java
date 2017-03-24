/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopizzeriav1.pkg0;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {
    ObservableList<String>tiposTamano=FXCollections.observableArrayList("Pequeña","Mediana","Familiar");
    ToggleGroup grupo = new ToggleGroup();
    double precioTotalDouble=0;
    double multiplicadorTamaño=1.15;
    double doublemasa;
    double doublePizza;
    String tamaño;
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
    private ComboBox<String> desplegableTamaño;
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
    @FXML
    private Label labelPizza;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image image = new Image("file:2020a7aab3832ed9bcd056792c39dbdf_domino-dominos-pizza-clipart_210-210.png");
        this.DominosPizza.setImage(image);
        desplegableTamaño.setItems(tiposTamano);
        desplegableTamaño.setValue("Mediana");
        
    }    

    @FXML
    private void TipoDeMasa(ActionEvent event) {
        this.original.setToggleGroup(grupo);
        this.original.setUserData("Original");
        this.pan.setToggleGroup(grupo);
        this.pan.setUserData("Pan");
        this.finizzima.setToggleGroup(grupo);
        this.finizzima.setUserData("Finízzima");
        this.dominosroll.setToggleGroup(grupo);
        this.dominosroll.setUserData("Domino's Roll");
        this.cabraroll.setToggleGroup(grupo);
        this.cabraroll.setUserData("Cabra & Roll");
        if(this.grupo.getSelectedToggle().getUserData().equals("Original")){
            this.DescripcionMasa1.setText("Para aquellos amantes \n del auténtico sabor \n de la pizza Domino's");
            doublemasa=1;
        }if(this.grupo.getSelectedToggle().getUserData().equals("Pan")){
            this.DescripcionMasa1.setText("Al más puro \n estilo Chicago");
            doublemasa=1;
        }
        if(this.grupo.getSelectedToggle().getUserData().equals("Finízzima")){
            this.DescripcionMasa1.setText("La masa más \n fina y crujiente \n de Domino's");
            doublemasa=1;
        }if(this.grupo.getSelectedToggle().getUserData().equals("Domino's Roll")){
            this.DescripcionMasa1.setText("Con delicioso borde \n relleno de queso");
            doublemasa=2;
        }if(this.grupo.getSelectedToggle().getUserData().equals("Cabra & Roll")){
            this.DescripcionMasa1.setText("Borde relleno de \n queso de cabra fundido");
            doublemasa=2;
        }
    }

    @FXML
    private void seleccionPizza(ActionEvent event) {
        List<String> choices = new ArrayList<>();

            choices.add("Margarita");
            choices.add("Cheesix");
            choices.add("Pulled Beef");
            choices.add("Pulled Pork");
            choices.add("Barbacoa");
            choices.add("Pecado Carnal");
            choices.add("Cremozza BBQ");
            choices.add("Cremozza Estilo Bourbon");
            choices.add("Carbonara");
            choices.add("Pollo a la Parrilla");
            choices.add("Cuatro Quesos");
            choices.add("Hawaiana Plus");
            choices.add("Extravaganzza");
            choices.add("Pata Negra");
            choices.add("Campiña");
            choices.add("Tony Pepperoni");

            ChoiceDialog<String> dialog = new ChoiceDialog<>("Margarita", choices);
            dialog.setTitle("Domino's Pizza");
            dialog.setHeaderText("Selección de Pizza");
            dialog.setContentText("Elije tu pizza:");

            Optional<String> result = dialog.showAndWait();
            if(result.get().equals("Margarita")){
              doublePizza=6;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Cheesix")){
              doublePizza= 8;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
             if(result.get().equals("Pulled Beef")){
              doublePizza=8;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Pulled Pork")){
              doublePizza= 8;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Barbacoa")){
              doublePizza=7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Pecado Carnal")){
              doublePizza= 7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
             if(result.get().equals("Cremozza BBQ")){
              doublePizza=7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Cremozza Estilo Bourbon")){
              doublePizza= 7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Carbonara")){
              doublePizza=7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Pollo a la Parrilla")){
              doublePizza= 7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
             if(result.get().equals("Cuatro Quesos")){
              doublePizza=7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Hawaiana Plus")){
              doublePizza= 7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Extravaganzza")){
              doublePizza=7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Pata Negra")){
              doublePizza= 7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
             if(result.get().equals("Campiña")){
              doublePizza=7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
            if(result.get().equals("Tony Pepperoni")){
              doublePizza= 7;
             this.labelPizza.setText("Tu elección: " + result.get());
            }
    }

    @FXML
    private void botonCalcularPedido(ActionEvent event) {
    }

    @FXML
    private void seleccionTamaño(ActionEvent event) {
        String seleccion=desplegableTamaño.getValue();
          if (seleccion.equals("Pequeña")) {
            String tamaño="Pequeña";
            labelPersonas.setText("1");
            multiplicadorTamaño=1.00;
        } if (seleccion.equals("Mediana")) {
            String tamaño="Mediana";
            labelPersonas.setText("2"); 
            multiplicadorTamaño=1.15;
        }if (seleccion.equals("Familiar")) {
            String tamaño="Familiar";
            labelPersonas.setText("4");
            multiplicadorTamaño=1.30;
        } 
    }
    
}
