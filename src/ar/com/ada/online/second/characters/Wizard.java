package ar.com.ada.online.second.characters;

public class Wizard extends Character {

    //ATRIBUTOS
    private Wand wand;


    //CONSTRUCTORES
    public Wizard() {
    }

    public Wizard(String name, Integer energyLevel, Integer magicLevel, String location, Wand wand) {
        super(name, energyLevel, magicLevel, location);
        this.wand = wand;
    }

    //GETTERS Y SETTERS

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }



    //METODO PROPIO DE CLASE
    public Boolean darkWizardOrNot() {
        return null;
    }


    //METODOS REDEFINIDOS

    @Override
    public void Attack() {



    }

    @Override
    public void Healing() {

    }

    @Override
    public void magicRecovery() {

    }

    @Override
    public void aliveOrNot() {

    }

    @Override
    public void addSpell() {

    }

    @Override
    public void characterStatus() {

    }
}

