package ar.com.ada.online.second.characters;

import javax.swing.*;
import java.util.Random;

public class Wand extends Random {

    //ATRIBUTOS
    public String name;
    public Integer damageBoost;

    public Wand(){

    }

    //CONSTRUCTORES
    public Wand(String name, Integer damageBoost) {
        this.name = name;
        this.damageBoost = damageBoost;
    }

    //GETTERS Y SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamageBoost() {
        return damageBoost;
    }

    public void setDamageBoost(Integer damageBoost) {
        this.damageBoost = damageBoost;
    }

}
