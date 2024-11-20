package org.example.flyweight;

public class ForestTile implements iTile {
    private TileGraphicFactory graphicFactory;
    public ForestTile(TileGraphicFactory graphicFactory) {
        this.graphicFactory = graphicFactory;  // Use the shared TileGraphicFactory instance
    }

    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getType() {
        return "forest";
    }
    @Override
    public javafx.scene.Node getGraphic() {
        return graphicFactory.getTileGraphic("swamp");
    }
}
