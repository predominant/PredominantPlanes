/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.slavitica.games.predominantplanes.scene;

import java.util.HashMap;
import java.util.Stack;
import processing.core.PApplet;

/**
 *
 * @author graham.weldon
 */
public class SceneManager {
    public final static SceneManager Instance = new SceneManager();
    
    private PApplet _applet;
    private Scene _currentScene;
    private HashMap<String, Scene> _scenes = new HashMap<>();
    private Stack<Scene> _sceneStack = new Stack<>();
    
    private SceneManager() {
        // Don't allow others to instantiate.
    }
    
    public static void Init(PApplet p) {
        SceneManager.Instance._applet = p;
    }
    
    public static void AddScene(Scene s, String name) {
        SceneManager.Instance._scenes.put(name, s);
    }
    
    public static void Switch(String s) {
        Scene next = SceneManager.Instance._scenes.get(s);

        if (next == null) {
            System.out.println("Invalid scene was requested");
            return;
        }
        
        SceneManager.Instance._sceneStack.push(next);
        SceneManager.Instance._currentScene = next;
    }
    
    public static void Previous() {
        SceneManager.Instance._sceneStack.pop();
        SceneManager.Instance._currentScene = SceneManager.Instance._sceneStack.peek();
    }
    
    public static void Draw() {
        Scene s = SceneManager.Instance._currentScene;
        if (s == null)
            return;
        
        if (s.ShouldSetup())
            s.Setup();
        
        s.Draw();
    }
    
    public static void KeyPressed() {
        Scene s = SceneManager.Instance._currentScene;
        if (s == null)
            return;
        
        s.KeyPressed();
    }
    
    public static void KeyReleased() {
        Scene s = SceneManager.Instance._currentScene;
        if (s == null)
            return;
        
        s.KeyReleased();
    }
}
