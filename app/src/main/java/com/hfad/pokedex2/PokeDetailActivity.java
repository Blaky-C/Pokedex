package com.hfad.pokedex2;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class PokeDetailActivity extends AppCompatActivity {

    private ShareActionProvider shareActionProvider;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail, menu);

        TextView textView = (TextView)findViewById(R.id.info_name);
        CharSequence pokeName = textView.getText();
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, pokeName);
        shareActionProvider.setShareIntent(intent);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poke_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int pokeNo = (Integer)getIntent().getExtras().get("pokeNo");
        Pokemon pokemon =  Pokemon.pokes[pokeNo];
        String name = pokemon.getName();
        String num = "#"+pokemon.getNumber();
        int imageNo = pokemon.getRawImageId();
        String type = pokemon.getType();

        TextView nameView = (TextView)findViewById(R.id.info_name);
        TextView numView = (TextView)findViewById(R.id.info_num);
        ImageView imageView = (ImageView)findViewById(R.id.info_image);
        TextView typeView = (TextView)findViewById(R.id.info_type);

        nameView.setText(name);
        numView.setText(num);
        imageView.setImageDrawable(getResources().getDrawable(imageNo));
        imageView.setContentDescription(name);
        typeView.setText(type);
    }
}
