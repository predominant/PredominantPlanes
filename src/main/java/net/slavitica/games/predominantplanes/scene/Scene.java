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
public abstract class Scene {
    public Boolean HasSetup = false;
    public Boolean SetupComplete = false;
    
    protected PApplet scene;
    
    public Scene(PApplet p) {
        this.scene = p;
    }
    
    public Boolean ShouldSetup() {
        return this.HasSetup && !this.SetupComplete;
    }
    
    public void Setup() {
    }
    
    public void Draw() {
    }
}
