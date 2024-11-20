package org.example.flyweight;

import java.util.Random;

public class WildernessMap extends Map {
    private iTile[] TILES;  // Remove static modifier to allow dynamic initialization
    private Random random;

    // Pass the shared TileGraphicFactory instance through the constructor
    public WildernessMap(int width, int height, TileGraphicFactory graphicFactory) {
        super(width, height, 50, 50);
        this.random = new Random();

        // Initialize TILES dynamically using the provided graphicFactory
        TILES = new iTile[]{
                new SwampTile(graphicFactory),
                new WaterTile(graphicFactory),
                new ForestTile(graphicFactory)
        };
    }

    @Override
    public iTile createTile() {
        int index = random.nextInt(TILES.length);
        return TILES[index];
    }
}
