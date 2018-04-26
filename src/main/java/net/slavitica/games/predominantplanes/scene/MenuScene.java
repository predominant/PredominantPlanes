/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.slavitica.games.predominantplanes.scene;

import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author graham.weldon
 */
public class MenuScene extends Scene {
    PImage image = this.scene.loadImage("images/sunset.jpg");
    
    public MenuScene(PApplet p) {
        super(p);
    }
    
    @Override
    public void Draw() {
        this.scene.background(0);
        this.scene.image(this.image, 0, 0);
        this.scene.textSize(32);
        this.scene.text("Menu Scene", 50, 50);
    }
    
    @Override
    public void KeyReleased() {
        if (this.scene.key == ' ')
            SceneManager.Switch("Second");
    }
}
