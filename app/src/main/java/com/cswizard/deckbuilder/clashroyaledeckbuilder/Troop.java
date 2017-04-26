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

    public Troop(String name, String rarity, int elixirCost, String description, int resourceId)
    {
        super(name, rarity, "troop", elixirCost, description, resourceId);
    }

    public int getHitpoints()
    {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints)
    {
        this.hitpoints = hitpoints;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public boolean isAreaDamage()
    {
        return areaDamage;
    }

    public void setAreaDamage(boolean areaDamage)
    {
        this.areaDamage = areaDamage;
    }

    public boolean isTargetsAir()
    {
        return targetsAir;
    }

    public void setTargetsAir(boolean targetsAir)
    {
        this.targetsAir = targetsAir;
    }

    public boolean isTargetsBuildings()
    {
        return targetsBuildings;
    }

    public void setTargetsBuildings(boolean targetsBuildings)
    {
        this.targetsBuildings = targetsBuildings;
    }

    public double getRange()
    {
        return range;
    }

    public void setRange(double range)
    {
        this.range = range;
    }

    public double getDps()
    {
        return dps;
    }

    public void setDps(double dps)
    {
        this.dps = dps;
    }

    public double getHitspeed()
    {
        return hitspeed;
    }

    public void setHitspeed(double hitspeed)
    {
        this.hitspeed = hitspeed;
    }

    public String getSpeed()
    {
        return speed;
    }

    public void setSpeed(String speed)
    {
        this.speed = speed;
    }

    public int getDeploytime()
    {
        return deploytime;
    }

    public void setDeploytime(int deploytime)
    {
        this.deploytime = deploytime;
    }

    public boolean isAir()
    {
        return air;
    }

    public void setAir(boolean air)
    {
        this.air = air;
    }
}
