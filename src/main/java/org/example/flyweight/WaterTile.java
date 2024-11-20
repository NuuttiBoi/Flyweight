package org.example.flyweight;

public class WaterTile implements iTile {
    private TileGraphicFactory graphicFactory;
    public WaterTile(TileGraphicFactory graphicFactory) {
        this.graphicFactory = graphicFactory;  // Use the shared TileGraphicFactory instance
    }

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "water";
    }
    @Override
    public javafx.scene.Node getGraphic() {
        return graphicFactory.getTileGraphic("swamp");
    }
}
