package com.cswizard.deckbuilder.clashroyaledeckbuilder;

import java.util.ArrayList;

/**
 * Created by natha on 4/17/2017.
 */

public class Deck
{
    private Card[] deck = new Card[8];
    private int defenseScore = 0;
    private int offenseScore = 0;

    public Card[] buildDeck(ArrayList<Card> cards)
    {
        for(int i = 0; i < cards.size(); i++)
        {
            this.defenseScore += deck[i].getDefenseScore();
            this.offenseScore += deck[i].getOffenseScore();
        }
        while(cards.size() < 8)
        {
            Card nextCard = findBestSynergy(cards);
            cards.add(nextCard);
            this.defenseScore += nextCard.getDefenseScore();
            this.offenseScore += nextCard.getOffenseScore();
        }

        for(int i = 0; i < cards.size(); i++)
        {
            deck[i] = cards.get(i);
        }
        return deck;
    }

    private Card findBestSynergy(ArrayList<Card> cards)
    {
        Card bestMatch = null;
        if(this.defenseScore <= (double)this.offenseScore*(2.0/3.0))
        {
            bestMatch = null; //something defensive
        }
        else if(this.offenseScore <= (double)this.defenseScore*(2.0/3.0))
        {
            bestMatch = null; //something offensive
        }
        else
        {
            bestMatch = null; //something in the middle
        }
        return bestMatch;
    }
}
