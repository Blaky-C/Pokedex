package com.hfad.pokedex2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Card1MaterialFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView card1Recycler = (RecyclerView)inflater.inflate(R.layout.fragment_card1_material, container, false);

        String[] names = new String[Pokemon.pokes.length];
        String[] nums = new String[Pokemon.pokes.length];
        int[] cardImages = new int[Pokemon.pokes.length];
        for (int i=0;i<Pokemon.pokes.length;i++){
            names[i] = Pokemon.pokes[i].getName();
            nums[i] = "#"+Pokemon.pokes[i].getNumber();
            cardImages[i] = Pokemon.pokes[i].getTabImageId();
        }

        CardView1Adapter adapter = new CardView1Adapter(cardImages, nums, names);
        card1Recycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        card1Recycler.setLayoutManager(layoutManager);
        adapter.setListener(new CardView1Adapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), PokeDetailActivity.class);
                intent.putExtra("pokeNo", position);
                getActivity().startActivity(intent);
            }
        });

        return card1Recycler;
    }

}
