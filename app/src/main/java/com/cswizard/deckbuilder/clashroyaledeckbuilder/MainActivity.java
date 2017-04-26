package com.cswizard.deckbuilder.clashroyaledeckbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity
{
    private HashMap<String, Card> cards;
    private final static String TAG = "DeckBuilder";
    private boolean cardSelected = false;
    private Card currentCard;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Card arrows = new Spell("Arrows", "common", 3, "Arrows peeper a large area, damaging " +
                "everyone hit. Reduced damage to Crown Towers.", R.drawable.arrows);

        Card bomber = new Troop("Bomber", "common", 3, "Small, lightly protected skeleton that " +
                "throws bombs. Deals area damage that can wipe out a swarm of enemies.",
                R.drawable.bomber);

        Card archers = new Troop("Archers", "common", 3, "A pair of lightly armored ranged " +
                "attackers. They'll help you take down ground and air units, but you're on your " +
                "own with hair coloring advice", R.drawable.archers);
        archers.setOther("count", 2);

        Card knight = new Troop("Knight", "common", 3, "A tough melee fighter. The Barbarian's " +
                "handsome, cultured cousin. Rumor has it that he was knighted based on the sheer " +
                "awesomeness of his mustache alone.", R.drawable.knight);

        Card fireball = new Spell("Fireball", "rare", 4, "Annnnnd... Fireball. Incinerates a " +
                "small area, dealing high damage. Reduced damage to Crown Towers",
                R.drawable.fireball);

        Card miniPEKKA = new Troop("Mini P.E.K.K.A", "rare", 4,"The arena is a certified " +
                "butterfly-free zone. No distractions for P.E.K.K.A, only destruction.",
                R.drawable.minipekka);

        Card musketeer = new Troop("Musketeer", "rare", 4, "Don't be fooled by her delicately " +
                "coiffed hair, the Musketeer is a mean shot with her trusty boomstick.",
                R.drawable.musketeer);

        Card giant = new Troop("Giant", "rare", 5, "Slow but durable, only attacks buildings. " +
                "A real one-man wrecking crew!", R.drawable.giant);

        Card prince = new Troop("Prince", "epic", 5, "Don't let the little pony fool you. Once " +
                "the Prince gets a running start, you WILL be trampled. Does 2x damage once he " +
                "gets charging.", R.drawable.prince);
        prince.setOther("charge", 2);

        Card babyDragon = new Troop("Baby Dragon", "epic", 4, "Flying troop that deals area " +
                "damage. Baby dragons hatch cute, hungry and ready for a barbeque.",
                R.drawable.babydragon);

        cards = new HashMap<>();
        cards.put(arrows.getName(), arrows);
        cards.put(bomber.getName(), bomber);
        cards.put(archers.getName(), archers);
        cards.put(knight.getName(), knight);
        cards.put(fireball.getName(), fireball);
        cards.put(miniPEKKA.getName(), miniPEKKA);
        cards.put(musketeer.getName(), musketeer);
        cards.put(babyDragon.getName(), babyDragon);


        GridView cardGrid = (GridView)findViewById(R.id.cardGridView);
        CardAdapter cardAdapter = new CardAdapter(this, cards.values());
        cardGrid.setAdapter(cardAdapter);

        cardGrid.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Card card = (Card)parent.getItemAtPosition(position);
                TextView text = (TextView)findViewById(R.id.cardDescription);
                if(cardSelected && currentCard.getName() == card.getName())
                {
                    cardSelected = false;
                    text.setText("");
                }
                else
                {
                    cardSelected = true;
                    currentCard = card;
                    text.setText(card.getDescription());
                }
            }
        });
    }
}