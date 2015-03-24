package com.censon.ken.hangout;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showSubmenu(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Beef Brisket")) {
            Intent intent = new Intent(this, BeefBrisketActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Chicken Teriyaki")) {
            Intent intent = new Intent(this, ChickenTeriyakiActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Lomi")) {
            Intent intent = new Intent(this, LomiActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Nachos")) {
            Intent intent = new Intent(this, NachosActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Potato Casserole")) {
            Intent intent = new Intent(this, PotatoCasseroleActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Sisig")) {
            Intent intent = new Intent(this, SisigActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Spaghetti")) {
            Intent intent = new Intent(this, SpaghettiActivity.class);
            startActivity(intent);
        } else if (button_text.equals("Spam Musubi")) {
            Intent intent = new Intent(this, SpamMusubiActivity.class);
            startActivity(intent);
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
