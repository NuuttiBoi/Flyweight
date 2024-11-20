package org.example.flyweight;

public class SwampTile implements iTile {
    private TileGraphicFactory graphicFactory;
    public SwampTile(TileGraphicFactory graphicFactory) {
        this.graphicFactory = graphicFactory;  // Use the shared TileGraphicFactory instance
    }

    @Override
    public char getCharacter() {
        return 'S';  // Character representing the swamp
    }

    @Override
    public String getType() {
        return "swamp";
    }

    @Override
    public javafx.scene.Node getGraphic() {
        return graphicFactory.getTileGraphic("swamp");
    }
}
