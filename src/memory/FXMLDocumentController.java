/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import utilidades.bbdd.Bd;
import utilidades.bbdd.Gestor_conexion_POSTGRE;

/**
 *
 * @author Usuario
 */
public class FXMLDocumentController implements Initializable {
      public static void mostrar(String [][] vec){
        for(int i=0; i<vec.length; i++){
            for(int j=0; j<vec.length; j++)
                System.out.println(vec[i][j]+" ");
            System.out.println();
        }
    }
//    @FXML
//    private Label label;
//    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String vec[][];
        Gestor_conexion_POSTGRE gestor= new Gestor_conexion_POSTGRE("memory",true);
        vec=Bd.consultaSelect(gestor, "select * from jugadores");
        gestor.cerrar_Conexion(true);
        if(vec!=null)
            mostrar(vec);
        else
            System.out.println("vacio");
    }    
    
}
