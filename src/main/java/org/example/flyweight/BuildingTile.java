package org.example.flyweight;

public class BuildingTile implements iTile {
    private TileGraphicFactory graphicFactory;

    public BuildingTile(TileGraphicFactory graphicFactory) {
        this.graphicFactory = graphicFactory;  // Use the shared TileGraphicFactory instance
    }

    @Override
    public char getCharacter() {
        return 'B';  // Character representation for BuildingTile
    }

    @Override
    public String getType() {
        return "building";  // Type is "building"
    }

    @Override
    public javafx.scene.Node getGraphic() {
        // Get the graphic for the building type
        return graphicFactory.getTileGraphic("building");
    }
}
