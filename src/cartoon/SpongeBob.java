/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartoon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author it
 */
public class SpongeBob {
    
    
    void draw(Graphics graphics) {
        graphics.drawOval(position.x, position.y, 2, 2);
        graphics.drawOval(position.x, position.y + size.height, 2, 2);
        graphics.drawOval(position.x + size.width, position.y, 2, 2);
        graphics.drawOval(position.x + size.width, position.y + size.height, 2, 2);
        
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(position.x + (size.width * 2 / 10), position.y, size.width * 6 / 10, size.height * 5 / 10);
    }

   public SpongeBob(Point position, Dimension size){
       this.position = position;
       this.size = size;
   }
    
    
    private Dimension size;
    private Point position;
    
    /**
     * @return the size
     */
    public Dimension getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Dimension size) {
        this.size = size;
    }

    /**
     * @return the position
     */
    public Point getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }
    
}
