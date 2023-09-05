package com.example.bartenvendor25;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {
    private Scene titleScene;

    private void ingrContent(){

    }

    private void recipeContent(){

    }

    private Parent mainContent(){
        HBox root = new HBox();
        root.setBackground(new Background(
                new BackgroundFill(
                        new LinearGradient(0, 0, 0, 1, true,
                                CycleMethod.NO_CYCLE,
                                new Stop(0, Color.web("#4568DC")),
                                new Stop(1, Color.web("#B06AB3"))
                        ), CornerRadii.EMPTY, Insets.EMPTY
                ),
                new BackgroundFill(
                        new RadialGradient(
                                0, 0, 0.5, 0.5, 0.5, true,
                                CycleMethod.NO_CYCLE,
                                new Stop(0, Color.web("#FFFFFF33")),
                                new Stop(1, Color.web("#00000033"))),
                        CornerRadii.EMPTY, Insets.EMPTY
                )
        ));
        root.setPrefSize(1280,720);
        Button ingrButt = new Button("Ingredients");
        ingrButt.setOnAction(e -> ingrContent());
        ingrButt.setPrefSize(root.getPrefWidth()/2,ingrButt.getHeight());
        Button recipeButt = new Button("Recipes");
        recipeButt.setOnAction(e -> recipeContent());
        recipeButt.setPrefSize(root.getPrefWidth()/2,recipeButt.getHeight());
        root.getChildren().addAll(ingrButt,recipeButt);
        return root;
    }


    @Override
    public void start(Stage stage) throws IOException {
        titleScene = new Scene(mainContent());
        stage.setScene(titleScene);
        stage.setResizable(false);
        stage.setTitle("BartenVendor 2.0");
        stage.getIcons().add(new Image("icon.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}