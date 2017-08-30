package com.hfad.pokedex2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Card2MaterialFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView card2Recycler = (RecyclerView)inflater.inflate(R.layout.fragment_card2_material, container, false);

        String[] names = new String[Pokemon.pokes.length];
        String[] nums = new String[Pokemon.pokes.length];
        int[] cardImages = new int[Pokemon.pokes.length];
        for (int i=0;i<Pokemon.pokes.length;i++){
            names[i] = Pokemon.pokes[i].getName();
            nums[i] = "#"+Pokemon.pokes[i].getNumber();
            cardImages[i] = Pokemon.pokes[i].getMoImageId();
        }

        CardView2Adapter adapter = new CardView2Adapter(cardImages, nums, names);
        card2Recycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        card2Recycler.setLayoutManager(layoutManager);
        adapter.setListener(new CardView2Adapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), PokeDetailActivity.class);
                intent.putExtra("pokeNo", position);
                getActivity().startActivity(intent);
            }
        });
        return card2Recycler;
    }

}
