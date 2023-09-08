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
    private Stage localStage;
    private static final int mainMenuNumber = 1;
    private static final int recipeMenuNumber = 2;
    private static final int ingrMenuNumber = 3;

    @Override
    public void start(Stage stage) throws IOException {
        localStage = stage;
        titleScene = new Scene(generateMainContent());
        localStage.setScene(titleScene);
        localStage.setResizable(false);
        localStage.setTitle("BartenVendor 2.0");
        localStage.getIcons().add(new Image("icon.png"));
        localStage.show();
    }

    //returns new HBox on which upon the whole scene must be built
    private HBox makeBackground(){
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
        return root;
    }

    private void loadScene(int scene){
        // scene 1 = Main menu
        // scene 2 = Recipe menu
        // scene 3 = Ingredients menu
        if(scene == 1){
            titleScene = new Scene(generateMainContent());
        }
        else if (scene == 2){
            titleScene = new Scene(generateRecipeContent());
        }
        else if (scene == 3){
            titleScene = new Scene(generateIngredientContent());
        }
        localStage.setScene(titleScene);
        localStage.show();
    }

    private Parent generateIngredientContent(){
        HBox root = makeBackground();
        Button menuButt = new Button("Main Menu");
        menuButt.setOnAction(e -> loadScene(mainMenuNumber));
        menuButt.setPrefSize(root.getPrefWidth()/2,menuButt.getHeight());
        Button recipeButt = new Button("Recipes");
        recipeButt.setOnAction(e -> loadScene(recipeMenuNumber));
        recipeButt.setPrefSize(root.getPrefWidth()/2,recipeButt.getHeight());
        root.getChildren().addAll(menuButt,recipeButt);
        return root;
    }

    private Parent generateRecipeContent(){
        HBox root = makeBackground();
        Button ingrButt = new Button("Ingredients");
        ingrButt.setOnAction(e -> loadScene(ingrMenuNumber));
        ingrButt.setPrefSize(root.getPrefWidth()/2,ingrButt.getHeight());
        Button menuButt = new Button("Main Menu");
        menuButt.setOnAction(e -> loadScene(mainMenuNumber));
        menuButt.setPrefSize(root.getPrefWidth()/2,menuButt.getHeight());
        root.getChildren().addAll(ingrButt, menuButt);
        return root;
    }

    private Parent generateMainContent(){
        HBox root = makeBackground();
        Button ingrButt = new Button("Ingredients");
        ingrButt.setOnAction(e -> loadScene(ingrMenuNumber));
        ingrButt.setPrefSize(root.getPrefWidth()/2,ingrButt.getHeight());
        Button recipeButt = new Button("Recipes");
        recipeButt.setOnAction(e -> loadScene(recipeMenuNumber));
        recipeButt.setPrefSize(root.getPrefWidth()/2,recipeButt.getHeight());
        root.getChildren().addAll(ingrButt,recipeButt);
        return root;
    }

    public static void main(String[] args) {
        launch(args);
    }
}