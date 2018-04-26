/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.slavitica.games.predominantplanes;

import net.slavitica.games.predominantplanes.scene.MenuScene;
import net.slavitica.games.predominantplanes.scene.SceneManager;
import net.slavitica.games.predominantplanes.scene.SecondScene;
import processing.core.PApplet;
/**
 *
 * @author graham.weldon
 */
public class PlanesApplet extends PApplet {
    public static void main(String[] args) {
        PApplet.main("net.slavitica.games.predominantplanes.PlanesApplet");
    }
    
    public void settings() {
        SceneManager.Init(this);
        SceneManager.AddScene(new MenuScene(this), "Menu");
        SceneManager.AddScene(new SecondScene(this), "Second");
                
        int w = 640;
        this.size(w, w / 16 * 9);
        SceneManager.Switch("Menu");
    }
    
    public void draw() {
        SceneManager.Draw();
    }
    
    public void keyPressed() {
        SceneManager.KeyPressed();
    }
    public void keyReleased() {
        SceneManager.KeyReleased();
    }
}
