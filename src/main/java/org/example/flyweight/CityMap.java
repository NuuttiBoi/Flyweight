package org.example.flyweight;

import java.util.Random;

public class CityMap extends Map {
    private static TileGraphicFactory factory = new TileGraphicFactory(50,50);
    private static final iTile[] TILES = {new BuildingTile(factory), new ForestTile(factory), new RoadTile(factory),
    new SwampTile(factory), new WaterTile(factory)};
    private Random random; // Class-level field for reuse

    public CityMap(int width, int height, TileGraphicFactory graphicFactory) {
        super(width, height, 50, 50); // Pass required arguments to the superclass
        System.out.println(TILES.length);
    }

    @Override
    public iTile createTile() {
        random = new Random();
        int index = random.nextInt(TILES.length); // Randomly select a tile type
        return TILES[index]; // Return a shared tile instance
    }
}
