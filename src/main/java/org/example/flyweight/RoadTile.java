package org.example.flyweight;

public class RoadTile implements iTile {
    private TileGraphicFactory graphicFactory;

    public RoadTile(TileGraphicFactory graphicFactory) {
        this.graphicFactory = graphicFactory;  // Use the shared TileGraphicFactory instance
    }

    @Override
    public char getCharacter() {
        return 'R';  // Character representation for RoadTile
    }

    @Override
    public String getType() {
        return "road";  // Type is "road"
    }

    @Override
    public javafx.scene.Node getGraphic() {
        // Get the graphic for the road type
        return graphicFactory.getTileGraphic("road");
    }
}
