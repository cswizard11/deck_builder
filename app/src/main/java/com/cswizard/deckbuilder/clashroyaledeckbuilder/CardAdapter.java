package com.cswizard.deckbuilder.clashroyaledeckbuilder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.Collection;

/**
 * Created by nathan on 2/25/17.
 */

public class CardAdapter extends ArrayAdapter<Card>
{
    public CardAdapter(Context context, Collection<Card> cards)
    {
        super(context, 0);
        addAll(cards);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Card card = getItem(position);
        ImageView cardImage = new ImageView(getContext());

        cardImage.setImageResource(card.getResourceId());
        cardImage.setAdjustViewBounds(true);
        //cardImage.setScaleType(ImageView.ScaleType.CENTER);
        cardImage.setMaxHeight(130);
        cardImage.setMaxWidth(130);
        return cardImage;
    }
}
