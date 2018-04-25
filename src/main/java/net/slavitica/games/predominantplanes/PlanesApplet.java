/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.slavitica.games.predominantplanes;
import net.slavitica.games.predominantplanes.scene.MenuScene;
import net.slavitica.games.predominantplanes.scene.SceneManager;
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
        int w = 1280;
        this.size(w, w / 16 * 9);
        SceneManager.Switch(new MenuScene(this));
    }
    
    public void setup() {
        this.background(0);
    }
    
    public void draw() {
        SceneManager.Draw();
    }
}
