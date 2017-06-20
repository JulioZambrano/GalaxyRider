
package Game;

import Controller.KeyboardController;
import java.awt.Color;

/**
 *
 * @JulioZambrano
 * https://github.com/JulioZambrano/GalaxyRider
 */
public abstract class ControlledGameObject extends GameObject implements Moveable {
    
    KeyboardController control;
    
    // Constructor for any controllable object
    public ControlledGameObject(int xPosition, int yPosition, Color color, KeyboardController control)
    {
        super(xPosition, yPosition, color);
        this.control = control;
    }
}
