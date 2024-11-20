package org.example.flyweight;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TileGraphicFactory {
    private double tileWidth;
    private double tileHeight;

    // Constructor to accept tile size
    public TileGraphicFactory(double tileWidth, double tileHeight) {
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
    }

    // Method to get a tile graphic (creates a new Node each time)
    public Node getTileGraphic(String tileType) {
        return createTileGraphic(tileType);
    }

    private Node createTileGraphic(String tileType) {
        // Create different graphics based on tile type (you can use images or shapes)
        switch (tileType) {
            case "swamp":
                return createRectangle(Color.GREEN);
            case "water":
                return createRectangle(Color.BLUE);
            case "road":
                return createRectangle(Color.GRAY);
            case "forest":
                return createRectangle(Color.DARKGREEN);
            case "building":
                return createRectangle(Color.BROWN);
            default:
                return createRectangle(Color.WHITE);  // Default for unknown types
        }
    }

    private Rectangle createRectangle(Color color) {
        // Create a simple rectangle for tile representation
        Rectangle rectangle = new Rectangle(tileWidth, tileHeight);  // Use the provided tile size
        rectangle.setFill(color);
        return rectangle;
    }
}
