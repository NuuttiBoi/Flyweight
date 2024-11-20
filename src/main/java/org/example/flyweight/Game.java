package org.example.flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Game extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TileGraphicFactory graphicFactory = new TileGraphicFactory(50, 50); // Tile size: 50x50
        Map map = new CityMap(10, 10,graphicFactory);  // Pass factory to CityMap

        // Render the map
        StackPane root = new StackPane();
        root.getChildren().add(map.renderMap());

        // Set up the stage and show the scene
        Scene scene = new Scene(root, 500, 500);  // Size for the window
        primaryStage.setTitle("RPG Map");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
