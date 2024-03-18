/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Memory extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
         // Crear el mazo de cartas
        MazoCartas mazo = new MazoCartas();

        // Crear las cartas individuales
        Carta bart = new Carta("Bart", 1);
        Carta gafas = new Carta("Gafas", 2);
        Carta jimbo = new Carta("Jimbo", 3);
        Carta discoStu = new Carta("DiscoStu", 4);
        Carta jeff = new Carta("Jeff", 5);
        Carta nick = new Carta("Nick", 6);
        Carta frink = new Carta("Frink", 7);
        Carta nelson = new Carta("Nelson", 8);
        Carta comodin = new Carta("Comodin", 9);
        
        // Agregar las cartas al mazo
        mazo.agregarCarta(bart);
        mazo.agregarCarta(gafas);
        mazo.agregarCarta(jimbo);
        mazo.agregarCarta(discoStu);
        mazo.agregarCarta(jeff);
        mazo.agregarCarta(nick);
        mazo.agregarCarta(frink);
        mazo.agregarCarta(nelson);
        mazo.agregarCarta(comodin);
        
        // Barajar las cartas
        mazo.shuffle();
        
        // Imprimir las cartas barajadas
        ArrayList<Carta> cartasDelMazo = mazo.getCartas();
        for (int i = 0; i < cartasDelMazo.size(); i++) {
            Carta carta = cartasDelMazo.get(i);
              System.out.println(carta);
        }
    }
    
}
