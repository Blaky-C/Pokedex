package com.hfad.pokedex2;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CardView2Adapter extends RecyclerView.Adapter<CardView2Adapter.ViewHolder>{

    private String[] numbers;
    private int[] cardImages;
    private String[] names;
    private Listener listener;

    public static interface Listener{
        public void onClick(int position);
    }

    public void setListener(Listener listener){
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }
    }

    public CardView2Adapter(int[] cardImages, String[] numbers, String[] names) {
        this.numbers = numbers;
        this.cardImages = cardImages;
        this.names = names;
    }

    @Override
    public CardView2Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view2, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.tab_image);
        TextView nameView = (TextView)cardView.findViewById(R.id.name_info);
        TextView numView = (TextView)cardView.findViewById(R.id.id_info);

        Drawable drawable = cardView.getResources().getDrawable(cardImages[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(names[position]);
        nameView.setText(names[position]);
        numView.setText(numbers[position]);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null){
                    listener.onClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return numbers.length;
    }
}
