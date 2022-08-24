/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.la_133_9954_pokemon;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Dario
 */
@Named(value = "controller")
@RequestScoped
public class Controller {

    public String changeEyes() {
        return "augenfarbe.xhtml";
    }

    public String changeHair() {
        return "haare.xhtml";
    }
    
    public String showAvatar(){
        return "avatar.xhtml";
    }
}
