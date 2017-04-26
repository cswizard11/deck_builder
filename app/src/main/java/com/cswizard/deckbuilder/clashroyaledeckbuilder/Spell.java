package com.cswizard.deckbuilder.clashroyaledeckbuilder;

/**
 * Created by nathan on 2/5/17.
 */

public class Spell extends Card
{
    int damage;
    int crownTowerDamage;
    double radius;

    public Spell(String name, String rarity, int elixirCost, String description, int resourceId)
    {
        super(name, rarity, "spell", elixirCost, description, resourceId);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCrownTowerDamage() {
        return crownTowerDamage;
    }

    public void setCrownTowerDamage(int crownTowerDamage) {
        this.crownTowerDamage = crownTowerDamage;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
