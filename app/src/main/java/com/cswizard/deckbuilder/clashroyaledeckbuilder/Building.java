package com.cswizard.deckbuilder.clashroyaledeckbuilder;

/**
 * Created by nathan on 2/5/17.
 */

public class Building extends Card
{
    private int hitpoints;
    private String lifetime;
    private String deploytime;

    public Building(String name, String rarity, int elixirCost, String description, int resourceId,
                    int hitpoints, String lifetime, String deploytime)
    {
        super(name, rarity, "building", elixirCost, description, resourceId);
        this.hitpoints = hitpoints;
        this.lifetime = lifetime;
        this.deploytime = deploytime;
    }
}
