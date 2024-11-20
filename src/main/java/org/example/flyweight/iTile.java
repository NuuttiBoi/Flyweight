package org.example.flyweight;

public interface iTile {
    char getCharacter();  // Returns the character representation
    String getType();     // Returns the name of the tile type
    javafx.scene.Node getGraphic();  // Returns the graphical representation (JavaFX Node)
}
