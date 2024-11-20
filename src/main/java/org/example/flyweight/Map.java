package org.example.flyweight;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public abstract class Map {
    protected iTile[][] tiles;
    protected final TileGraphicFactory graphicFactory; // Use instance variable
    private int rows, columns;

    public Map(int rows, int cols, double tileWidth, double tileHeight) {
        this.columns = cols;
        this.rows = rows;
        this.tiles = new iTile[rows][cols];
        this.graphicFactory = new TileGraphicFactory(tileWidth, tileHeight);  // Create a new factory
        generateMap();
    }

    // Abstract method for creating a new tile
    public abstract iTile createTile();

    // Generate the map with tiles
    private void generateMap() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tiles[i][j] = createTile();  // Safely create tiles
            }
        }
    }

    // Render the map using JavaFX
    public GridPane renderMap() {
        GridPane grid = new GridPane();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                iTile tile = tiles[row][col];
                String tileType = tile.getType();

                // Create a new graphical representation for each tile
                Node tileNode = graphicFactory.getTileGraphic(tileType);
                if (tileNode == null) {
                    throw new IllegalStateException("Graphic factory returned null for tile type: " + tileType);
                }
                grid.add(tileNode, col, row);  // Add to GridPane at the correct position
            }
        }
        return grid;
    }
}
