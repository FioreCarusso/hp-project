package ar.com.ada.online.second.characters;

public abstract class Wand {

    public String name;
    public Integer damageBoost;

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
