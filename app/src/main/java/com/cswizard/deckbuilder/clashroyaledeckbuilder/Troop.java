package com.cswizard.deckbuilder.clashroyaledeckbuilder;

/**
 * Created by nathan on 2/5/17.
 */

public class Troop extends Card
{
    private int hitpoints;
    private int damage;
    private boolean areaDamage;
    private boolean targetsAir;
    private boolean targetsBuildings;
    private double range;
    private double dps;
    private double hitspeed;
    private String speed;
    private int deploytime;
    private boolean air;

    public Troop(String name, String rarity, int elixirCost, String description,
                 int resourceId, int hitpoints, int damage, boolean areaDamage, boolean targetsAir,
                 boolean targetsBuildings, double range, double hitspeed, String speed,
                 int deploytime, boolean air)
    {
        super(name, rarity, "troop", elixirCost, description, resourceId);
        this.hitpoints = hitpoints;
        this.damage = damage;
        this.areaDamage = areaDamage;
        this.targetsAir = targetsAir;
        this.targetsBuildings = targetsBuildings;
        this.range = range;
        this.dps = (double)damage/hitspeed;
        this.hitspeed = hitspeed;
        this.speed = speed;
        this.deploytime = deploytime;
        this.air = air;
    }
}
