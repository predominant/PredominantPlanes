/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.slavitica.games.predominantplanes.scene;

/**
 *
 * @author graham.weldon
 */
public class SceneManager {
    public final static SceneManager Instance = new SceneManager();
    
    private Scene _currentScene;
    
    private SceneManager() {
        // Don't allow others to instantiate.
    }
    
    public static void Switch(Scene s) {
        SceneManager.Instance._currentScene = s;
    }
    
    public static void Draw() {
        Scene s = SceneManager.Instance._currentScene;
        if (s == null)
            return;
        
        if (s.ShouldSetup())
            s.Setup();
        
        s.Draw();
    }
}
