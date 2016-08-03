package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    public TextField Us;
    public PasswordField Pass;
    public Label LoginLabel;
    public Label CreateLabel;


    public void BtnGuardar(ActionEvent actionEvent) {
        String datos;
        String nombre = Us.getText();
        String contraseña = Pass.getText();
        datos = "Usuario: "+nombre+System.lineSeparator()+"Contraseña: "+contraseña;


        try {
            File archivo = new File("@Lista.txt");
            if (!archivo.exists()){
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(datos);
            bw.write(System.lineSeparator());
            bw.close();
            } catch (IOException e) {
            e.printStackTrace();
        }
            Borrar();
    }

    public void Newacc(ActionEvent actionEvent) {
        LoginLabel.setText(null);
        CreateLabel.setText("No está disponible");
    }

    public void UsTxt(ActionEvent actionEvent) {

    }

    public void PasTxt(ActionEvent actionEvent) {

    }

    public void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void Borrar(){
        Pass.setText(null);
        Us.setText(null);
        LoginLabel.setText("Datos almacenados");
        CreateLabel.setText(null);
    }

}
