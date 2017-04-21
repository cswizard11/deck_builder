package com.cswizard.deckbuilder.clashroyaledeckbuilder;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nathan on 2/5/17.
 */

public abstract class Card
{
    private String name;
    private String rarity;
    private String type;
    private int elixirCost;
    private String description;
    private HashMap<String, Double> other;
    private int level;
    private int defenseScore;
    private int offenseScore;
    private ArrayList<Card> worksWellWith = new ArrayList<Card>();

    private int resourceId;

    public Card(String name, String rarity, String type, int elixirCost, String description, int resourceId)
    {
        this.name = name;
        this.rarity = rarity;
        this.type = type;
        this.elixirCost = elixirCost;
        this.description = description;
        this.other = new HashMap<>();
        this.level = 1;
        this.resourceId = resourceId;
    }

    public String getName()
    {
        return name;
    }

    public String getRarity()
    {
        return rarity;
    }

    public String getType()
    {
        return type;
    }

    public int getElixirCost()
    {
        return elixirCost;
    }

    public String getDescription()
    {
        return description;
    }

    public HashMap<String, Double> getOther()
    {
        return other;
    }

    public int getLevel()
    {
        return level;
    }

    public int getDefenseScore()
    {
        return defenseScore;
    }

    public int getOffenseScore()
    {
        return offenseScore;
    }

    public ArrayList<Card> getWorksWellWith()
    {
        return worksWellWith;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRarity(String rarity)
    {
        this.rarity = rarity;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setElixirCost(int elixirCost)
    {
        this.elixirCost = elixirCost;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setOther(String key, double value)
    {
        this.other.put(key, value);
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public void setDefenseScore()
    {
        this.defenseScore = defenseScore;
    }

    public void setOffenseScore()
    {
        this.defenseScore = offenseScore;
    }

    public double getOther(String key)
    {
        return this.other.get(key);
    }

    public int getResourceId()
    {
        return resourceId;
    }

    public void setResourceId(int resourceId)
    {
        this.resourceId = resourceId;
    }
}
