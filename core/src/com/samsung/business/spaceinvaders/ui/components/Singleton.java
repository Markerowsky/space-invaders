package com.samsung.business.spaceinvaders.ui.components;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;


public class Singleton {
    private static Singleton instance = null;
    private Preferences perfs = null;
    protected Singleton (){
        perfs = Gdx.app.getPreferences("Preferences");
    }

    public static Singleton getInstance() {
    if(instance == null) {
        instance = new Singleton();
    }
    return instance;

    }
    public int setResult(int wynik){
        return perfs.getInteger("TopScore");
    }
}
