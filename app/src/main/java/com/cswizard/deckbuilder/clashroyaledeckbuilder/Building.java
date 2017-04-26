package com.cswizard.deckbuilder.clashroyaledeckbuilder;

/**
 * Created by nathan on 2/5/17.
 */

public class Building extends Card
{
    private int hitpoints;
    private String lifetime;
    private String deploytime;

    public Building(String name, String rarity, int elixirCost, String description, int resourceId)
    {
        super(name, rarity, "building", elixirCost, description, resourceId);
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }

    public String getDeploytime() {
        return deploytime;
    }

    public void setDeploytime(String deploytime) {
        this.deploytime = deploytime;
    }
}
