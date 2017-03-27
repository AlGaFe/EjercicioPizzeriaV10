/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopizzeriav1.pkg0;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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

    ObservableList<String> tiposTamano = FXCollections.observableArrayList("Pequeña", "Mediana", "Familiar");
    Set<String> ingredientes = new HashSet<>();
    ToggleGroup masa = new ToggleGroup();
    double precioTotalDouble = 0;
    double multiplicadorTamaño = 1.15;
    double doublemasa = 0;
    double doublePizza = 0;
    String tamaño;
    double doubleIngrediente = 0;
    String stringIngrediente;
    String StipoPizza;
    String sMasa;
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
    @FXML
    private CheckBox ingredienteAceitunas;
    @FXML
    private CheckBox ingredienteAnchoas;
    @FXML
    private CheckBox ingredienteAtun;
    @FXML
    private CheckBox ingredientebacon;
    @FXML
    private CheckBox ingredienteCeballo;
    @FXML
    private CheckBox ingredienteMaiz;
    @FXML
    private CheckBox ingredientePepperoni;
    @FXML
    private CheckBox ingredientePimientoV;
    @FXML
    private CheckBox ingredienteTofu;
    @FXML
    private CheckBox ingredientePollo;
    @FXML
    private CheckBox ingredienteChampinon;
    @FXML
    private CheckBox ingredienteTernera;
    @FXML
    private CheckBox ingredienteJamonY;
    @FXML
    private CheckBox ingredienteTomate;
    @FXML
    private CheckBox ingredienteJamonS;
    @FXML
    private CheckBox ingredienteCebolla;
    @FXML
    private Button cancelarPedido;

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
        this.original.setToggleGroup(masa);
        this.original.setUserData("Original");
        this.pan.setToggleGroup(masa);
        this.pan.setUserData("Pan");
        this.finizzima.setToggleGroup(masa);
        this.finizzima.setUserData("Finízzima");
        this.dominosroll.setToggleGroup(masa);
        this.dominosroll.setUserData("Domino's Roll");
        this.cabraroll.setToggleGroup(masa);
        this.cabraroll.setUserData("Cabra & Roll");
        if (this.masa.getSelectedToggle().getUserData().equals("Original")) {
            sMasa = "Original";
            this.DescripcionMasa1.setText("Para aquellos amantes \n del auténtico sabor \n de la pizza Domino's");
            doublemasa = 1;
        }
        if (this.masa.getSelectedToggle().getUserData().equals("Pan")) {
            sMasa = "Pan";
            this.DescripcionMasa1.setText("Al más puro \n estilo Chicago");
            doublemasa = 1;
        }
        if (this.masa.getSelectedToggle().getUserData().equals("Finízzima")) {
            sMasa = "Finízzima";
            this.DescripcionMasa1.setText("La masa más \n fina y crujiente \n de Domino's");
            doublemasa = 1;
        }
        if (this.masa.getSelectedToggle().getUserData().equals("Domino's Roll")) {
            sMasa = "Domino's Roll";
            this.DescripcionMasa1.setText("Con delicioso borde \n relleno de queso");
            doublemasa = 2;
        }
        if (this.masa.getSelectedToggle().getUserData().equals("Cabra & Roll")) {
            sMasa = "Cabra & Roll";
            this.DescripcionMasa1.setText("Borde relleno de \n queso de cabra fundido");
            doublemasa = 2;
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
        choices.add("Cabramelizada");
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
        if (result.get().equals("Margarita")) {
            StipoPizza = "Margarita";
            doublePizza = 6;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cheesix")) {
            StipoPizza = "Cheesix";
            doublePizza = 8;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pulled Beef")) {
            StipoPizza = "Pulled Beef";
            doublePizza = 8;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pulled Pork")) {
            StipoPizza = "Pulled Pork";
            doublePizza = 8;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Barbacoa")) {
            StipoPizza = "Barbacoa";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pecado Carnal")) {
            StipoPizza = "Pecado Carnal";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cremozza BBQ")) {
            StipoPizza = "Cremozza BBQ";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cremozza Estilo Bourbon")) {
            StipoPizza = "Cremozza Estilo Bourbon";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Carbonara")) {
            StipoPizza = "Carbonara";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cabramelizada")) {
            StipoPizza = "Cabramelizada";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pollo a la Parrilla")) {
            StipoPizza = "Pollo a la Parrilla";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Cuatro Quesos")) {
            StipoPizza = "Cuatro Quesos";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Hawaiana Plus")) {
            StipoPizza = "Hawaiana Plus";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Extravaganzza")) {
            StipoPizza = "Extravaganzza";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Pata Negra")) {
            StipoPizza = "Pata Negra";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Campiña")) {
            StipoPizza = "Campiña";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
        if (result.get().equals("Tony Pepperoni")) {
            StipoPizza = "Tony Pepperoni";
            doublePizza = 7;
            this.labelPizza.setText("Tu elección: " + result.get());
        }
    }

    @FXML
    private void botonCalcularPedido(ActionEvent event) {
        DecimalFormat formato = new DecimalFormat("0.00");
        this.MasaElegida.setText(this.sMasa);
        this.pizzaElegida.setText(this.StipoPizza);
        this.tamañoElegido.setText(this.tamaño);
        for (String i : ingredientes) {
            this.seleccionIngredientes.appendText(i + "\n");
        }
        this.precioMasa.setText(formato.format(this.doublemasa) + "€");
        this.precioPizza.setText(formato.format(this.doublePizza) + "€");
        this.precioIngredientes.setText(formato.format(this.doubleIngrediente) + "€");
        this.precioTamaño.setText("" + this.multiplicadorTamaño);
        precioTotalDouble = (doublemasa + doublePizza + doubleIngrediente) * multiplicadorTamaño;
        this.precioTotal.setText(formato.format(this.precioTotalDouble) + "€");

    }

    @FXML
    private void seleccionTamaño(ActionEvent event) {
        String seleccion = desplegableTamaño.getValue();
        if (seleccion.equals("Pequeña")) {
            tamaño = "Pequeña";
            labelPersonas.setText("1");
            multiplicadorTamaño = 1.00;
        }
        if (seleccion.equals("Mediana")) {
            tamaño = "Mediana";
            labelPersonas.setText("2");
            multiplicadorTamaño = 1.15;
        }
        if (seleccion.equals("Familiar")) {
            tamaño = "Familiar";
            labelPersonas.setText("4");
            multiplicadorTamaño = 1.30;
        }
    }

    @FXML
    private void ingredientesExtra(ActionEvent event) {

        if (event.getSource() == this.ingredienteAceitunas) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Aceitunas Negras";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteAnchoas) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Anchoas";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteAtun) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Atún";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteCeballo) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Cebolla";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteCebolla) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Cebolla Caramelizada";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteChampinon) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Champiñón";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteJamonS) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Jamón Serrano";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteJamonY) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Jamón de York ";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteMaiz) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Maiz";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredientePepperoni) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Pepperoni";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredientePimientoV) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Pimiento Verde";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteTofu) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Tofu";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredienteTomate) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Tomate Natural";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredientebacon) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Bacon";
            ingredientes.add(stringIngrediente);
        }
        if (event.getSource() == this.ingredientePollo) {
            doubleIngrediente = doubleIngrediente + 1.85;
            stringIngrediente = "Pollo a la Parrilla";
            ingredientes.add(stringIngrediente);
        }

    }

    @FXML
    private void ResetPedido(ActionEvent event) {
        precioTotalDouble = 0;
        multiplicadorTamaño = 1.15;
        doublemasa = 0;
        doublePizza = 0;
        tamaño = "";
        doubleIngrediente = 0;
        StipoPizza = "";
        sMasa = "";

        ingredientes.removeAll(tiposTamano);

        this.labelPizza.setText("Selecciona tu pizza deseada");

        this.dominosroll.setCache(false);
        this.cabraroll.setCache(false);
        this.finizzima.setCache(false);
        this.original.setCache(false);
        this.pan.setCache(false);

        this.ingredienteAceitunas.setSelected(false);
        this.ingredienteAnchoas.setSelected(false);
        this.ingredienteAtun.setSelected(false);
        this.ingredienteCeballo.setSelected(false);
        this.ingredienteCebolla.setSelected(false);
        this.ingredienteChampinon.setSelected(false);
        this.ingredienteJamonS.setSelected(false);
        this.ingredienteJamonY.setSelected(false);
        this.ingredienteMaiz.setSelected(false);
        this.ingredientePepperoni.setSelected(false);
        this.ingredientePimientoV.setSelected(false);
        this.ingredientePollo.setSelected(false);
        this.ingredienteTernera.setSelected(false);
        this.ingredienteTofu.setSelected(false);
        this.ingredienteTomate.setSelected(false);
        this.ingredientebacon.setSelected(false);

        this.MasaElegida.setText("Tu masa");
        this.pizzaElegida.setText("Tu pizza");
        this.tamañoElegido.setText("Tu tamaño");
        this.seleccionIngredientes.setText("");
        this.precioMasa.setText("");
        this.precioPizza.setText("");
        this.precioIngredientes.setText("");
        this.precioTamaño.setText("");
        this.precioTotal.setText("");

        desplegableTamaño.setValue("Mediana");
        this.labelPersonas.setText("");

    }
}
