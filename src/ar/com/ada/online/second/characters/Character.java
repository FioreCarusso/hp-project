package ar.com.ada.online.second.characters;

import java.util.ArrayList;

public abstract class Character {

    //ATRIBUTOS

    protected String name;
    protected Integer energyLevel;
    protected Integer magicLevel;
    protected String location;


    //CONSTRUCTOR
    public Character() {
    }

    //SOBRECARGA CONSTRUCTOR
    public Character(String name, Integer energyLevel, Integer magicLevel, String location) {
        this.name = name;
        this.energyLevel = energyLevel;
        this.magicLevel = magicLevel;
        this.location = location;
    }

    //ArrayList<String> nombreArrayList = new ArrayList<String>();
    //nombreArrayList.add("Elemento");

    //LISTA DE HECHIZOS DEL PERSONAJE
    ArrayList<String> spellList = new ArrayList<String>();


    //GETTERS Y SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Integer getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(Integer magicLevel) {
        this.magicLevel = magicLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //METODOS ABSTRACTOS

    public abstract void Attack();

    public abstract void Healing();        //RECUPERA VIDA

    public abstract void magicRecovery();      //RECUPERA MAGIA

    public abstract void aliveOrNot();

    public abstract void addSpell();

    public abstract void characterStatus();
}
