/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartoon;

import environment.Environment;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author it
 */
class SeaEnvironment extends Environment {
    private SpongeBob bob = new SpongeBob(new Point(200, 200), new Dimension(200, 300));
    
    public SeaEnvironment() {
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            if (bob.getSize().width == 200){
                bob.setSize(new Dimension(100, 150));
            } else {
                bob.setSize(new Dimension(200, 300));
            }
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
   
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (bob != null){
            bob.draw(graphics);
        } 
    }
    
}
