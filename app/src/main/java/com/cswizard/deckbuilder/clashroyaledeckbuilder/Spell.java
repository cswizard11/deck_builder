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

    public Spell(String name, String rarity, int elixirCost, String description, int resourceId,
                 int damage, int crownTowerDamage, double radius)
    {
        super(name, rarity, "spell", elixirCost, description, resourceId);
        this.damage = damage;
        this.crownTowerDamage = crownTowerDamage;
        this.radius = radius;
    }
}
