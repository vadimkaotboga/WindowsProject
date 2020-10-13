import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.InputStream;

public class Program extends Application {

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("vadimkaotboga");
        primaryStage.setWidth(500);
        primaryStage.setHeight(650);

        InputStream iconStrim = getClass().getResourceAsStream("untitled.png");
        Image image = new Image(iconStrim);
        primaryStage.getIcons().add(image);

        Pane root = new Pane();
        Font txtFont = new Font(20);


        Label label = new Label("Name");
        label.setFont(new Font(20));

        TextField textField = new TextField();
        textField.setLayoutX(0);
        textField.setLayoutY(75);

        Button btn = new Button("EzClick");
        btn.setLayoutX(150);
        btn.setLayoutY(200);
        btn.setPrefSize(70,20);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String tmp = textField.getText();
                String text = "is not found";
                if (!tmp.isEmpty()){
                    label.setText("Name " + tmp);
                } else {
                    label.setText("Name " + text);
                }


            }
        });

        Scene scene = new Scene(root);



        root.getChildren().add(label);
        primaryStage.setScene(scene);
        root.getChildren().add(btn);
        primaryStage.show();
        root.getChildren().add(textField);
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
