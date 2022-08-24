/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.la_133_9954_pokemon;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Dario
 */
@Named(value = "managedBean")
@SessionScoped
public class ManagedBean implements Serializable {

    private String hair;
    private String eyes;
    private String skin;
    private String selection;

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }
    
    public String getSelection(){
        if (hair.equals("b")){
            selection = "Blond Hair; ";
        } else {
            selection = "Black Hair; ";
        }
        if (eyes.equals("g")){
            selection += "Green Eyes; ";
        } else {
            selection += "Blue Eyes; ";
        }
        if (skin.equals("h")){
            selection += "Light Skin";
        } else {
            selection += "Dark Skin";
        }
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
}
