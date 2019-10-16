/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class AnonymousInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button nuevo = new Button("New");
        nuevo.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent nuevo) {
                System.out.println("Nuevo Proceso");
            }
        });
        
        Button abrir = new Button("Open");
        abrir.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent nuevo) {
                System.out.println("Abrir Proceso");
            }
        });
        
        Button guardar = new Button("Save");
        guardar.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent nuevo) {
                System.out.println("Guardar Proceso");
            }
        });
        
        Button imprimir = new Button("Print");
        imprimir.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent nuevo) {
                System.out.println("Imprimir Proceso");
            }
        });
        HBox hbox = new HBox();
        hbox.setSpacing(5.0);
        hbox.setAlignment(Pos.CENTER);
        
        
        hbox.getChildren().addAll(nuevo,abrir,guardar,imprimir);
        
        Scene scene = new Scene(hbox, 300, 100);
        
        primaryStage.setTitle("Anonymous Inner Class");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
