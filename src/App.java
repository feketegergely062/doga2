import java.beans.EventHandler;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/*
* File: App.java
* Author: Fekete Gergely
* Copyright: 2023, Fekete Gergely
* Group: Szoft 1/N
* Date: 2023-04-18
* Github: https://github.com/feketegergely062/doga2
* Licenc: GNU GPL
*/

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

      @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();
        VBox vb1 = new VBox();
        HBox hb2 = new HBox();
        
        HBox hb1 = new HBox();
       
        
        
        TextField asiField = new TextField();
        hb2.getChildren().addAll(asiField);
        Label label1 = new Label("add meg a kocka átlóját");
        Label info = new Label("Fekete Gergely , 2023.04.18");
        Button button = new Button("eredmény");
        vb1.getChildren().add(info);
        vb1.getChildren().add(label1);
        vb1.getChildren().add(asiField);
        
        hb1.getChildren().add(button);
        
        vb1.getChildren().add(hb1);

        button.setOnAction(e ->{
            Double d = Double.valueOf(asiField.getText());
            Double res = 3*d / 2.82842712475;
            String str = Double.toString(res);
            Label eredmeny = new Label(str);
            hb1.getChildren().add(eredmeny);
            
        });

        
        
        
        Scene scene = new Scene(vb1,400,300);
        stage.setScene(scene);
        stage.show();
        
        
    }
}