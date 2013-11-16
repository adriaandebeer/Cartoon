/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartoon;

import environment.ApplicationStarter;

/**
 *
 * @author it
 */
public class Cartoon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("Bob", new SeaEnvironment());
    
    }
    
}
