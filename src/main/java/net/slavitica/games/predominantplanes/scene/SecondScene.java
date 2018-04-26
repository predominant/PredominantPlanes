/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.slavitica.games.predominantplanes.scene;

import processing.core.PApplet;

/**
 *
 * @author graham.weldon
 */
public class SecondScene extends Scene {
    
    public SecondScene(PApplet p) {
        super(p);
    }

    @Override
    public void Draw() {
        this.scene.background(120,0,255, 255);
        this.scene.text("Second Scene", 50, 50);
    }

    @Override
    public void KeyReleased() {
        SceneManager.Switch("Menu");
    }
}
